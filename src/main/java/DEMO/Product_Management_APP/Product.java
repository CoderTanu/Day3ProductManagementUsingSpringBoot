package DEMO.Product_Management_APP;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name= "product")
public class Product {
	@Id
//   @GeneratedValue(strategy = GenerationType.IDENTITY)
	//private int productId;
	private String name;
	private String typeOfProduct;
	private String place;
	private int warranty;
	
	public Product() {
		
	}
	
	
	public Product(String name, String typeOfProduct, String place, int warranty) {
     //	this.productId = productId;
		this.name = name;
		this.typeOfProduct = typeOfProduct;
		this.place = place;
		this.warranty = warranty;
	}


//	public int getProductId() {
//		return productId;
//	}
//
//
//	public void setProductId(int productId) {
//		this.productId = productId;
//	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getTypeOfProduct() {
		return typeOfProduct;
	}


	public void setTypeOfProduct(String typeOfProduct) {
		this.typeOfProduct = typeOfProduct;
	}


	public String getPlace() {
		return place;
	}


	public void setPlace(String place) {
		this.place = place;
	}


	public int getWarranty() {
		return warranty;
	}


	public void setWarranty(int warranty) {
		this.warranty = warranty;
	}


	@Override
	public String toString() {
		return "Product [name=" + name + ", typeOfProduct=" + typeOfProduct + ", place="
				+ place + ", warranty=" + warranty + "]";
	}
	

	
	
	

}
