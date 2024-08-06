package com.techleap.demo.service;

import com.techleap.demo.model.Speaker;
import com.techleap.demo.repository.HibernateSpeakerRepositoryImpl;
import com.techleap.demo.repository.SpeakerRepository;

import java.util.List;

public class SpeakerServiceImpl implements SpeakerService {

    SpeakerRepository speakerRepository;

    public SpeakerServiceImpl(){

    }

    public SpeakerServiceImpl(SpeakerRepository speakerRepository){
         this.speakerRepository=speakerRepository;
    }

    public void setSpeakerRepository(SpeakerRepository speakerRepository) {
        this.speakerRepository = speakerRepository;
    }

    @Override
    public List<Speaker> findAll(){
       return speakerRepository.findAll();
   }
}
