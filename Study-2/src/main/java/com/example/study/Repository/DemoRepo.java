package com.example.study.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.study.model.Demo;

public interface DemoRepo extends JpaRepository<Demo, Integer> {

}
