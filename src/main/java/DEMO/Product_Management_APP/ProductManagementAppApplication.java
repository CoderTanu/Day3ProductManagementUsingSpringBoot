package DEMO.Product_Management_APP;

import java.util.List;
import java.util.Optional;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ProductManagementAppApplication {

	public static void main(String[] args) {
		ApplicationContext context =SpringApplication.run(ProductManagementAppApplication.class, args);
		
		ProductService service =context.getBean(ProductService.class);
		
	
		List<Product> data= service.getAllProduct();
		long datava= service.getProductCount();
     	System.out.println("Number of data inside table product is :" +datava);
		for(Product p:data) {
			System.out.println(p);
		}
		//1.
		System.out.println("These are all list of Product present in your DB:");
		List<Product> allP=service.getAllProduct();
		for(Product newAllP :allP) {
		System.out.println(newAllP);
		}
		//2.
		System.out.println("Your data is saved in DB!");
		Product datasaved=service.saveDatainProduct();
		System.out.println(datasaved);
		
		//3.
		
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the product Name:");
		String name = sc.next();
		Product namePro= service.getProductByName(name);
		System.out.println(namePro);
		System.out.println("This is your Requested product name");
		//4.
	    System.out.println("Enter the product Place:");
		String place = sc.next();
	    List<Product>  placepro=service.getProductByPlace(place);
	    for(Product p :placepro) {
		System.out.println(p);
	    }
	    System.out.println("This is your requested product place");
	    //5.
		
		 System.out.println("Enter the product Name or Place or TypeOfProduct:");
		 String text = sc.next();
		 List<Product> textP=service.getProductWithText(text);
		 for(Product textProduct :textP) {
			System.out.println(textProduct);
		}
		 System.out.println("This is your requested text from  product'DB");
			
        //6.
		 System.out.println("Enter the product Warranty  year: ");
		 int year = sc.nextInt();
		List<Product> exWarranty=service.getProductByOutOfWarranty(2022);
		for(Product WarrantyProduct :exWarranty) {
			System.out.println(WarrantyProduct);
		}
		System.out.println("Your product is Expired!");
		
		
		   
	}

}
