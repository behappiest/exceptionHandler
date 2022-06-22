package com.example.example.exception;

import org.springframework.stereotype.Component;

@Component
public class UserNotFoundException extends RuntimeException {

	 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String message;

	 protected UserNotFoundException() {}
	
	public UserNotFoundException(String message) {
		super(message,null,false,false);
    }

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

   
}
