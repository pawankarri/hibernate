package com.hibernate.onetomany;

import java.util.List;

import javax.persistence.*;
@Entity
@Table(name="pro")
public class Program {
	@Id
	@GeneratedValue(strategy =GenerationType.TABLE)
private int id;
private String qname;
@OneToMany (cascade = CascadeType.ALL)
@JoinColumn(name="qid")
@OrderColumn(name="type")
private List<String> answer;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getQname() {
	return qname;
}
public void setQname(String qname) {
	this.qname = qname;
}
public List<String> getAnswer() {
	return answer;
}
public void setAnswer(List<String> answer) {
	this.answer = answer;
}


}
