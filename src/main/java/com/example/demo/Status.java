package com.example.demo;

import java.io.Serializable;

public enum Status implements Serializable {
	PENDING, OVERDUE, DONE, ARCHIVED;
	
	
	public String getStatus() {
	    return this.name();
	}
}
