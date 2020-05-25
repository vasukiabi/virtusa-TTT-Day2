package com.virtusa.spring.jdbc.jdbc.dao.impl.JdbcPaymentDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.virtusa.spring.jdbc.Payjdbc.Payment;

import com.virtusa.spring.jdbc.jdbc.Paydao.PaymentDAO;

public class JdbcPaymentDAO  implements PaymentDAO{
	
private DataSource dataSource;
	
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
	}
	
	public void insert(Payment payment){
		
		
		String sql = "INSERT INTO PAYMENT " +
				"(MONEY, NAME,ACCNUM) VALUES (?, ?,?)";
		Connection conn = null;
		
		try {
			conn = dataSource.getConnection();
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, payment.getMoney());
			ps.setString(2, payment.getName());
			ps.setInt(3, payment.getAccnum());
			
			
			ps.executeUpdate();
			if(ps.executeUpdate()>0)
			{
				System.out.println("inserted sucessfully");
			}
			ps.close();
			
			
		} catch (SQLException e) {
			throw new RuntimeException(e);
			
		} finally {
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {}
			}
		}
	}
	
	public void findByName(int accnum){
		
		String sql = "SELECT * FROM PAYMENT WHERE NAME = ?";
		
		Connection conn = null;
		
		try {
			conn = dataSource.getConnection();
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setInt(1, accnum);
			Payment payment = null;
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				payment = new Payment(
				rs.getInt("money"),
				rs.getString("name"),
				rs.getInt("accnum"));
					
			}
			
			rs.close();
			ps.close();
			
		} catch (SQLException e) {
			throw new RuntimeException(e);
		} finally {
			if (conn != null) {
				try {
				conn.close();
				} catch (SQLException e) {}
			}
		}

}
}
