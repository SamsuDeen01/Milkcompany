package com.example.study.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.study.model.StudentDetails;
import com.example.study.repository.Studentrepo;
@Service
public class Studentserv {
	@Autowired
		Studentrepo s ;
	public List<StudentDetails> getdetails() {
		return s.findAll();
	}
	public Optional<StudentDetails> getdetailsbyid(int id)
	{
		return s.findById(id);
	}
	public StudentDetails adddetail(StudentDetails x)
	{
		return s.save(x);
	}
	public StudentDetails edit(int id,StudentDetails y)
	{
		StudentDetails xx=s.findById(id).orElse(null);
		if(xx !=null)
		{
			xx.setId(y.getId());
			xx.setName(y.getName());
			xx.setFathername(y.getFathername());
			return s.saveAndFlush(xx);
		}
		else {
			return null;
		}
	}
	public String delete(int id)
	{
		s.deleteById(id);
		return id+" has been successfully deleted!!..";
	}
	public List<StudentDetails> sortby(String id)
	{
		return s.findAll(Sort.by(id).ascending());
	}
}
