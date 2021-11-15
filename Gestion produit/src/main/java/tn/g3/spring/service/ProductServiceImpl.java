package tn.g3.spring.service;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.g3.spring.entity.*;
import tn.g3.spring.repository.ProductRepository;

@Service
public class ProductServiceImpl implements IProductService{
	@Autowired
	ProductRepository productRepo;
	//@Autowired 
	//PersonRepository personRepo;
	private static final Logger L= LogManager.getLogger(ProductServiceImpl.class);
	@Override
	public Product addProduct(Product product) {
		return productRepo.save(product);
	}
	@Override
	public void deleteProduct(long id) {
		productRepo.deleteById(id);

	}


	@Override
	public Product updateProduct(Product product) {
		return productRepo.save(product) ;
	}


	@Override
	public Product retrieveProduct(long idProduct) {
		L.info("in retrieveProduct id =" + idProduct);
		Product product= productRepo.findById(idProduct);
		L.info("offer returned =" + product);
		return product;
	}
	@Override
	public Product retrieveProductByDescription(String description) {
		L.info("in retrieveProduct description =" + description);
		Product product= productRepo.findByDescription(description);
		L.info("offer returned =" + product);
		return product;
	}
	/*public void assignProductUser(long idProduct, long user_ID) {
		Person u = personRepo.findById(persId).get();
		Product p = productRepo.findById(idProduct).get();

		if(p.getPerson() == null){

			List<Person> pers = new ArrayList<>();
			pers.add(u);
			p.setPerson(u);
		}else{

			p.setPerson(u);

		}

	}*/
}