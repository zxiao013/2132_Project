package dao;

import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import bo.guests_info;

import java.sql.*;
import java.sql.ResultSet;

public class guestdetailsDao {
	private static String url = "jdbc:postgresql://web0.site.uottawa.ca:15432/zxiao013";
	private static String username = "zxiao013";
	private static String password = "xiaozihan921,";
	private Connection db;
	private Statement statement;
	private PreparedStatement preparedstatement;
	private String sql;
	private ResultSet resultset;

	public guestdetailsDao() {
		try {
			db = DriverManager.getConnection(url, username, password);
		} catch (SQLException e) {
			e.printStackTrace();
			return;
		}
	}

	
	//
	public void Printguestsinfo_query1() {
		try {
			// statement = db.createStatement();
			sql = "SELECT GuestFullName,PropertyType,PropertyPrice,SigningDate,BranchName,TypeOfPayment,PaymentStatus FROM 2132_dv2.GuestsInfo natural join 2132_dv2.Payment natural join 2132_dv2.HostInfo natural join 2132_dv2.PropertyInfo natural join 2132_dv2.Agreement natural join 2132_dv2.BranchInfo ORDER BY TypeOfPayment ASC, SigningDate DESC";

			preparedstatement = db.prepareStatement(sql);

			resultset = preparedstatement.executeQuery();
			while (resultset.next()) {
				System.out.println(resultset.getString(1) + "");
				System.out.println(resultset.getString(2) + "");
				System.out.println(resultset.getDouble(3) + "");
				System.out.println(resultset.getDate(4) + "");
				System.out.println(resultset.getString(5) + "");
				System.out.println(resultset.getString(6) + "");
				System.out.println(resultset.getString(7) + "");
				System.out.println();
			}

		} catch (Exception e) {
			System.out.println(e);
		}
	}


	//
	//
	//
	public void Printguestsinfo_simple() {
		try {
			sql = "SELECT * FROM 2132_dv2.GuestsInfo";
			preparedstatement = db.prepareStatement(sql);

			resultset = preparedstatement.executeQuery();
			while (resultset.next()) {
				System.out.println(resultset.getString(1) + "");
				System.out.println(resultset.getString(2) + "");

				System.out.println(resultset.getString(3) + "");
				System.out.println(resultset.getInt(4) + "");
				System.out.println(resultset.getDate(5) + "");
				System.out.println(resultset.getString(6) + "");
				System.out.println(resultset.getString(7) + "");
				System.out.println(resultset.getString(8) + "");
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

	public int createGuestsDetailsInfo(guests_info g_i) {
		try {
			sql = "insert into 2132_dv2.GuestsInfo values(?,?,?,?,?::date,?,?,?,?)";
			preparedstatement = db.prepareStatement(sql);
			preparedstatement.setString(1, g_i.getFirstName());
			preparedstatement.setString(2, g_i.getLastName());
			preparedstatement.setString(3, g_i.getFullName());
			preparedstatement.setInt(4, g_i.getID());
			preparedstatement.setString(5, g_i.getBirth());
			preparedstatement.setString(6, g_i.getAddress());
			preparedstatement.setString(7, g_i.getEmail());
			preparedstatement.setString(8, g_i.getPhoneNum());
			preparedstatement.setString(9, g_i.getPassword());
			return preparedstatement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
			return 0;

		}
	}

	public boolean findPersonInfo(guests_info g_i) {
		// for guests
		try {
			sql = "select * from 2132_dv2.GuestsInfo where GuestFullName = ? and GuestID =?";
			preparedstatement = db.prepareStatement(sql);
			preparedstatement.setString(1, g_i.getFullName());
			preparedstatement.setString(2, g_i.getPassword());
			preparedstatement.setInt(3, g_i.getID());
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
	
	public void updatePhoneNum(guests_info g_i, int phone, int id) {
		try {
			sql= "update 2132_dv2.GuestInfo set Guestphone= phone where GuestID= id";
			resultset= preparedstatement.executeQuery();
			if(resultset.next()) {
				return;
			}
			return;
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
