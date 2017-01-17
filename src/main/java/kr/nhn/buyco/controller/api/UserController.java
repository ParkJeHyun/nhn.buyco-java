package kr.nhn.buyco.controller.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import kr.nhn.buyco.artifacts.User;
import kr.nhn.buyco.service.UserService;

@RestController
@RequestMapping ("/api/user")
public class UserController {
	@Autowired
	private UserService userService;
	
	@RequestMapping(value = "/list" , method = RequestMethod.GET)
	public List<User> getAllUser(){
		//get All User in DataBase
		return userService.getAllUser();
	}
	
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public User login(User user) {
		//Login User
		return userService.signIn(user);
	}
	
	@RequestMapping(value = "/signup", method = RequestMethod.POST)
	public int signUp(User user) {
		//signUp user
		return userService.signUp(user);
	}
	
	@RequestMapping(value = "/update", method = RequestMethod.PUT)
	public int update(User user) {
		//Update User Info - Just Address and phone
		return userService.update(user);
	}
	
	@RequestMapping(value = "/delete", method = RequestMethod.DELETE)
	public int delete(int id) {
		//Delete User by User id(pk)
		return userService.delete(id);
	}
}
