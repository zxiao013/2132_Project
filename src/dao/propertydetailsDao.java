package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;

import bo.property_info;

public class propertydetailsDao {
	private Connection db;
	private static String url = "jdbc:postgresql://web0.site.uottawa.ca:15432/zxiao013";
	private static String user = "zxiao013";
	private static String password = "xiaozihan921,";
	private Statement statement;
	private PreparedStatement preparedstatement;
	private String sql;
	private ResultSet resultset;

	public propertydetailsDao() {
		try {
			db = DriverManager.getConnection(url, user, password);
		} catch (SQLException e) {
			e.printStackTrace();
			return;
		}
	}

	public void closeDB() {
		try {
			if (statement != null) {
				statement.close();
			}
			if (resultset != null) {
				resultset.close();
			}
			if (db != null) {
				db.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public int createProperty(property_info p_i) {
		try {
			sql = "insert into 2132_dv2.PropertyInfo values(?,?,?,?,?,?,?,?,?,?)";
			preparedstatement = db.prepareStatement(sql);
			preparedstatement.setInt(1, p_i.getH_id());
			preparedstatement.setInt(2, p_i.getB_id());
			preparedstatement.setDate(3, p_i.getAvailable_date());
			preparedstatement.setString(4, p_i.getRoom_type());
			preparedstatement.setString(5, p_i.getP_address());
			preparedstatement.setString(6, p_i.getP_type());
			preparedstatement.setString(7, p_i.getP_location());
			preparedstatement.setDouble(8, p_i.getP_price());
			preparedstatement.setBoolean(9, p_i.isRented());
			preparedstatement.setDate(10, p_i.getDates());
			return preparedstatement.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
			return 0;

		}
	}

	// Query number 6
	public void listDetail() {
		try {
			statement = db.createStatement();
			sql = "SELECT HostID, BranchID, RoomType, PropertyAddress, PropertyType, PropertyLocation, PropertyPrice FROM 2132_dv2.PropertyInfo WHERE Rented= true and EXTRACT(DAY FROM dates)= 10";
			resultset = statement.executeQuery(sql);
			while (resultset.next()) {
				System.out.println("Host id: " + resultset.getInt(1) + " ");
				System.out.println("Branch id: " + resultset.getInt(2) + " ");
				System.out.println("Room type: " + resultset.getInt(4) + " ");
				System.out.println("Property address: " + resultset.getInt(5) + " ");
				System.out.println("Property type: " + resultset.getInt(6) + " ");
				System.out.println("Property location: " + resultset.getInt(7) + " ");
				System.out.println("Property price: " + resultset.getInt(8) + " ");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	public boolean findProperty(property_info p_i) {
		try {
			sql = "select * from 2132_dv2.PropertyInfo where HostID= ? and RoomType= ? and PropertyAddress= ? and PropertyType= ? and Dates= ?";
			preparedstatement = db.prepareStatement(sql);
			preparedstatement.setLong(1, p_i.getH_id());
			preparedstatement.setString(4, p_i.getRoom_type());
			preparedstatement.setString(5, p_i.getP_address());
			preparedstatement.setString(6, p_i.getP_type());
			String date = p_i.getDates().toString();
			preparedstatement.setString(10, date);
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

	public void displayProperty(property_info p_i) {
		try {
			sql = "select * from 2132_dv2.PropertyInfo where HostID= ? and RoomType= ? and PropertyAddress= ? and PropertyType= ? and Dates= ?";
			preparedstatement = db.prepareStatement(sql);
			preparedstatement.setLong(1, p_i.getH_id());
			preparedstatement.setString(4, p_i.getRoom_type());
			preparedstatement.setString(5, p_i.getP_address());
			preparedstatement.setString(6, p_i.getP_type());
			String date = p_i.getDates().toString();
			preparedstatement.setString(10, date);
			resultset = preparedstatement.executeQuery();

			while (resultset.next()) {
				System.out.println(resultset.getInt(1) + " ");
				System.out.println(resultset.getInt(4) + " ");
				System.out.println(resultset.getInt(5) + " ");
				System.out.println(resultset.getInt(6) + " ");
				System.out.println(resultset.getInt(10) + " ");

			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
