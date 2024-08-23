package com.in28minutes.IntroductiontoSpringDataRestCreateRESTfulAPIsatF1Speed.model;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(path = "students", collectionResourceRel = "students")
public interface StudentDataRestRepository extends PagingAndSortingRepository<Student, Long>{
    Student findByNameOrPassportNumber(String name, String passportNumber);
}