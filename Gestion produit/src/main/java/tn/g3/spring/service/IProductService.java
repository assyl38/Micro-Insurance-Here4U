package tn.g3.spring.service;


import tn.g3.spring.entity.Product;

public interface IProductService {
	Product addProduct(Product product);
	void deleteProduct(long idProduct);
	Product updateProduct(Product product);
	Product retrieveProduct(long idProduct);
	Product retrieveProductByDescription(String description);
	//void assignProductUser(long idProduct, long user_ID);
}
