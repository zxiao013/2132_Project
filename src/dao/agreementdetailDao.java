package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import bo.agreement_info;
import bo.property_info;

public class agreementdetailDao {
	private static String url = "jdbc:postgresql://web0.site.uottawa.ca:15432/zxiao013";
	private static String username = "zxiao013";
	private static String password = "xiaozihan921,";
	private Connection db;
	private PreparedStatement preparedstatement;
	private String sql;
	private ResultSet resultset;
	
	public agreementdetailDao() {
		try {
			db = DriverManager.getConnection(url, username, password);
		} catch (SQLException e) {
			e.printStackTrace();
			return;
		}
	}
	
	public void createBooking(agreement_info a_i) {
		try {
			sql= "insert into 2132_dv2.Agreement values(?, ?, ?, ?, ?)";
			preparedstatement= db.prepareStatement(sql);
			preparedstatement.setInt(1, a_i.getH_id());
			preparedstatement.setInt(2, a_i.getG_id());
			String signingDate= a_i.getSigningDate().toString();
			preparedstatement.setString(3, signingDate);
			String startDate= a_i.getStartDate().toString();
			preparedstatement.setString(4, startDate);
			String endDate= a_i.getEndDate().toString();
			preparedstatement.setString(5, endDate);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}

