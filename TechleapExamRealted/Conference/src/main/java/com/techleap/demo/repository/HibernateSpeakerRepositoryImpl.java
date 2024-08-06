package com.techleap.demo.repository;

import com.techleap.demo.model.Speaker;

import java.util.ArrayList;
import java.util.List;

public class HibernateSpeakerRepositoryImpl implements SpeakerRepository {
     @Override
     public List<Speaker> findAll(){
         List<Speaker> speakers = new ArrayList<>();
         Speaker speaker = new Speaker();

         speaker.setFirstName("Malhar");
         speaker.setLastName("Dhaygude");

         speakers.add(speaker);
         return speakers;
     }
}
