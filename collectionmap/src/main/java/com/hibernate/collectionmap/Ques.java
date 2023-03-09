package com.hibernate.collectionmap;

import java.util.Map;

public class Ques {
private int id;
private String name;
private String username;
private Map<String,String> answer;
public Ques() {
	
}
public Ques(String name, String username, Map<String, String> answer) {
	super();
	this.name = name;
	this.username = username;
	this.answer = answer;
}
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
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public Map<String, String> getAnswer() {
	return answer;
}
public void setAnswer(Map<String, String> answer) {
	this.answer = answer;
}

}
