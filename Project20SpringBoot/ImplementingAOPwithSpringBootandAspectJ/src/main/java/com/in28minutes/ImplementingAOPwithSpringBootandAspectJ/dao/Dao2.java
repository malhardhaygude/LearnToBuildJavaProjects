package com.in28minutes.ImplementingAOPwithSpringBootandAspectJ.dao;

import org.springframework.stereotype.Repository;

@Repository
public class Dao2 {

	public String retrieveSomething(){
		return "Dao2";
	}

}