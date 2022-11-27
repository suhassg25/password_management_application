package com.ty.one.controller;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.ty.one.dto.Application;
import com.ty.one.dto.User;
import com.ty.one.service.Userservice;

@Controller
public class UserController {

	@Autowired
	Userservice userservice;

	@RequestMapping("login")
	public ModelAndView log(@ModelAttribute User user) {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("user", new User());
		modelAndView.setViewName("login.jsp");

		return modelAndView;
	}

	User u;

	@RequestMapping("saveapp")
	public ModelAndView saveap(@ModelAttribute User user, Application application, HttpServletRequest req,
			HttpServletResponse res) {
		u = userservice.findEmail(user.getEmail());
		ModelAndView modelAndView = new ModelAndView();

		if (u.getPassword().equalsIgnoreCase(user.getPassword()) && u.getRole().equalsIgnoreCase("User")) {
			modelAndView.addObject("application", new Application());
			modelAndView.setViewName("addorview.jsp");
		}

		else if (u.getPassword().equalsIgnoreCase(user.getPassword()) && u.getRole().equalsIgnoreCase("Admin")) {
			List<User> list = userservice.getUserList(user);
			modelAndView.addObject("user", new User());
//			List<Application> user2 = userservice.getAppList(user);
//			modelAndView.addObject("application", new Application());
//			modelAndView.addObject("appList", userservice.getAppList(user));
			modelAndView.addObject("userList", userservice.getUserList(user));
			modelAndView.setViewName("adminView.jsp");
		} 
		
		else {
			modelAndView.setViewName("login.jsp");
		}
		return modelAndView;
	}

	@RequestMapping("viewForAdmin")
	public ModelAndView viewAdmin(@ModelAttribute User user) {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("application", new Application());
		List<Application> user2 = userservice.getAppList(user);
		modelAndView.addObject("appList", userservice.getAppList(user));
		modelAndView.setViewName("viewForAdmin.jsp");
		return modelAndView;
	}
	
	@RequestMapping("signup")
	public ModelAndView sinup(@ModelAttribute User user) {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("user", new User());
		modelAndView.setViewName("signup.jsp");
		return modelAndView;
	}

	@RequestMapping("saveuser")
	public ModelAndView save(@ModelAttribute User user) {
		userservice.saveUser(user);
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("user", new User());
		modelAndView.setViewName("index.jsp");
		return modelAndView;
	}

	@RequestMapping("exit")
	public ModelAndView sendlist(@ModelAttribute User user) {
		ModelAndView modelAndView = new ModelAndView();

		modelAndView.setViewName("login");
		return modelAndView;

	}

	@RequestMapping("createapp")
	public ModelAndView add(@ModelAttribute Application application) {
		application.setUser(u);
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("application", new Application());

		userservice.saveapp(application);
		modelAndView.setViewName("app.jsp");

		return modelAndView;

	}

	@RequestMapping("appadd")
	public ModelAndView addapp(@ModelAttribute Application application) {
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("application", new Application());
		modelAndView.setViewName("app.jsp");
		return modelAndView;
	}

	@RequestMapping("viewuserapps")
	public ModelAndView viewuser(Application application) {

		ModelAndView modelAndView = new ModelAndView();
		modelAndView.addObject("application", new Application());

		modelAndView.addObject("slist", userservice.getbyId(u));
		modelAndView.setViewName("viewer.jsp");
		return modelAndView;

	}
}
