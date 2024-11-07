package com.example.Spring.project.exception;

public class DataNotFoundException extends RuntimeException {
	public DataNotFoundException(String msg) {
		super(msg);
	}

}
