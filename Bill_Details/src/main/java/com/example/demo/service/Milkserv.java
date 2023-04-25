package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Model.Arokya;
import com.example.demo.repository.Arokyarepo;

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
		return"The data has posted successfully";
	}
	public String putdata(Arokya m) {
		a.saveAndFlush(m);
		return"The data has upadated";
	}
	public String deldata(int id) {
		a.deleteById(id);
		return"The data has been deleted";
	}
	
}
