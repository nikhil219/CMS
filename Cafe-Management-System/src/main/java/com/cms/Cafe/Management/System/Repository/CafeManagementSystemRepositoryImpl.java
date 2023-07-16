package com.cms.Cafe.Management.System.Repository;

import org.springframework.stereotype.Repository;

import com.cms.Cafe.Management.System.DTO.CafemanagementsystemDTO;

import java.util.Iterator;
import java.util.List;

import javax.swing.tree.RowMapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate; 
@Repository
public class CafeManagementSystemRepositoryImpl implements CafeManagementSystemRepository {
	@Autowired
	private JdbcTemplate jdbcTemplate;  

	@Override
	public List<CafemanagementsystemDTO> cafeCardDetails() {
		List<CafemanagementsystemDTO> result=this.jdbcTemplate.query("select * from \"CMS\".menu",new BeanPropertyRowMapper<CafemanagementsystemDTO>(CafemanagementsystemDTO.class));
			for (Iterator iterator = result.iterator(); iterator.hasNext();) {
				CafemanagementsystemDTO cafemanagementsystemDTO = (CafemanagementsystemDTO) iterator.next();
				System.out.println(result);
				System.out.println(cafemanagementsystemDTO);
			}
			return result;
		
	
	}

}
