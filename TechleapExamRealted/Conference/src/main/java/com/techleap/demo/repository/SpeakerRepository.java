package com.techleap.demo.repository;

import com.techleap.demo.model.Speaker;

import java.util.List;

public interface SpeakerRepository {
    List<Speaker> findAll();
}
