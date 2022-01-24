package app.core.dao;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import app.core.entities.Person;

@Component
@Transactional // start an EntityManager session o each methos call
public class PersonDao {
	
	@Autowired
	private EntityManager em; // a container for persisting entities
	
	public void addPerson(Person person) {
		em.persist(person);
	}

	public Person find(int i) {
		// TODO Auto-generated method stub
		return null;
	}

	public void deletById(int i) {
		// TODO Auto-generated method stub
		
	}

	public void updatePerson(Person p) {
		// TODO Auto-generated method stub
		
	}

	

}
