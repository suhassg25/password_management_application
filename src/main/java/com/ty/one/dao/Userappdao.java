package com.ty.one.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ty.one.dto.Application;
import com.ty.one.dto.User;

@Repository
public class Userappdao {

	@Autowired
	EntityManager entityManager;

	public User saveUser(User user) // , Application application
	{

		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(user);
		entityTransaction.commit();
		return user;
	}

	public User find(int id) {
		return entityManager.find(User.class, id);
	}

	public User findbyEmail(String email) {
		return (User) entityManager.createQuery("Select u from User u where u.email=?1  ", User.class)
				.setParameter(1, email).getSingleResult();
	}

	public Application saveApp(Application application) {
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(application);
		entityTransaction.commit();
		return application;
	}

	public List<Application> getApplicationlist() {

		Query query = entityManager.createQuery("select a from Application a", Application.class);
		return query.getResultList();

	}
}
