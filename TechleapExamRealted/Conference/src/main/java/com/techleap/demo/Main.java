package com.techleap.demo;

import com.techleap.demo.service.SpeakerService;
import com.techleap.demo.service.SpeakerServiceImpl;


public class Main {
    public static void main(String[] args) {

          SpeakerService service = new SpeakerServiceImpl();
          String firstName = service.findAll().get(0).getFirstName();
          String lastName = service.findAll().get(0).getLastName();

           System.out.println(firstName + ":" + lastName);
        }
}
