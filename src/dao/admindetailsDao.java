package dao;
import bo.admin_info;
import bo.guests_info;
import bo.hosts_info;

import java.sql.*;

public class admindetailsDao {
	private static String url =  "jdbc:postgresql://web0.site.uottawa.ca:15432/zxiao013";
	private static String username ="zxiao013";
	private static String password = "xiaozihan921,";
	private Connection db;
	private Statement statement;
	private PreparedStatement preparedstatement;
	private String sql;
	private ResultSet resultset;
	public admindetailsDao() {
		try {
			db = DriverManager.getConnection(url, username, password);
		}catch(SQLException e) {
			e.printStackTrace();
			return;
		}
	}
	public void closeDB() {
		try {
			if(statement != null) {
				statement.close();
			}if(preparedstatement != null) {
				preparedstatement.close();
			}
			if(resultset != null) {
				preparedstatement.close();
			}
		if(db != null) {
				db.close();
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
	public int createadminDetailsInfo(admin_info a_i) {
		try{
			sql = "insert into 2132_dv2.AdminInfo values(?,?,?)";
			preparedstatement = db.prepareStatement(sql);
			preparedstatement.setString(1, a_i.getName());
			preparedstatement.setInt(2,a_i.getID());
			preparedstatement.setString(3, a_i.getPassword());

			return preparedstatement.executeUpdate();
		}catch(SQLException e) {
			e.printStackTrace();
			return 0;
			
		}
	}
	public boolean findperson(admin_info a_i) {
		try {
			sql ="SELECT * FROM 2132_dv2.AdminInfo WHERE a_name =? a_id = ? a_password = ?";
			preparedstatement =db.prepareStatement(sql);
			preparedstatement.setString(1, a_i.getName());
			preparedstatement.setInt(2, a_i.getID());
			preparedstatement.setString(3,a_i.getPassword());
			resultset = preparedstatement.executeQuery();

			if(resultset.next()) {
				return true;
			}
			return false;
		}catch(SQLException e) {
			e.printStackTrace();
			return false;
		}
	}
		
	
	
}
