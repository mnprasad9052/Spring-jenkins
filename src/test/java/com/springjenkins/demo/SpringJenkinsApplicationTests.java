package com.springjenkins.demo;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringJenkinsApplicationTests {
	
	
	public static Logger loger=LoggerFactory.getLogger(SpringJenkinsApplication.class);

	@Test
	void contextLoads() {
		
		loger.info("Test application execution started");
		Assert.assertEquals(true,true);
	}

}
