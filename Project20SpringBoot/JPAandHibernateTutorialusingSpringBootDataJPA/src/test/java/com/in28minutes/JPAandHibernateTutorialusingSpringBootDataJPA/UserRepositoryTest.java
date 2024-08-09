package com.in28minutes.JPAandHibernateTutorialusingSpringBootDataJPA;

import com.in28minutes.JPAandHibernateTutorialusingSpringBootDataJPA.repository.UserRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;

@DataJpaTest
@ExtendWith(SpringExtension.class)
public class UserRepositoryTest {

	@Autowired
	UserRepository userRepository;

	@Autowired
	TestEntityManager entityManager;

	@Test
	public void check_todo_count() {
		assertEquals(3, userRepository.count());
	}
}