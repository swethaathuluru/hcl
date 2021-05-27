package com.hcl.service;

import java.sql.SQLException;
import java.util.List;

import com.hcl.beams.Employee;

import com.hcl.rdo.EmployeeRdo;



public class EmployeeService {
	
	
	public Employee addEmployee(Employee employee) throws SQLException{
		EmployeeRdo rdo=new EmployeeRdo();
		return rdo.addEmployee(employee);
		
}

	

}
