package tn.g3.spring.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import tn.g3.spring.entity.Product;
@Repository
public interface ProductRepository extends JpaRepository<Product,Long>
{
	@Query("SELECT p FROM Product p WHERE p.descriptionProduct like  %?1% ")
	Product findByDescription(String descriptionProduct);
	 
	@Query("SELECT p FROM Product p WHERE p.idProduct =:idProduct ") 
	Product findById(@Param(value="idProduct") long idProduct);


}
