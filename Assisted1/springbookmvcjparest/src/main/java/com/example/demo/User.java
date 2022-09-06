package com.example.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;
//lombok -it will be taking the auto setters and getters ,auto constructor and tostring()
@Entity
@Data
public class User {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String name;
	private String email;
	private String feedback;
	
}
