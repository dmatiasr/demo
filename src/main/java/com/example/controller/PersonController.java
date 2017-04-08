package com.example.controller;

import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.dao.DaoPerson;
import com.example.model.Person;

@RestController
public class PersonController {

	@RequestMapping("/")
	public String home(){
		return "Hello world!, im working";
	}
	
	
	@RequestMapping(value="/persons",method=RequestMethod.GET )
	public Map<String,Person> getPersons(){
		DaoPerson daop = new DaoPerson();
		return daop.getAll();
	}
	
}
