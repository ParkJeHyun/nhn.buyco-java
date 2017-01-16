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
	
	@RequestMapping(value = "/list" , method=RequestMethod.GET)
	public List<User> getAllUser(){
		return userService.getAllUser();
	}
}
