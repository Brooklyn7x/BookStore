package com.bookstore.exceptions;

import javax.servlet.http.HttpServletRequest;

//import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import org.springframework.web.bind.annotation.ResponseBody;
//import org.springframework.web.bind.annotation.ResponseStatus;




@ControllerAdvice
public class BookControllerExceptions {
	
	@ExceptionHandler(BookNotFoundException.class)
	public @ResponseBody ExpcetionResponse handlebooknotfound(BookNotFoundException ex, HttpServletRequest request) {
		ExpcetionResponse ee = new ExpcetionResponse();
		ee.setErrorMessage(ex.getMessage());
		return ee;
		
		
	}
	

}
