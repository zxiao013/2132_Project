package dao;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import bo.employee_info;
import bo.guests_info;

import java.sql.*;
import java.sql.ResultSet;

public class employeedetailsDao {
	private static String url = "jdbc:postgresql://web0.site.uottawa.ca:15432/zxiao013";
	private static String username = "zxiao013";
	private static String password = "xiaozihan921,";
	private Connection db;
	private Statement statement;
	private PreparedStatement preparedstatement;
	private String sql;
	private ResultSet resultset;

	public employeedetailsDao() {
		try {
			db = DriverManager.getConnection(url, username, password);
		} catch (SQLException e) {
			e.printStackTrace();
			return;
		}
	}

	public void SelecetEmployee() {
		try {
			sql = "SELECT EmployeeID,EmployeeName,BranchID,BranchName,EmployeeSalary FROM Employee WHERE EmployeeSalary>=15000 ORDER BY EmployeeID ASC";

			preparedstatement = db.prepareStatement(sql);

			resultset = preparedstatement.executeQuery();
			while (resultset.next()) {
				System.out.println(resultset.getInt(1) + "");
				System.out.println(resultset.getString(2) + "");
				System.out.println(resultset.getInt(3) + "");
				System.out.println(resultset.getString(4) + "");
				System.out.println(resultset.getInt(5) + "");
				System.out.println();
			}

		} catch (Exception e) {
			System.out.println(e);
		}
	}

	public void closeDB() {
		try {
			if (statement != null) {
				statement.close();
			}
			if (preparedstatement != null) {
				preparedstatement.close();
			}
			if (resultset != null) {
				preparedstatement.close();
			}
			if (db != null) {
				db.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public int createEmployeeDetailsInfo(employee_info e_i) {
		try {
			sql = "insert into 2132_dv2.employee values(?,?,?,?,?,?,?)";
			preparedstatement = db.prepareStatement(sql);
			preparedstatement.setInt(1, e_i.getID());
			preparedstatement.setString(2, e_i.getBasicInformation());
			preparedstatement.setString(3, e_i.getPosition());
			preparedstatement.setInt(4, e_i.getSalary());
			preparedstatement.setString(5, e_i.getname());
			preparedstatement.setInt(6, e_i.getBranchId());
			preparedstatement.setString(7, e_i.getPassword());

			return preparedstatement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
			return 0;

		}
	}

	public boolean findEmployeeInfo(employee_info e_i) {
		try {
			sql = "select * from 2132_dv2.Employee where EmployeeName = ? and EmployeeID = ?";
			preparedstatement = db.prepareStatement(sql);

			preparedstatement.setString(1, e_i.getname());
			preparedstatement.setInt(2, e_i.getID());


			resultset = preparedstatement.executeQuery();

			if (resultset.next()) {
				return true;
			}
			return false;
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
	}

	public void listAllProperty() {
		try {
			sql = "SELECT PropertyAddress FROM PropertyInfo NATURAL JOIN BranchInfo NATURAL JOIN ReviewRating WHERE Rented = true ORDER BY BranchID, Rating";
			preparedstatement = db.prepareStatement(sql);
			resultset = preparedstatement.executeQuery();
			while (resultset.next()) {
				System.out.println(resultset.getString(1) + " ");
				System.out.println();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
