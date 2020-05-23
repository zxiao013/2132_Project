package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import bo.guests_info;
import bo.hosts_info;

public class hostdetailsDao {
	private static String url =  "jdbc:postgresql://web0.site.uottawa.ca:15432/zxiao013";
	private static String username ="zxiao013";
	private static String password = "xiaozihan921,";
	private Connection db;
	private Statement statement;
	private PreparedStatement preparedstatement;
	private String sql;
	private ResultSet resultset;
	public hostdetailsDao() {
		try {
			db = DriverManager.getConnection(url, username, password);
		}catch(SQLException e) {
			e.printStackTrace();
			return;
		}
	}
	
	
	public void Printhostsinfo() {
		try {
			//statement = db.createStatement();
			sql = "SELECT * FROM 2132_dv2.HostInfo";
			
			preparedstatement =db.prepareStatement(sql);
			
			resultset = preparedstatement.executeQuery();
			while(resultset.next()) {
				System.out.println(resultset.getInt(1)+"");
				System.out.println(resultset.getString(2)+"");
				System.out.println(resultset.getString(3)+"");
				System.out.println(resultset.getString(4) +"");
				System.out.println(resultset.getInt(5)+"");
				System.out.println(resultset.getString(6)+"");
				System.out.println();
			}
		
		
		}catch(Exception e) {
			System.out.println(e);
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
	//
	//
	//
	public int createHostssDetailsInfo(hosts_info h_i) {
		try{
			sql = "insert into 2132_dv2.hostsinfo values(?,?,?,?,?,?)";
			preparedstatement = db.prepareStatement(sql);
			preparedstatement.setInt(1, h_i.getID());
			preparedstatement.setString(2,h_i.getName());
			preparedstatement.setString(3, h_i.getAddress());
			preparedstatement.setString(4, h_i.getEmail());
			preparedstatement.setInt(5, h_i.getPhone());
			preparedstatement.setString(6, h_i.getPassword());
			return preparedstatement.executeUpdate();
		}catch(SQLException e) {
			e.printStackTrace();
			return 0;
			
		}
	}
	public boolean findPersonInfo(hosts_info h_i) {
		//for guests
		try {
			sql = "select * from 2132_dv2.HostsInfo where HostName = ? and HostID = ?";
			preparedstatement =db.prepareStatement(sql);
			preparedstatement.setString(1, h_i.getName());
			preparedstatement.setInt(2,h_i.getID());
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
