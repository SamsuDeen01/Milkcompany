package com.example.study.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.study.Model.LoanApplicationModel;

public interface LoanApplicationModelRepo extends JpaRepository<LoanApplicationModel, Integer> {

	LoanApplicationModel saveAndFlush(String field);

}
