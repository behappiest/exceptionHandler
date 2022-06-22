package com.example.example.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.example.exception.UserNotFoundException;


@RestController
public class MyController {
	
	@RequestMapping(value="/test",method=RequestMethod.GET)
	public String getOccupationList(@RequestParam("msg") String msg) throws UserNotFoundException {
		if(msg.equalsIgnoreCase("error")) {
			throw new UserNotFoundException("User Not Found");
		}else {
			return "test";	
		}
		
	}

}
