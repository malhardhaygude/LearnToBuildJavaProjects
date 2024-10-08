package com.in28minutes.ImplementingAOPwithSpringBootandAspectJ;

import com.in28minutes.ImplementingAOPwithSpringBootandAspectJ.service.Business1;
import com.in28minutes.ImplementingAOPwithSpringBootandAspectJ.service.Business2;
import org.junit.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BusinessAopSpringBootTest {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	private Business1 business1;

	@Autowired
	private Business2 business2;

	@Test
	public void invokeAOPStuff() {
		logger.info(business1.calculateSomething());
		logger.info(business2.calculateSomething());
	}
}