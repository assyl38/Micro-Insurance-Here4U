package tn.g3.spring.controller;
import java.util.ArrayList;
import java.util.List; 
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import tn.g3.spring.entity.User;
import tn.g3.spring.service.IUserService;


@RestController
public class UserRestController {

		@Autowired
		IUserService sr;
		
		
		// http://localhost:8000/SpringMVC/servlet/retrieve-All-Users  
			 @GetMapping("/retrieve-All-Users")
			 @ResponseBody
			 public List<User> getUser() {
			  List<User> us = new ArrayList<>() ;
			 sr.retrieveAllUsers().forEach(us::add);
			 return us;
			 } 
			 
			
			 // http://localhost:8000/SpringMVC/servlet/retrieve-user/{id_user}
			  @GetMapping("/retrieve-user/{id_user}")
			  public User retrieveUser(@PathVariable("id_user") String Userid) {
				 
			  return sr.retrieveUser(Userid);
			  }
			  
			  @PostMapping("/add-user")
			  public User addUser(@RequestBody User U) {
				  User us = sr.addUser(U);
			  return us ;
			  
			  }
			
			// http://localhost:8000/SpringMVC/servlet/remove-user/{user-id}
			   @DeleteMapping("/remove-user/{user-id}")
			   public void removeUser(@PathVariable("user-id") String uId) {
			   sr.deleteUser(uId);
			   }
			   
			  
			   // http://localhost:8000/SpringMVC/servlet/modify-user
			   @PutMapping("/modify-user")
			    @ResponseBody
			    public User modifyUser(@RequestBody User user){
			    return sr.updateUser(user);
			   }
	}


