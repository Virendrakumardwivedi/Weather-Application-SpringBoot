package com.masai.Exception;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalException {
	@ExceptionHandler(MethodArgumentNotValidException.class)
	public ResponseEntity<MyErrorDetail>  myMNVEHandler(MethodArgumentNotValidException me) {
		
		MyErrorDetail err = new MyErrorDetail();
		
		err.setTimestamp(LocalDateTime.now());
		err.setMessage("Valadition Error");
		err.setDescription(me.getBindingResult().getFieldError().getDefaultMessage());
		
		return new ResponseEntity<MyErrorDetail>(err, HttpStatus.BAD_REQUEST);
		
		
	}

}
