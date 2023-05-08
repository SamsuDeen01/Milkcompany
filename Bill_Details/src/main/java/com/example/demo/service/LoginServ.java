package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.Model.Login;
import com.example.demo.repository.Loginrepo;
@Service
public class LoginServ {

		@Autowired
		public Loginrepo lr;
		public String checkLogin(String username,String password)
		{
			Login ss=lr.findByusername(username);
			if(ss==null)
			{
				return "no user found";
			}
			else
			{
				if(ss.getPassword().equals(password))
				{
					return "Login Successfull";
				}
				else
				{
					return "Login failed";
				}
			}
		}
		public Login AddUser(Login n) {
			return lr.save(n);
		}
		public List<Login> getUser()
		{
			return lr.findAll();
		}
}
