package com.sample.app.entity;

import java.io.Serializable;

import javax.persistence.*;

@Entity
@Table(name = "customer")
public class Customer implements Serializable {
private static final long serialVersionUID = -2343243243242432341L;
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private long id;
@Column(name = "first_name")
private String firstName;
@Column(name = "last_name")
private String lastName;
public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}


}
