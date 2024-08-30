package com.in28minutes.ImplementingAOPwithSpringBootandAspectJ.service;

import com.in28minutes.ImplementingAOPwithSpringBootandAspectJ.advice.TrackTime;
import com.in28minutes.ImplementingAOPwithSpringBootandAspectJ.dao.Dao2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Business2 {
	
	@Autowired
	private Dao2 dao2;

//	@TrackTime
	public String calculateSomething(){
		//Business Logic
//		int num = 10;
//		int result= 10 / 0;
		return dao2.retrieveSomething();
	}
}