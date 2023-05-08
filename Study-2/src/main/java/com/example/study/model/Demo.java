package com.example.study.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Demo {
	@Id
public int id;
public String name;
public String password;
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
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
@Override
public String toString() {
	return "Demo [id=" + id + ", name=" + name + ", password=" + password + "]";
}
}
