package com.example.study.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="StudentData")
public class ModelClass {
	@Id
	@GeneratedValue
private int id;
private String name;
private String dept;
private int regno;
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
public String getDept() {
	return dept;
}
public void setDept(String dept) {
	this.dept = dept;
}
public int getRegno() {
	return regno;
}
public void setRegno(int regno) {
	this.regno = regno;
}
@Override
public String toString() {
	return "ModelClass [id=" + id + ", name=" + name + ", dept=" + dept + ", regno=" + regno + "]";
}

}
