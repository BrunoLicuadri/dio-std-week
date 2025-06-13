package com.licuadri.dio.std_week.controllers.handlers;

import java.time.Instant;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.licuadri.dio.std_week.services.exceptions.DatabaseIntegrityException;
import com.licuadri.dio.std_week.services.exceptions.ResourceNotFoundException;
import com.licuadri.dio.std_week.utils.CustomError;

import jakarta.servlet.http.HttpServletRequest;

@ControllerAdvice
public class ControllerExceptionHandler {
	
	@ExceptionHandler(ResourceNotFoundException.class)
	public ResponseEntity<CustomError> resourceNotFound(ResourceNotFoundException e, HttpServletRequest request){
		HttpStatus status = HttpStatus.NOT_FOUND;
		CustomError error = new CustomError(Instant.now(), status.value(),e.getMessage(), request.getRequestURI());
		return ResponseEntity.status(status).body(error);
	}
	
	@ExceptionHandler(DatabaseIntegrityException.class)
	public ResponseEntity<CustomError> databaseIntegrity(DatabaseIntegrityException e, HttpServletRequest request){
		HttpStatus status = HttpStatus.CONFLICT;
		CustomError error = new CustomError(Instant.now(), status.value(),e.getMessage(), request.getRequestURI());
		return ResponseEntity.status(status).body(error);
	}

}
