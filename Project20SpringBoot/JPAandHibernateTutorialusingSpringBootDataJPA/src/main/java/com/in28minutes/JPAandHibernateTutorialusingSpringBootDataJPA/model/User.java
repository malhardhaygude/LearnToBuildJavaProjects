package com.in28minutes.JPAandHibernateTutorialusingSpringBootDataJPA.model;

import jakarta.persistence.*;

@Entity
@NamedQuery(query = "select u from User u", name = "query_for_find_all_users")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	private String name;// Not perfect!! Should be a proper object!

	private String role;// Not perfect!! An enum should be a better choice!

	protected User() {
	}

	public User(String name, String role) {
		super();
		this.name = name;
		this.role = role;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	@Override
	public String toString() {
		return "User{" +
				"id=" + id +
				", name='" + name + '\'' +
				", role='" + role + '\'' +
				'}';
	}
}