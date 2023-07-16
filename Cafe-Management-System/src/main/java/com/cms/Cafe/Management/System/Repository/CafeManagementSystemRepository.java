package com.cms.Cafe.Management.System.Repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.cms.Cafe.Management.System.DTO.CafemanagementsystemDTO;

@Repository
public interface CafeManagementSystemRepository {
	public List<CafemanagementsystemDTO> cafeCardDetails();
}
