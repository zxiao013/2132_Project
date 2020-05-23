package dao;
import bo.guests_info;
import bo.review_rating_info;

import java.sql.*;

public class review_ratingdetailsDao {
	private Connection db;
	private static String url= "jdbc:postgresql://web0.site.uottawa.ca:15432/zxiao013";
	private static String user= "zxiao013";
	private static String password= "xiaozihan921,";
	private Statement statement;
	private PreparedStatement preparedstatement;
	private String sql;
	private ResultSet resultset;
	
	public review_ratingdetailsDao() {
		try {
			db= DriverManager.getConnection(url, user, password);
		} catch (SQLException e) {
			e.printStackTrace();
			return;
		}
	}
	public void closeDB() {
		try {
			if(statement!= null) {
				statement.close();
			}
			if(resultset!= null) {
				resultset.close();
			}
			if(db!= null) {
				db.close();
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
	}
	public void PrintRate() {
		try {
			//statement = db.createStatement();
			sql = "SELECT PropertyAddress,Rating,Communication,Cleanliness,GuestComment FROM 2132_dv2.review_rating";
			
			preparedstatement =db.prepareStatement(sql);
			
			resultset = preparedstatement.executeQuery();
			while(resultset.next()) {
				System.out.println(resultset.getString(1)+"");
				System.out.println(resultset.getDouble(2)+"");
				System.out.println(resultset.getString(3)+"");
				System.out.println(resultset.getString(4)+"");
				System.out.println(resultset.getString(5)+"");
				System.out.println();
			}
		
		
		}catch(Exception e) {
			System.out.println(e);
		}
	}
	public int createRate(review_rating_info r_i) {
		try{
			sql = "insert into 2132_dv2.ReviewRating values(?,?,?,?,?)";
			preparedstatement = db.prepareStatement(sql);
			preparedstatement.setString(1,r_i.getAddress());
			preparedstatement.setDouble(2, r_i.getRating());
			preparedstatement.setString(3, r_i.getCommunication());
			preparedstatement.setString(4, r_i.getCleanliness());
			preparedstatement.setString(5, r_i.getValueComment());
			return preparedstatement.executeUpdate();
		}catch(SQLException e) {
			e.printStackTrace();
			return 0;
			
		}
	}

}
