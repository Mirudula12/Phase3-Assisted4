package com.example.demo;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UserRepo extends JpaRepository<User, Integer>{
                                                                      //first arg of the method
	/*@Query("select employee from Employee user where user.name=?1")

	public List<User> findByname(String name);*/
	
}
