package com.selflearning.selflearning.restapi.versioning;

public class PersionV2 {
	
	private Name name;

	public Name getName() {
		return name;
	}


	public PersionV2(Name name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return "PersionV2 [name=" + name + "]";
	}
	
	
	

}
