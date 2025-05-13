package com.tekpyramid.mvc.dao;

import org.springframework.stereotype.Component;

import com.tekpyramid.mvc.entity.Student;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

@Component
public class StudentDao {
	
	EntityManager entityManager=Persistence.createEntityManagerFactory("dev").createEntityManager();

	public void save(Student student) {
		// TODO Auto-generated method stub
		
		EntityTransaction transaction=entityManager.getTransaction();
		
		transaction.begin();
		entityManager.persist(student);
		transaction.commit();
		
	}

}
