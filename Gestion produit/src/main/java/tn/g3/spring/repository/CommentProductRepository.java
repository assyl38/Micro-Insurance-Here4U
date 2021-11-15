package tn.g3.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tn.g3.spring.entity.CommentProduct;

@Repository
public interface CommentProductRepository extends JpaRepository <CommentProduct, Long> {
	//  List<CommentProduct> getAllByBookId(@Param("idProduct") int idProduct);

}
