package com.hcl.rdo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.hcl.beams.Employee;
import com.hcl.dbconnection.DBConnection;

public class EmployeeRdo {

	public Employee addEmployee(Employee employee) throws SQLException {
		DBConnection dbc = new DBConnection();
		Connection con = dbc.getConnection();

		PreparedStatement pstmt = null;
//		ResultSet rs = null;
		try {

			String sql = "insert into emp values(?,?,?,?)";
			pstmt = con.prepareStatement(sql);
//			rs = pstmt.executeQuery();

			pstmt.setInt(1, employee.getId());
			pstmt.setString(2, employee.getName());
			pstmt.setString(3, employee.getDepartment());
			pstmt.setInt(4, employee.getSalary());

			pstmt.executeUpdate();
pstmt.close();
		} catch (SQLException ex) {
			ex.printStackTrace();
//		} finally {
//			dbc.closePreparedStatement(pstmt);
//		}
		

	}
		return employee;
	}
}
