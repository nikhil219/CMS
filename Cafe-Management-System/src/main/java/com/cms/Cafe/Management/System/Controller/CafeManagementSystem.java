package com.cms.Cafe.Management.System.Controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cms.Cafe.Management.System.DTO.CafemanagementsystemDTO;
import com.cms.Cafe.Management.System.Services.CafeManagementSystemServices;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class CafeManagementSystem {
	@Autowired
	CafeManagementSystemServices cmsservice;
	
	@RequestMapping(value="/api",method = RequestMethod.GET,produces = "application/json")
	public Map<String, List<CafemanagementsystemDTO>> data(){
		List<CafemanagementsystemDTO> result=cmsservice.cafeCardDetails();
		Map<String, List<CafemanagementsystemDTO>> json=new HashMap<>();
		json.put("result", result);
		return json;
		
		
	}
}
