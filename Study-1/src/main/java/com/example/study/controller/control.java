package com.example.study.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.study.model.StudentDetails;
import com.example.study.repository.Studentrepo;
import com.example.study.service.Studentserv;

@RestController
public class control {
@Autowired
	Studentserv S;
	@Autowired
	Studentrepo sr;
	@GetMapping("/getdetails")
	public List<StudentDetails> getdetails()
	{
		return S.getdetails();
	}
	@GetMapping("/getdetails/{id}")
	public Optional<StudentDetails> getdetailsbyid(@PathVariable int id)
	{
		return S.getdetailsbyid(id);
	}
	@PostMapping("/adddetails")
	public StudentDetails adddetail(@RequestBody StudentDetails Sd)
	{
		return S.adddetail(Sd);
	}
	@PutMapping("/{id}")
	public StudentDetails editdetail(@PathVariable int id, @RequestBody StudentDetails sd)
	{
		return S.edit(id, sd);
	}
	@DeleteMapping("/{id}")
	public String deletedetail(@PathVariable int id)
	{
		return S.delete(id);
	}
	@GetMapping("/sorting/{id}")
	public List<StudentDetails> sorted(@PathVariable String id)
	{
		return S.sortby(id);
	}
	@GetMapping("/getbyquery")
	public List<StudentDetails> getdata()
	{
		return sr.getalldata();
	}
	@GetMapping("/getbyquery/{id}")
	public List<StudentDetails> getdataby(@PathVariable int id)
	{
		return sr.byid(id);
	}
	@GetMapping("/getbyquery/{id}")
	public List<StudentDetails> getdataby1(@PathVariable int id)
	{
		return sr.byid(id);
	}
	@GetMapping("/getbypage/{id}/{id1}")
	public List<StudentDetails> getbypagination(@PathVariable("id") int id,@PathVariable("id1") int  id1)
	{
		return sr.pagination(id,id1);
	}
}
