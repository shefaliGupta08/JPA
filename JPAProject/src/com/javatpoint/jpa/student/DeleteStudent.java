package com.javatpoint.jpa.student;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class DeleteStudent {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Student_details");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		StudentEntity s=em.find(StudentEntity.class,102);  
		
		em.remove(s);
		em.getTransaction().commit();
		em.close();
		emf.close();
		

	}

}
