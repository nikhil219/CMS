package com.cms.Cafe.Management.System.Services;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cms.Cafe.Management.System.DTO.CafemanagementsystemDTO;
import com.cms.Cafe.Management.System.Repository.CafeManagementSystemRepository;

@Service
public class CafeManagementSystemServicesImpl implements CafeManagementSystemServices{
@Autowired
CafeManagementSystemRepository cmsRepository;
	
	@Override
	public List<CafemanagementsystemDTO> cafeCardDetails() {
		
		return cmsRepository.cafeCardDetails();
	}

}
