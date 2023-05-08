package com.example.study.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.study.Model.LoginModel;

public interface LoginModelRepo extends JpaRepository<LoginModel, Integer> {

	LoginModel findByEmail(String email);

}
