package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Spring12Application {

	public static void main(String[] args) {
		ApplicationContext context1 = new ClassPathXmlApplicationContext("BeanPay.xml");
		UPIPayments obj = (UPIPayments) context1.getBean("UPIPayment");
		//UPIPayments obj = context1.getBean("obj",UPIPayments.class);
       System.out.println("UPIPayments:"+obj.getUPImessage1());
       System.out.println("WalletPayments:::"+obj.getWalletPayments().getWalletPaymentsmessage1());
       
	}

}


