package kr.nhn.buyco.service;

import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import kr.nhn.buyco.artifacts.User;
import kr.nhn.buyco.mapper.UserMapper;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
        "file:src/main/webapp/WEB-INF/spring/test/test-servlet-context.xml",
        "file:src/main/webapp/WEB-INF/spring/test/test-root-context.xml"
      })

public class UserServiceTest {
	@Autowired
	private ApplicationContext applicationContext;
	
	@Autowired
	private UserMapper userMapper;
	
	@Test
	public void getAllUser(){
		int count = userMapper.getAllUser().size();
		
		assertTrue(count > -1);
	}
	
	@Test
	public void signUp() {
		User user = new User();
		
		user.setEmail("Test@test.test");
		user.setPassword("1234");
		
		int result = userMapper.signUp(user);
		int id = userMapper.siginIn(user).getId();
		
		assertTrue(result == 1);
				
		result = userMapper.delete(id);
		
		assertTrue(result == 1);
	}
	
	
	@Test
	public void signIn() {
		List<User> users = userMapper.getAllUser();
		
		for(int i=0;i<users.size() && i < 5; i++){
			User user = users.get(i);
			
			User user2 = userMapper.siginIn(user);

			assertTrue(user.getId() == user2.getId());
			
			assertTrue(validateUser(user, user2));
		}
		
		User user = new User();
		
		assertTrue(userMapper.siginIn(user) == null);
	}
	
	public boolean validateUser(User user1, User user2){
		boolean ret = false;
		
		if(user1.getOauth() != null && user1.getOauth().length() != 0){
			ret = (user1.getOauth().equals(user2.getOauth()));
		}
		else {
			ret = (user1.getEmail().equals(user2.getEmail()));
			ret = (user1.getPassword().equals(user2.getPassword()));
		}
		
		return ret;
	}
}
