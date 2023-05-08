package com.example.demo.Controller;

import java.util.List;
//import java.util.Map;
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
import com.example.demo.repository.Arokyarepo;
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
	@GetMapping("/sortArokya/{id}")
	public List<Arokya> sortid(@PathVariable String id)
	{
		return c.sortArokya(id);
	}
	@GetMapping("/getbypage/{id}/{id1}")
	public List<Arokya> getbypagination(@PathVariable("id") int id,@PathVariable("id1") int  id1)
	{
		return c.pagination(id,id1);
	}
	@GetMapping("/pagesort/{id}/{id1}/{name}")
	public List<Arokya> getbypagination1(@PathVariable("id") int id,@PathVariable("id1") int  id1,@PathVariable("name") String n)
	{
		return c.pagination1(id,id1,n);
	}
	@Autowired
	public Arokyarepo ar;
	@GetMapping("/getdetailsQ")
	public List<Arokya> getdetails(){
		return ar.getAllDataQ();
	}
	
	@GetMapping("/getbyidQ/{id}")
	public List<Arokya> getdetailsbyid1(@PathVariable("id")int id){
		return ar.getbyidQ(id);
	}
	
	@GetMapping("/getbyidbetQ/{id}/{id1}")
	public List<Arokya> getdetailsbyidbet(@PathVariable("id")int id,@PathVariable("id1")int id1){
		return ar.getbetweenQ(id,id1);
	}
	
	@DeleteMapping("/deleteQ/{pieces}/{quantity}")
	public Integer deletedetails(@PathVariable("pieces")String pieces,@PathVariable("quantity")String quantity){
		 ar.deletebyIdQ(pieces,quantity);
		 return 0;
	}
	@PutMapping("/updatejpq/{quantity}/{id}")
	public void updatedetails(@PathVariable("quantity")String quantity,@PathVariable("id")int id)
	{
		 ar.updatejpQ(quantity, id);
	}
	
	@PutMapping("/updateQ/{quantity}/{name}")
	public void updatedetail(@PathVariable("quantity")String quantity,@PathVariable("name")String name)
	{
		ar.update1Q(quantity, name);
	}
	
	@GetMapping("/getjpqQ/{name}")
	public List<Arokya> getjpq(@PathVariable("name") String name)
	{
		return ar.getQ(name);
	}
	
	@DeleteMapping("/deletejpq/{name}")
	public Integer deletejpq(@PathVariable("name")String name)
	{
		ar.deleteBynameQ(name);
		return 0;
	}
}



