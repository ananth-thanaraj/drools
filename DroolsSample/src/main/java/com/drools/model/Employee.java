package com.drools.model;

import java.beans.PropertyChangeSupport;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Employee {

private String skill;
private String visa;
private boolean check;
private String role;


public String getRole() {
	return role;
}

public void setRole(String role) {
	this.role = role;
}

public Employee() {
	super();
	// TODO Auto-generated constructor stub
}

public Employee( String skill) {
	super();	
	this.skill = skill;
}



public String getSkill() {
	return skill;
}
public Employee(String role, String visa , boolean check) {
	super();
	this.role = role;
	this.visa = visa;
	this.check = check;
}



public Employee(String skill, String visa, boolean check, String role) {
	super();
	this.skill = skill;
	this.visa = visa;
	this.check = check;
	this.role = role;
}



public void setSkill(String skill) {
	this.skill = skill;
}
public String getVisa() {
	return visa;
}
public void setVisa(String visa) {
	this.visa = visa;
}
public boolean isCheck() {
	return check;
}
public void setCheck(boolean check) {
	this.check = check;
}



	
	
	
}
