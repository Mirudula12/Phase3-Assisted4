package com.example.demo;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserDAO {
//automatically it is going to generate a refernce to the object
	@Autowired
	UserRepo repo;
	
	public User insert(User e) {
		return repo.save(e);
	}
	
	
	public List<User> insertall(List<User> e){
		return repo.saveAll(e);
	}
	
	public List<User> getall(){
		return repo.findAll();
	}
	
	
	
}



