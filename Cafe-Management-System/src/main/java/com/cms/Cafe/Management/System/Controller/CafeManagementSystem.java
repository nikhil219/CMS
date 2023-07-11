package com.cms.Cafe.Management.System.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class CafeManagementSystem {
	@RequestMapping(value="/api",method = RequestMethod.GET,produces = "application/json")
	public List<String> data(){
		List<String> result = new ArrayList<>();
		result.add("hello");
		System.out.println("Restcall happen");
		return result; 
		
	}
}
