package org.dxc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import org.dxc.dao.EmployeeDao;
import org.dxc.model.Employee;
@Component
@Service
public class EmployeeServices {

	
	
	@Autowired
	EmployeeDao employeeDao;
	
	
	
	//add employee
	public void addEmp(Employee emp)
	{
		employeeDao.addEmployee(emp);
	}
	
	//get all employee
	public List<Employee> getAllEmp()
	{
		return employeeDao.getAllEmp();
	}
	
	
	//get emp by id
	
	public Employee getById(Long id)
	{
		return employeeDao.getEmpById(id);
	}
	
	
	// update employee
	
	public void updateEmp(Employee emp)
	{
		employeeDao.updateEmp(emp);
	}
	
	
	//delete employee 
	
	public void deleteEmployee(Long id)
	{
		employeeDao.deleteEmp(id);
	}
	
}
