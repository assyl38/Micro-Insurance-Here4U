package tn.g3.spring.service;

import java.util.List; 

import tn.g3.spring.entity.User;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.g3.spring.repository.UserRepository;

@Service 
public class UserServiceImpl implements IUserService {
	@Autowired     // jinjecte le repositroy dans le service avec autowired pour que je puisse utiliser toutes les methodes
	UserRepository userRepository ;
	
	private static final Logger L = LogManager.getLogger(UserServiceImpl.class); // le logger qui va ecrire les message dans la console ou fichier
	
	@Override
	public List<User> retrieveAllUsers() {
		List<User> users = (List<User>) userRepository.findAll(); // je fais un cast car le findAll retourne un iterrable et non une list<User>
		for(User user : users)
		{
			L.info("user +++ :" + user);
		}
					
		return users;
	}

	@Override
	public User addUser(User u) {  //difference entre update et add : c le id du user
		User userSaved = null;
		userSaved = userRepository.save(u);
		
		return userSaved;
	}

	@Override
	public void deleteUser(String id) {
		userRepository.deleteById(Long.parseLong(id));
		
	}

	@Override
	public User updateUser(User u) {
		User userAdded = userRepository.save(u);
		return userAdded;
	}

	@Override
	public User retrieveUser(String id) {
		L.info("in retrieveUser id = " + id);
		// User u = userRepository.findById(Long.parseLong(id)).orElse(null); MEME CHOSE
		 User u = userRepository.findById(Long.parseLong(id)).get();
		L.info("user returned = : " + u);
		return u;
	}
	
	///// /****************************** JSF
	@Override
	public User authenticate(String login, String password) {
	return userRepository.getUserByEmailAndPassword(login, password);

	}

	
	@Override
	public int addOrUpdateEmploye(User u) {
	userRepository.save(u);
	return u.getId().intValue();
	}
	
	@Override
	public List<User> getAllEmployes() {
	return (List<User>) userRepository.findAll();
	}
}