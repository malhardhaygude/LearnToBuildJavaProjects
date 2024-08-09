package com.in28minutes.JPAandHibernateTutorialusingSpringBootDataJPA.service;

import com.in28minutes.JPAandHibernateTutorialusingSpringBootDataJPA.model.User;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Transactional
public class UserService {
	
	@PersistenceContext
	private EntityManager entityManager;
		
	public long insert(User user) {
		entityManager.persist(user);
		return user.getId();
	}

	public User find(long id) {
		return entityManager.find(User.class, id);
	}
	
	public List<User> findAll() {
		Query query = entityManager.createNamedQuery(
				"query_for_find_all_users", User.class);
		return query.getResultList();
	}
}