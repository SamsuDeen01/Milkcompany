package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Model.Login;

public interface Loginrepo extends JpaRepository<Login, Integer> {

	Login findByusername(String username);

}
