package com.example.Spring.project.datamodels.dto;

import lombok.Data;

@Data
public class ResponseStructure<T> {
	private int statuscode;
	private String message;
	private T data;

}
