package DEMO.Product_Management_APP;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;



@Service
public class ProductService{
	
	 @Autowired
     private ProdDB db;
	

	
	     //1.for getting all product
    	  public List<Product> getAllProduct(){
	    	return db.findAll();
	  }

        // 2. By using Stream API start in spring boot 
		public Product saveDatainProduct() {
			Product product = new Product("Redmi","Cable","Desk",2021);
		    return db.save(product);
		}
    	  
        //3. for getting the count of product
		public long getProductCount() {
			return db.count();
		}
		
		
		  //4.for getting the specific product
			public Product getProductByName(String name) {
				return db.findAll().stream()
						.filter(p -> p.getName().equalsIgnoreCase(name))
						.findFirst().orElse(null);
			}

			//5. for getting the product with text
			
			public List<Product> getProductWithText(String text) {
			
				return db.findAll().stream().filter(p -> (p.getName().toLowerCase()).contains(text.toLowerCase()) ||
									     (p.getTypeOfProduct().toLowerCase()).contains(text.toLowerCase())||
									     (p.getPlace().toLowerCase()).contains(text.toLowerCase()))
							.collect(Collectors.toList());
				  
			}

			// 6. for getting product by searching place
			public List<Product> getProductByPlace(String place) {
				return db.findAll().stream()
							.filter(p ->(p.getPlace().toLowerCase()).contains(place.toLowerCase()))
							.collect(Collectors.toList());
				   
				    
			}
			// 7. for getting product which is out of warranty 
			public List<Product> getProductByOutOfWarranty(int year) {
				  
				 return db.findAll().stream()
							.filter(p ->(p.getWarranty() == year))
							.collect(Collectors.toList());
			}
			
			
			
	
		
		
		
}
