package com.sunshine.entity;

import java.io.Serializable;

public class TestInfo implements Serializable {
	private static final long serialVersionUID = 1L;
	private String id;
	private String name;
	private int sex;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSex() {
		return sex;
	}
	public void setSex(int sex) {
		this.sex = sex;
	}
}
