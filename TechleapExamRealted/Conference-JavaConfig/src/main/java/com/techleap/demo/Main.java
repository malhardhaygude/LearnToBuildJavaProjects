package com.techleap.demo;

import com.techleap.demo.service.SpeakerService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class Main {
    public static void main(String[] args) {
        ApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class);


//          SpeakerService service = new SpeakerServiceImpl();
//          String firstName = service.findAll().get(0).getFirstName();
//          String lastName = service.findAll().get(0).getLastName();

        SpeakerService service = appContext.getBean("speakerService", SpeakerService.class);

        String firstName = service.findAll().get(0).getFirstName();
        String lastName = service.findAll().get(0).getLastName();
        Double seedVal = service.findAll().get(0).getSeedVal();

        System.out.println(service);

        System.out.println(firstName + ":" + lastName + ":" + seedVal);


        SpeakerService service1 = appContext.getBean("speakerService", SpeakerService.class);

        System.out.println(service1);

    }
}
