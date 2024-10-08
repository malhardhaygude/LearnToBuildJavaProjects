package com.in28minutes.ImplementingAOPwithSpringBootandAspectJ.advice;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class AfterAopAspect {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@AfterReturning(value = "execution(* com.in28minutes.ImplementingAOPwithSpringBootandAspectJ.service.*.*(..))",
			returning = "result")
	public void afterReturning(JoinPoint joinPoint, Object result) {
		logger.info("{} returned with value {}", joinPoint, result);
	}
	
	@After(value = "execution(* com.in28minutes.ImplementingAOPwithSpringBootandAspectJ.service.*.*(..))")
	public void after(JoinPoint joinPoint) {
		logger.info("after execution of {}", joinPoint);
	}

	@AfterThrowing(value = "execution(* com.in28minutes.ImplementingAOPwithSpringBootandAspectJ.service.*.*(..))")
	public void afterThrowing(JoinPoint joinPoint){
		logger.info(" after execution(when throwing exception) of {} ", joinPoint);
	}
}