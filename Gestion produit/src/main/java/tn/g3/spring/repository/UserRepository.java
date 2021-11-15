package tn.g3.spring.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.g3.spring.entity.User;
import tn.g3.spring.entity.*;
@Repository
public interface UserRepository extends CrudRepository<User, Long> {

	public User getUserByEmailAndPassword(String login, String password);
}
