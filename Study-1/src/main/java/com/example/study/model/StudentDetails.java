package com.example.study.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Studentdatabase")
public class StudentDetails {
	@Id
	private int id;
	private String name;
	private String fathername;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFathername() {
		return fathername;
	}
	public void setFathername(String fathername) {
		this.fathername = fathername;
	}
	@Override
	public String toString() {
		return "StudentDetails [id=" + id + ", name=" + name + ", fathername=" + fathername + "]";
	}
}
