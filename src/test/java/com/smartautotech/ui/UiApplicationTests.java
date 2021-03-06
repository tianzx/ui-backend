package com.smartautotech.ui;

import com.smartautotech.ui.model.User;
import com.smartautotech.ui.service.UserService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UiApplicationTests {

	@Autowired
	private UserService userService;

	@Test
	@Rollback
	public void findByName() throws Exception {

		User u = userService.getUserByUserId(1);
		Assert.assertEquals(1, u.getUserType());
//		Assert.assertEquals(-1, u.getUserType());
	}
}
