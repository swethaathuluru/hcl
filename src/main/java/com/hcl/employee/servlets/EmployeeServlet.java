package com.hcl.employee.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.hcl.beams.Employee;
import com.hcl.service.EmployeeService;

@WebServlet("/displayEmployee")
public class EmployeeServlet extends HttpServlet{

	public EmployeeServlet() {
		System.out.println("inside constructor");
	}
	
	public void init(ServletConfig config) {
		System.out.println("servlet init");
	}

	
	protected void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException {
		System.out.println("http servlet get method");
	
	String id=req.getParameter("id");
	String name=req.getParameter("name");
	String department=req.getParameter("department");
	String salary=req.getParameter("salary");
	
	Employee e=new Employee();
	
	e.setId(Integer.parseInt(id));
	e.setName(name);
	e.setDepartment(department);
	e.setSalary(Integer.parseInt(salary));
	
	EmployeeService service=new EmployeeService();
	
	try {
		service.addEmployee(e);
	} catch (SQLException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}
	
	System.out.println(id);
	
		PrintWriter pw=res.getWriter();
		
	res.setContentType("text/html");
	pw.print("<html><body>added"+id+"</body></html>");
	}
	
	protected void doPost(HttpServletRequest req,HttpServletResponse res) {
		System.out.println("http servlet post method");
		try {
			doGet(req,res);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public void destroy() {
		System.out.println("inside destroy");
	}
	
	
	
	
	
	
	
	
	
	
	
}
