package com.testwebsite;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class RegisterDao {

	private String dburl = "jdbc:mysql://localhost:3306/userdb";

	private String dbuname = "root";

	private String dbpassword = "root";

	private String dbdriver = "com.mysql.cj.jdbc.Driver";

	
	public void loadDriver(String dbdriver) {
		try {
			Class.forName(dbdriver);
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
	}
	
	
	
	public Connection getConnection() {
		Connection con = null;
		try {
			con = DriverManager.getConnection(dburl, dbuname, dbpassword);
		} catch (SQLException e) {
		
			e.printStackTrace();
		}

		return con;

	}

	public String insert(Member member) {

		loadDriver(dbdriver);
		Connection con = getConnection();
		String sql = "insert into userdb.member(uname,password,email,phone) values(?,?,?,?)";
		PreparedStatement ps;
		String result="Data entered Successfully";
		try {
			ps = con.prepareStatement(sql);

			ps.setString(1, member.getUname());

			ps.setString(2, member.getPassword());
			ps.setString(3, member.getPhone());

			ps.setString(4, member.getEmail());
			ps.executeUpdate();
			ps.close();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
			result="data not entered";
		}

		return result;

	}

}
