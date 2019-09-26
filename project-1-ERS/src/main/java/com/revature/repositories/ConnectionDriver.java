package com.revature.repositories;

import com.revature.model.Employee;

public class ConnectionDriver {

	public static void main(String[] args) {
		//ERSConnectionUtil.getConnection();
		
		EmployeeDao test = new EmployeeDaoImpl();
		
		for (Employee e : test.getEmployees()) {
			System.out.println(e);
		}

	}

}
