package com.example.demo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalException {
	
	//@ResponseStatus(value = HttpStatus.BAD_GATEWAY,reason = "not found experience")
	@ExceptionHandler({workNotFound.class})
	public ResponseEntity<String> giveException() {
		
		ResponseEntity<String> response=new ResponseEntity<String>("not found mann!!!", HttpStatus.BAD_REQUEST);
		return response;
		
	}
	
}
