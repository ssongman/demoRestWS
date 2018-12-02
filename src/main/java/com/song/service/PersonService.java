package com.song.service;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLong;

import org.springframework.stereotype.Service;

import com.song.model.Person;

@Service
public class PersonService {
	ArrayList<Person> persons = new ArrayList<Person>();
	private AtomicLong nextId = new AtomicLong();
	
	public PersonService() {
		Person p = new Person();
		p.setId(1);
		p.setAge(21);
		p.setFirstName("Steve");
		p.setLastName("Smith");
		persons.add(p);

		p = new Person();
		p.setId(2);
		p.setAge(25);
		p.setFirstName("Tom");
		p.setLastName("Brown");
		persons.add(p);
	}
	
	public Person getPerson(long id) {
		for(Person person:persons) {
			if(person.getId() == id) return person;
		}
	    return null;
	}
	
	public Person addPerson(Person p) {
		p.setId(nextId.incrementAndGet());
//		p.setAge(25);
//		p.setFirstName("Tom");
//		p.setLastName("Brown");
		persons.add(p);
	    return p;
	}
	
	public ArrayList<Person> getAll() {
		return persons;
	}

}
