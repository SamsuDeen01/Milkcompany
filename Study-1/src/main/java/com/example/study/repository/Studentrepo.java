package com.example.study.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.study.model.StudentDetails;

public interface Studentrepo extends JpaRepository<StudentDetails, Integer> {

	@Query("select c from StudentDetails c")
	public List<StudentDetails> getalldata();
	
	@Query("select c  from StudentDetails c where id=:id")
	public List<StudentDetails> byid(@PathVariable("id") int id);
	

}
