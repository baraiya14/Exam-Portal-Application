package com.MainApp.Pojo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Column;

@Entity
@Table
public class Section {
	
	@Id
	int id;
	@Column
	String section;
	@Column
	String adname;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSection() {
		return section;
	}
	public void setSection(String section) {
		this.section = section;
	}
	public String getAdname() {
		return adname;
	}
	public void setAdname(String adname) {
		this.adname = adname;
	}

	

	
}
