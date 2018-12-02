package com.song.controller;

import java.util.ArrayList;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.song.model.Person;
import com.song.service.PersonService;


@CrossOrigin
@RestController
@RequestMapping("/persons")
public class PersonController {
	@Autowired
	PersonService ps;

	@GetMapping("/all")
	public ArrayList<Person> getAll() {
		System.out.println("Get all");
		return ps.getAll();
	}

	@GetMapping("{id}")
	public Person getPerson(@PathVariable("id") long id) {
		System.out.println("Get id");
		return ps.getPerson(id);
	}

	@PostMapping("/post")
	public Person createNewPerson(@RequestBody Person person) {  // @Valid @RequestBody  MappingJacksonHttpMessageConverter
		System.out.println("Post");
		System.out.println("person's first name : " + person.getFirstName());
		ps.addPerson(person);
		return person;
	}

//	@RequestMapping("home")
//	public void home() {
//		System.out.println("hi");
//	}

}
