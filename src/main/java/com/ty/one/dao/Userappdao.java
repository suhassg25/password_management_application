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

	public List<Application> getApplist(User user) {

		Query query = entityManager.createQuery("select a from Application a", Application.class);
		return query.getResultList();

	}
	public List<User> getUserList(User user) {
		Query query = entityManager.createQuery("select u from User u",User.class );
		return query.getResultList();
	}
	
	public List<Application> getById(User user)
	{
		return entityManager.createQuery("Select a from Application a where a.user=?1", Application.class).setParameter(1, user).getResultList();
	}
	
	public Application deleteById(int id)
	{
		Application a1=entityManager.find(Application.class, id);
		EntityTransaction entityTransaction=entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.remove(a1);
		entityTransaction.commit();
		return a1;
		
	}
	
	public Application findappid(int id)
	{
		return entityManager.find(Application.class, id);
	}
	public Application update(Application application)
	{
		EntityTransaction entityTransaction= entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.merge(application);
		entityTransaction.commit();
		return application;
		
	}
}
