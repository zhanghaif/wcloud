package cn.com.wcloud.async.mapper;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

import cn.com.wcloud.async.AppTest;
import cn.com.wcloud.async.entity.User;

//@RunWith(SpringJUnit4ClassRunner.class)
//@SpringBootTest(classes = {AppTest.class, DataSourceAutoConfiguration.class})
class UserMapperTest {

	@Autowired
	private UserMapper userMapper;
	
	@BeforeEach
	void setUp() throws Exception {
	}

	@Test
	void test() {
		User user = new User();
		user.setUse_id(4);
		user.setUse_name("zhang");
		user.setUse_age("18");
		int i = userMapper.insert(user);
		Assert.assertEquals(1, i);
	}

}
