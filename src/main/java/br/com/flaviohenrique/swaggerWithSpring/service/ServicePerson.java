package br.com.flaviohenrique.swaggerWithSpring.service;

import org.springframework.stereotype.Service;

import br.com.flaviohenrique.swaggerWithSpring.domain.Person;

@Service
public class ServicePerson {

	public Person retornaPerson(String name) {
		var person = new Person();
		person.setName(name);
		return person;
	}
	
}
