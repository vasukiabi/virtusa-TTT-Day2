package com.virtusa.spring.jdbc.Payjdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.virtusa.spring.jdbc.Payjdbc.Payment;
import com.virtusa.spring.jdbc.jdbc.Paydao.PaymentDAO;
//import com.virtusa.spring.jdbc.jdbc.dao.CustomerDAO;

public class AppPayment {
	
	public static void main(String[] args) {
		
		
		ApplicationContext context = 
        		new ClassPathXmlApplicationContext("Spring-ModulePay.xml");
        	 
		PaymentDAO paymentDAO = (PaymentDAO)context.getBean("paymentDAO");
		
		
		Payment payment = new Payment(500, "mmmmi",23);
		
           // System.out.println(paymentDAO);
            paymentDAO.insert(payment);
            
          //  System.out.println("enter id to display");
             paymentDAO.findByName(2355);
           // System.out.println(payment1);
	}

}
