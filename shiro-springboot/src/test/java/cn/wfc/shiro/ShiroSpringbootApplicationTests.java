package cn.wfc.shiro;

import cn.wfc.shiro.mapper.UserMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ShiroSpringbootApplicationTests {

	@Autowired
	UserMapper userMapper;

	@Test
	void contextLoads() {
		System.out.println(userMapper.getUserByName("wfc"));
	}

}
