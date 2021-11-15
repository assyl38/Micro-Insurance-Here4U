package tn.g3.spring.service;

import java.util.List;

import tn.g3.spring.entity.User;

public interface IUserService {
	// les methodes que je vais utiliser
		 List<User> retrieveAllUsers(); 
		 User addUser(User u);
		 void deleteUser(String id);
		 User updateUser(User u);
		 User retrieveUser(String id);
		 
		 public User authenticate(String login, String password);
		 public int addOrUpdateEmploye(User u);
	public List<User> getAllEmployes();
}
