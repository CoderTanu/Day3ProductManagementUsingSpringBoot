package DEMO.Product_Management_APP;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdDB extends JpaRepository<Product, Integer>{

	

	
}
