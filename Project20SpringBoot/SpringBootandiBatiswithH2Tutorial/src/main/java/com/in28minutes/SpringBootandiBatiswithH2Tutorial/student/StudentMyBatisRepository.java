package com.in28minutes.SpringBootandiBatiswithH2Tutorial.student;

import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface StudentMyBatisRepository {
    @Select("select * from student where id = #{id}")
    public Student findById(long id);

    @Select("SELECT * FROM STUDENT")
    public List<Student> findAll();

    @Insert("insert into student(id, name, passportNumber) values(#{id}, #{name}, #{passportNumber})")
    public int insert(Student student);

    @Update("update student set name = #{name}, passportNumber = #{passportNumber} where id = #{id}")
    public int update(Student student);

    @Delete("delete from student where id = #{id}")
    public int deleteById(long id);
}