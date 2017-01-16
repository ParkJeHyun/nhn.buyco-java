package kr.nhn.buyco.controller;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import kr.nhn.buyco.service.UserService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {
        "file:src/main/webapp/WEB-INF/spring/test/test-servlet-context.xml",
        "file:src/main/webapp/WEB-INF/spring/test/test-root-context.xml"
      })
public class UserControllerTest {
	@Autowired
	private ApplicationContext applicationContext;
	
	@Autowired
	private UserService userService;
	
	@Test
	public void getAllUserTest(){
		int cnt = userService.getAllUser().size();
		
		assertTrue(cnt > -1);
	}
}
