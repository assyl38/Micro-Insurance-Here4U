package tn.g3.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import tn.g3.spring.entity.Product;
import tn.g3.spring.service.IProductService;
import tn.g3.spring.service.ProductServiceImpl;


@RestController 
public class ProductController {
	@Autowired
	IProductService ps;
	@Autowired
	ProductServiceImpl psi;
	
	

	@PostMapping("/addProduct")
	@ResponseBody
	public Product addProduct(@RequestBody Product product) {
		 return ps.addProduct(product); 
	
		
	}
	@DeleteMapping("/remove-product/{idProduct}") 
	@ResponseBody
	public void removeProduct(@PathVariable("idProduct") long idProduct) { 
		ps.deleteProduct(idProduct);
	} 
	@PutMapping("/update-product") 
	@ResponseBody
	public Product updateProduct(@RequestBody Product product) {
		return ps.updateProduct(product);
	}
	@GetMapping("/retrieve-product/{idProduct}")
	@ResponseBody
	public Product retrieveProduct(@PathVariable("idProduct") long idProduct) {
		 System.out.println("call retrieveProduct ");
		 return ps.retrieveProduct(idProduct);
		 
	} 
	@GetMapping("/retrieve-product-by-description/{descriptionProduct}")
	@ResponseBody
	public Product retrieveProductByDescription(@PathVariable("descriptionProduct") String descriptionProduct) {
		
		return ps.retrieveProductByDescription(descriptionProduct);
	} 
	/*@PutMapping(value = "/assignProduct/{idProduct}/{user_ID}") 
	public void assignProductperson(@PathVariable("idProduct")long idProduct, @PathVariable("user_ID")long user_ID) {
		ps.assignProductPerson(idProduct, user_ID);
	}*/
}
