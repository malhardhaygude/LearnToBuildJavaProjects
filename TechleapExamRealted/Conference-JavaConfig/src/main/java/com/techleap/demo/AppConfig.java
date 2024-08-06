package com.techleap.demo;

import com.techleap.demo.repository.HibernateSpeakerRepositoryImpl;
import com.techleap.demo.repository.SpeakerRepository;
import com.techleap.demo.service.SpeakerService;
import com.techleap.demo.service.SpeakerServiceImpl;
import com.techleap.demo.util.CalendarFactory;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import java.util.Calendar;

@Configuration
@ComponentScan("com.techleap.demo")
public class AppConfig {


    /*
    @Bean(name = "speakerService")
    @Scope(value = BeanDefinition.SCOPE_SINGLETON)
    public SpeakerService getSpeakerService() {
        //Constructor Injection
//        SpeakerServiceImpl service = new SpeakerServiceImpl(getSpeakerRepository());
        SpeakerServiceImpl service = new SpeakerServiceImpl();
        //Setter Injection
        //service.setSpeakerRepository(getSpeakerRepository());
        return service;
    }

     */

    /*
    @Bean(name = "speakerRepository")
    public SpeakerRepository getSpeakerRepository() {
        return new HibernateSpeakerRepositoryImpl();
    }

     */


    @Bean("cal")
    public CalendarFactory calFactory(){
        CalendarFactory calFactory = new CalendarFactory();
        calFactory.addDays(3);
        return calFactory;
    }

    @Bean
    public Calendar cal() throws Exception{
        return calFactory().getObject();
    }

}
