package com.selflearning.selflearning.restapi.controller;

public class HelloWorldBean {

	private String name;
	
	
	public HelloWorldBean(String name) {
		super();
		this.name = name;
	}


	public HelloWorldBean() {
		super();
		// TODO Auto-generated constructor stub
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}

}
