package com.example.study.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.study.Model.Citizen;
import com.example.study.Repository.CitizenRepo;

@Service
public class CitizenService {
@Autowired
public CitizenRepo cr;
public void post(Citizen C)
{
	cr.save(C);
}
public List<Citizen>get()
{
	return cr.findAll();
}
}
