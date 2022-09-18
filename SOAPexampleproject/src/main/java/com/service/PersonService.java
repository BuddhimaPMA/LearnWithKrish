package com.service;

import com.beans.Person;

public interface PersonService {
	
	public boolean addPerson(Person s);
	public boolean deletePerson(int id);
	public Person getPerson(int id);
	public Person[] getAllPerson();

}
