package com.example.study.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.study.Service.DemoService;
import com.example.study.model.Demo;

@RestController
public class DemoController {
@Autowired
DemoService Ds;
@GetMapping("/")
public List<Demo> getlist()
{
	return Ds.getdata();
}
@GetMapping("/get/{id}")
public Optional<Demo> getbyid(@PathVariable int id)
{
	return Ds.getbyid(id);
}
@PostMapping("/adddetail")
public Demo adddata1(@RequestBody Demo D)
{
	return Ds.adddata(D);
}
@PutMapping("/edit")
public Demo editdata(@RequestBody Demo D)
{
	return Ds.updatedata(D);
}
}
