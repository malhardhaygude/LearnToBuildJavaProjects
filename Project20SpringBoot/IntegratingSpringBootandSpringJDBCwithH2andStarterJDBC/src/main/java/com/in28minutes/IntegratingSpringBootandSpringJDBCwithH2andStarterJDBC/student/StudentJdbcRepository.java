package com.in28minutes.IntegratingSpringBootandSpringJDBCwithH2andStarterJDBC.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class StudentJdbcRepository {
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	public Student findById(long id) {
		return jdbcTemplate.queryForObject("select * from student where id=?", new BeanPropertyRowMapper<>(Student.class), id);
	}

	public List<Student> findAll(){
		return jdbcTemplate.query("select * from student", new StudentMapper());
	}

	public int insertData(Student student){
		return jdbcTemplate.update("insert into student (id, name, passport_number) values(?,?,?)",
				student.getId(), student.getName(), student.getPassportNumber());
	}

	public int updateData(Student student){
		return jdbcTemplate.update("update student set name = ?, passport_number=? where id = ?",
				student.getName(), student.getPassportNumber(),student.getId());
	}

	public void deleteById(Long id){
		jdbcTemplate.update("delete from student where id=?",id);
	}
}