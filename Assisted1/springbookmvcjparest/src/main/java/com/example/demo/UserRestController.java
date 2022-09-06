package com.example.demo;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserRestController {
@Autowired
	UserDAO dao;
	
@PostMapping("/insert")
	public User insert(@RequestBody User e) {
		return dao.insert(e);
	}


@PostMapping("/insertall")
public List<User> insertall(@RequestBody List<User> e){
	return dao.insertall(e);
}


@GetMapping("/getall")
public List<User> getall(){
	return dao.getall();
}



}

