package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.Model.Arokya;
import com.example.demo.Model.Login;
import com.example.demo.repository.Arokyarepo;
import com.example.demo.repository.Loginrepo;
@Service
public class Milkserv {
	@Autowired
	Arokyarepo a;
	public List<Arokya> getdata(){
		return a.findAll();
	}
	public Optional<Arokya> getdatabyid(int id) {
		return a.findById(id);
	}
	public String postdata(Arokya n) {
		a.save(n);
		return"The data has posted successfully!";
	}
	public String putdata(Arokya m) {
		a.saveAndFlush(m);
		return"The data has been updated!!";
	}
	public String deldata(int id) {
		a.deleteById(id);
		return "The data has been deleted";
	}
	public List<Arokya> sortArokya(String id)
	{
		return a.findAll(Sort.by(id).descending());
	}
	public List<Arokya> pagination(int id,int id1)
	{
		Page<Arokya> p=a.findAll(PageRequest.of(id, id1));
		return p.getContent();
	}
	public List<Arokya> pagination1(int id,int id1,String name)
	{
		Page<Arokya> p=a.findAll(PageRequest.of(id, id1,Sort.by(name).ascending()));
		return p.getContent();
	}
	
}
