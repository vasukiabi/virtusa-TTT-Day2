package com.virtusa.spring.jdbc.jdbc.Paydao;

import com.virtusa.spring.jdbc.Payjdbc.Payment;



public interface PaymentDAO {
	public void insert(Payment payment) ;
		// TODO Auto-generated method stub
		
	
	public void findByName(int accnum);

}
