package tn.g3.spring.controller;

import java.util.List;

import javax.faces.application.FacesMessage; 
import javax.faces.context.FacesContext;

import org.ocpsoft.rewrite.annotation.Join;
import org.ocpsoft.rewrite.el.ELBeanName;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;

import tn.g3.spring.entity.Role;
import tn.g3.spring.entity.User;
import tn.g3.spring.service.IUserService;


@Scope(value = "session")
@Controller(value = "userController") // Name of the bean in Spring IoC
@ELBeanName(value = "userController") // Name of the bean used by JSF
@Join(path = "/", to = "/login.jsf")
public class UserControllerImpl {

	@Autowired
	IUserService userService;

	private String login;
	private String password;
	private User user;
	private Boolean loggedIn;
	private User authenticatedUser;
	
	private String prenom; private String nom; private String email;
	private boolean actif; private Role role;
	
	public Role[] getRoles() { return Role.values(); }
	
	private long employeIdToBeUpdated;
	
	
	public long getEmployeIdToBeUpdated() {
		return employeIdToBeUpdated;
	}
	public void setEmployeIdToBeUpdated(long employeIdToBeUpdated) {
		this.employeIdToBeUpdated = employeIdToBeUpdated;
	}
	public void setEmployes(List<User> employes) {
		this.employes = employes;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public boolean isActif() {
		return actif;
	}
	public void setActif(boolean actif) {
		this.actif = actif;
	}
	public Role getRole() {
		return role;
	}
	public void setRole(Role role) {
		this.role = role;
	}
	public User getAuthenticatedUser() {
		return authenticatedUser;
	}
	public void setAuthenticatedUser(User authenticatedUser) {
		this.authenticatedUser = authenticatedUser;
	}
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
		 			
			authenticatedUser=userService.authenticate(login, password);
		 if (authenticatedUser != null && authenticatedUser.getRole() ==
				 Role.ADMINISTRATEUR) {	
			
			
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
	
	public void addEmploye() {
		userService.addOrUpdateEmploye(new User(nom, prenom, email, password, actif, role));
		}

	
	private List<User> employes; // ajouter le getter et le setter

	public List<User> getEmployes() {
	employes = userService.getAllEmployes();
	return employes;
	}
	
	public void removeEmploye(String employeId)
	{
		
	userService.deleteUser(employeId);
	}
	public void displayEmploye(User empl)
	{
	this.setPrenom(empl.getPrenom());
	this.setNom(empl.getNom());
	this.setActif(empl.isActif());
	this.setEmail(empl.getEmail());
	this.setRole(empl.getRole());
	this.setPassword(empl.getPassword());
	this.setEmployeIdToBeUpdated(empl.getId());
	}
	
	public void updateEmploye()
	{ userService.addOrUpdateEmploye(new User(employeIdToBeUpdated, nom,	prenom, email, password, actif, role)); }
}

