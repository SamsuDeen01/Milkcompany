package com.example.study.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
@Entity
public class Aadhar {
	 @Id
	 public int id;
	 public int aadharno;
	 public String name;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAadharno() {
		return aadharno;
	}
	public void setAadharno(int aadharno) {
		this.aadharno = aadharno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Aadhar [id=" + id + ", aadharno=" + aadharno + ", name=" + name + "]";
	}
}
