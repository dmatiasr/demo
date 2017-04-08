package com.example.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.dao.DaoPerson;
import com.example.model.Person;
import com.google.gson.Gson;

@RestController
public class PersonController {

	@Autowired
	private DaoPerson daop1;
	
	@RequestMapping("/")
	public String home(){
		return "Hello world!, im working";
	}
	
	
	@RequestMapping(value="/persons",method=RequestMethod.GET )
	public List<Person> getPersons(){
		return daop1.getAll();
	}
	
}
