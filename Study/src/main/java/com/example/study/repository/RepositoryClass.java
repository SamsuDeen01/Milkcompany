package com.example.study.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.study.model.ModelClass;

public interface RepositoryClass extends JpaRepository<ModelClass,Integer>
{
}
