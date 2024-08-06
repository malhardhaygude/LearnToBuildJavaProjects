package com.techleap.demo.service;

import com.techleap.demo.model.Speaker;
import com.techleap.demo.repository.HibernateSpeakerRepositoryImpl;
import com.techleap.demo.repository.SpeakerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;

@Service("speakerService")
@Scope(value = BeanDefinition.SCOPE_SINGLETON)
@Profile("dev")
public class SpeakerServiceImpl implements SpeakerService {

    @Autowired
    SpeakerRepository speakerRepository;

    public SpeakerServiceImpl(){
        System.out.println("Wiring from no args constructor.");
    }


    public SpeakerServiceImpl(SpeakerRepository speakerRepository) {
        System.out.println("Wiring from repository constructor.");
        this.speakerRepository = speakerRepository;
    }

    @PostConstruct
    private void initialize(){
        System.out.println("This will be after your constructor.");
    }

    public SpeakerRepository getSpeakerRepository() {
        return speakerRepository;
    }



    public void setSpeakerRepository(SpeakerRepository speakerRepository) {
        System.out.println("Wiring from setters.");
        this.speakerRepository = speakerRepository;
    }



    @Override
    public List<Speaker> findAll(){
       return speakerRepository.findAll();
   }

}
