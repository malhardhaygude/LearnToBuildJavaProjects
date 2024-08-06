package com.techleap.demo.service;

import com.techleap.demo.model.Speaker;
import com.techleap.demo.repository.HibernateSpeakerRepositoryImpl;
import com.techleap.demo.repository.SpeakerRepository;

import java.util.List;

public class SpeakerServiceImpl implements SpeakerService {

    SpeakerRepository speakerRepository = new HibernateSpeakerRepositoryImpl();

    @Override
    public List<Speaker> findAll(){
       return speakerRepository.findAll();
   }
}
