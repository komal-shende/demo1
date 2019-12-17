package com.model;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Student
{
	@Id	
private int rollnum;
private String name;
private String addr;
public int getRollnum() {
	return rollnum;
}
public void setRollnum(int rollnum) {
	this.rollnum = rollnum;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getAddr() {
	return addr;
}
public void setAddr(String addr) {
	this.addr = addr;
}
	
	

}
