package com.example.study.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.study.model.ModelClass;
import com.example.study.service.ServiceClass;

@RestController
public class ControllerClass {
	@Autowired
 ServiceClass Sclass;
@GetMapping("/get")

public List<ModelClass>get(){
		return Sclass.read();
	}

}
