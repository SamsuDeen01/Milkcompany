package com.example.study.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.study.Model.Citizen;
import com.example.study.Service.CitizenService;

@RestController
@RequestMapping("/Find")
public class Controller {
@Autowired
public CitizenService cs;
@PostMapping("/AddCitizen")
public String add(@RequestBody Citizen C)
{
	cs.post(C);
	return "Data Inserted!!";
}
@GetMapping("/GetDetail")
public List<Citizen>getdetail()
{
	return cs.get();
}
}
