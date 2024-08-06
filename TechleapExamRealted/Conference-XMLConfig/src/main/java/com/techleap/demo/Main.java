package com.techleap.demo;

import com.techleap.demo.service.SpeakerService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Main {
    public static void main(String[] args) {

        ApplicationContext appContext = new ClassPathXmlApplicationContext("applicationContext.xml");


//          SpeakerService service = new SpeakerServiceImpl();
        SpeakerService service = appContext.getBean("speakerService", SpeakerService.class);
        String firstName = service.findAll().get(0).getFirstName();
        String lastName = service.findAll().get(0).getLastName();

        System.out.println(firstName + ":" + lastName);
    }
}
