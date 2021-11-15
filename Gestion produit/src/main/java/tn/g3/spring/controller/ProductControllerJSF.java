/*package tn.g3.spring.controller;
import java.util.Date;
import java.util.List;

import java.util.Date;
import java.util.logging.LogManager;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

import org.apache.logging.log4j.Logger;
import org.ocpsoft.rewrite.annotation.Join;
import org.ocpsoft.rewrite.el.ELBeanName;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import tn.esprit.spring.service.IProductInterface;
import tn.esprit.spring.service.IUserService;
import tn.esprit.spring.service.ProductServiceImpl;
import tn.esprit.spring.entity.*;

@Scope(value = "session")
@Controller(value = "userController") // Name of the bean in Spring IoC
@ELBeanName(value = "userController") // Name of the bean used by JSF
@Join(path = "/", to = "/login.jsf")
public class userController {
	@Autowired
	IUserService userService;
	@Autowired
	IProductInterface pi;
	private String login; private String password; private User user;
	private Boolean loggedIn;
	
	public IUserService getUserService() {
		return userService;
	}
	public void setUserService(IUserService userService) {
		this.userService = userService;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Boolean getLoggedIn() {
		return loggedIn;
	}
	public void setLoggedIn(Boolean loggedIn) {
		this.loggedIn = loggedIn;
	}
	public String doLogin() {
		String navigateTo = "null";
		User u=userService.authenticate(login, password);
		if (u != null && u.getRole() == Role.ADMINISTRATEUR) {
		navigateTo = "/pages/admin/welcome.xhtml?faces-redirect=true";
		loggedIn = true; }
		else {
		FacesMessage facesMessage =

		new FacesMessage("Login Failed: please check your username/password and try again.");

		FacesContext.getCurrentInstance().addMessage("form:btn",facesMessage);
		}
		return navigateTo;
		}
	public String doLogout() {
		FacesContext.getCurrentInstance().getExternalContext().invalidateSession();
		return "/login.xhtml?faces-redirect=true";
		}
	
	private ProductType productType;
	private String descriptionProduct;
	private Date startProduct;
	private Date finishProduct;
	private ProductStatus statusProduct;
	private long productIdToBeUpdated;
	
	
	
	
	public void addProduct() {
		pi.addProduct(new Product(productIdToBeUpdated, productType, descriptionProduct, startProduct, finishProduct, statusProduct));
		}

	public ProductType getProductType(){
		return productType;
	}
	public void setProductType(ProductType productType){
		this.productType=productType;
	}
	public ProductStatus getProductStatus()
	{
		return statusProduct;
	}
	public void setProductStatus(ProductStatus statusProduct){
		this.statusProduct=statusProduct;
	}
	public String getDescription() {
		return descriptionProduct;
	}
	public void setDescription(String descriptionProduct) {
		this.descriptionProduct = descriptionProduct;
	}
	public Date getStartProduct(){
		return startProduct;
	}
	public void setStartProduct(Date startProduct){
		this.startProduct=startProduct;
	}
	public Date getFinishProduct(){
		return finishProduct;
	}
	public void setFinishProduct(Date finishProduct){
		this.finishProduct=finishProduct;
	}
	
	
	public void removeProduct( String id) { 
		pi.deleteProduct(id);
		} 
	public long getProductIdToBeUpdated() {
		return productIdToBeUpdated;
	}
	public void setProductIdToBeUpdated(long productIdToBeUpdated) {
		this.productIdToBeUpdated = productIdToBeUpdated;
	}
	
	public void displayProduct(Product p)
	{
	this.setDescription(p.getDescription());
	this.setProductType(p.getProductType());
	this.setStartProduct(p.getStartProduct());
	this.setFinishProduct(p.getFinishProduct());
	this.setProductType(p.getProductType());
	
	}
	public Product updateProduct() {
		return pi.updateProduct(new Product(productIdToBeUpdated, productType, descriptionProduct, startProduct, finishProduct, statusProduct));
		}
	
	public ProductType[] getProductTypes() { return ProductType.values(); }
	public ProductStatus[] getProductStatus() { return ProductStatus.values(); 
	}
	}
*/