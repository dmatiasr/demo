package com.example.dao;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Component;

import com.example.model.Person;
import com.google.gson.Gson;

/**
 * in the future implement with hibernate and Dao patron
 * @author rondeau
 *
 */

@Component
public class DaoPerson {

	private List<Person> persons;
	
	public DaoPerson(){
		persons= new LinkedList<Person>();
		
		Person p1 = new Person("Eli","eli@gmail.com");
		Person p2 = new Person("Matias","matu_dmr@hotmail.com");
		Person p3 = new Person("Micho","micho@gmail.com");
		Person p4 = new Person("Gordo","gordo@gmail.com");
	
		persons.add(p1);
		persons.add(p2);
		persons.add(p3);
		persons.add(p4);
	}
	
	public List<Person> getAll (){
		return this.persons;
	
	}
}
