package com.example.study.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.study.Repository.DemoRepo;
import com.example.study.model.Demo;

@Service
public class DemoService {
@Autowired
DemoRepo Dr;
public List<Demo> getdata()
{
	return Dr.findAll();
}
public Optional<Demo> getbyid(int id)
{
	return Dr.findById(id);
}
public Demo adddata(Demo D)
{
	return Dr.save(D);
}
public Demo updatedata(Demo D)
{
	return Dr.saveAndFlush(D);
}
}
