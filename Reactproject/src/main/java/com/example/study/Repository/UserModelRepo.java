package com.example.study.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.study.Model.UserModel;

public interface UserModelRepo extends JpaRepository<UserModel, Integer> {

	UserModel saveAndFlush(String field);

}
