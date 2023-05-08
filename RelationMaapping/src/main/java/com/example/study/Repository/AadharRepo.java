package com.example.study.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.study.Model.Aadhar;

public interface AadharRepo extends JpaRepository<Aadhar, Integer> {

}
