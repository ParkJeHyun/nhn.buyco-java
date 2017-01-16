package kr.nhn.buyco.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.nhn.buyco.artifacts.User;
import kr.nhn.buyco.mapper.UserMapper;

@Service
public class UserService {
	@Autowired
	private UserMapper userMapper;
	
	public List<User> getAllUser() {
		return userMapper.getAllUser();
	}
	
	public User signIn(User user) {
		return userMapper.siginIn(user);
	}
	
	public int signUp(User user) {
		if((user.getOauth() != null && user.getOauth().length() != 0 ) || (user.getEmail() != null && user.getPassword() != null)){
			//Oauth or Email Password
			return userMapper.signUp(user);	
		}
		
		return 0;
	}
	
	public int update(User user) {
		return userMapper.update(user);
	}
	
	public int delete(int id) {
		return userMapper.delete(id);
	}
	
}
