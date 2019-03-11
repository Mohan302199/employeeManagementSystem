package com.emp;

import javax.servlet.ServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path = "/store")
public class EmployeeController {
	public String saveEmployee(Model model,EmployeeDetails employeeDetails) {
		System.out.println("Eno" + employeeDetails.getName());
		System.out.println("Age" + employeeDetails.getAge());
		model.addAttribute(employeeDetails);
		
		return "display";
		
	}
}
