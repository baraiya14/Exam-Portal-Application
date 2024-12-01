package com.MainApp.Pojo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Column;

@Entity
@Table
public class Question {
	@Id
	String q;
	@Column
	String c1;
	@Column
	String c2;
	@Column
	String ans;
	@Column
	String section;
	public String getQ() {
		return q;
	}
	public void setQ(String q) {
		this.q = q;
	}
	public String getC1() {
		return c1;
	}
	public void setC1(String c1) {
		this.c1 = c1;
	}
	public String getC2() {
		return c2;
	}
	public void setC2(String c2) {
		this.c2 = c2;
	}
	public String getAns() {
		return ans;
	}
	public void setAns(String ans) {
		this.ans = ans;
	}
	public String getSection() {
		return section;
	}
	public void setSection(String section) {
		this.section = section;
	}
	
	
	

}
