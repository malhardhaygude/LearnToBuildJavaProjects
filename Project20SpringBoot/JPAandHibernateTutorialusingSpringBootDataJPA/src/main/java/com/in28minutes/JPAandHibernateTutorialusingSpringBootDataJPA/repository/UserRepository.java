package com.in28minutes.JPAandHibernateTutorialusingSpringBootDataJPA.repository;

import com.in28minutes.JPAandHibernateTutorialusingSpringBootDataJPA.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}