package com.example.study.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.study.Model.Citizen;

public interface CitizenRepo extends JpaRepository<Citizen, Integer> {

}
