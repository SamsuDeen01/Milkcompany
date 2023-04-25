package com.example.demo.Controller;

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

import com.example.demo.Model.Arokya;
import com.example.demo.service.Milkserv;

@RestController
public class arokyacontroller {
	@Autowired
	Milkserv c;
	@GetMapping("/getmilkdata")
	public List<Arokya> getdetailsofmilk(){
		return c.getdata();
	}
	@GetMapping("/getmilkdata/{id}")
	public Optional<Arokya> getdetailsbyid(@PathVariable int id)
	{
		return c.getdatabyid(id);
	}
	@PostMapping("/postmilkdetaiils")
	public String postdetails(@RequestBody Arokya a) {
		return c.postdata(a);
	}
	@PutMapping("/putdetails")
	public String puttdetails(@RequestBody Arokya a) {
		return c.putdata(a);
	}
	@DeleteMapping("/deletedetail/{id}")
	public String detdetails(@PathVariable int id)
	{
		return c.deldata(id);
	}
}
