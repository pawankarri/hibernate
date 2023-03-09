package com.hibernate.onetomany;

import javax.persistence.*;

@Entity
@Table (name="anss")
public class Answer {
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
private int id;
private String answer;
private String username;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getAnswer() {
	return answer;
}
public void setAnswer(String answer) {
	this.answer = answer;
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}

}
