package com.example.Spring.project.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;

import com.example.Spring.project.datamodels.dto.ResponseStructure;

@ControllerAdvice
public class GlobalExceptionHandler {
	public ResponseEntity<ResponseStructure<String>> DataNotFoundExceptionHandler(DataNotFoundException datanotfoundexception){
		ResponseStructure<String> responsestructure=new ResponseStructure();
		responsestructure.setData("data not fund");
		responsestructure.setMessage(datanotfoundexception.getMessage());
		responsestructure.setStatuscode(HttpStatus.NOT_FOUND.value());
		return new ResponseEntity<>(responsestructure,HttpStatus.NOT_FOUND);
		
	}

}
