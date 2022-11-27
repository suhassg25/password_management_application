package com.ty.one.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ty.one.dao.Userappdao;
import com.ty.one.dto.Application;
import com.ty.one.dto.User;

@Service
public class Userservice {

	@Autowired
	Userappdao userappdao;

	public User saveUser(User user)// , Application application
	{
		return userappdao.saveUser(user); // , application
	}

	public Application saveApp(Application appli) {
		return userappdao.saveApp(appli);
	}

	public User findEmail(String email) {
		return userappdao.findbyEmail(email);
	}

	public Application saveapp(Application application) {
		return userappdao.saveApp(application);

	}

	public List<Application> getAppList(User user) {
		return userappdao.getApplist(user);

	}
	public List<User> getUserList(User user) {
		return userappdao.getUserList(user);

	}
	
}
