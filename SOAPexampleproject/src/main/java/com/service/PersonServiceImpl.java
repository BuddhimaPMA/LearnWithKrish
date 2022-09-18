package com.service;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import com.beans.Person;

public class PersonServiceImpl implements PersonService{
	
	private static Map<Integer, Person> persons = new HashMap<Integer,Person>();

	@Override
	public boolean addPerson(Person s) {
		// TODO Auto-generated method stub
		if(persons.get(s.getId())!= null) return false;
		persons.put(s.getId(), s);
		return true;
	}

	@Override
	public boolean deletePerson(int id) {
		// TODO Auto-generated method stub
		if(persons.get(id)==null) return false;
		persons.remove(id);
		return true;
	}

	@Override
	public Person getPerson(int id) {
		// TODO Auto-generated method stub
		return persons.get(id);
	}

	@Override
	public Person[] getAllPerson() {
		// TODO Auto-generated method stub
		Set<Integer> ids = persons.keySet();
		Person[] p = new Person[ids.size()];
		int i = 0;
		for(Integer id : ids) {
			p[i] = persons.get(id);
			i++;
		}
		return p;
	}

}
