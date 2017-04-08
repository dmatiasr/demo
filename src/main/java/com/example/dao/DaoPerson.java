package com.example.dao;

import java.util.HashMap;
import java.util.Map;

import com.example.model.Person;

/**
 * in the future implement with hibernate and Dao patron
 * @author rondeau
 *
 */
public class DaoPerson {

	private Map<String,Person> persons;
	
	public DaoPerson(){
		persons= new HashMap<String,Person>();
		
		Person p1 = new Person("Eli","eli@gmail.com");
		Person p2 = new Person("Matias","matu_dmr@hotmail.com");
		Person p3 = new Person("Micho","micho@gmail.com");
		Person p4 = new Person("Gordo","gordo@gmail.com");
	
		persons.put(p1.getId(), p1);
		persons.put(p2.getId(), p2);
		persons.put(p3.getId(), p3);
		persons.put(p4.getId(), p4);
	}
	
	public Map<String,Person> getAll (){
		return this.persons;
	}
}
