package com.techleap.demo.repository;

import com.techleap.demo.model.Speaker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

@Repository("speakerRepository")
@Profile("dev")
public class HibernateSpeakerRepositoryImpl implements SpeakerRepository {
    @Autowired
     private Calendar cal;

    @Value("#{ T(java.lang.Math).random() * 100 }")
    private double seedVal;

     public List<Speaker> findAll(){
         System.out.println("hello");
         List<Speaker> speakers = new ArrayList<>();
         Speaker speaker = new Speaker();

         speaker.setFirstName("Malhar");
         speaker.setLastName("Dhaygude");
         speaker.setSeedVal(seedVal);



         speakers.add(speaker);
         System.out.println("cal: "+cal.getTime());
         return speakers;
     }
}
