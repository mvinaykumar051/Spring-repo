package mvc.dto;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.stereotype.Controller;

import lombok.Data;

@Entity
@Data
@Controller
public class Student {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
int id;
String name;
String email;
long mobile;
String password;
String gender;
Date dob;
int age;
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
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public long getMobile() {
	return mobile;
}
public void setMobile(long mobile) {
	this.mobile = mobile;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public Date getDob() {
	return dob;
}
public void setDob(Date dob) {
	this.dob = dob;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
@Override
public String toString() {
	return "Student [id=" + id + ", name=" + name + ", email=" + email + ", mobile=" + mobile + ", password=" + password
			+ ", gender=" + gender + ", dob=" + dob + ", age=" + age + "]";
}
}
