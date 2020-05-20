package com.ttt.virtusa.SampleAOP;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context =new ClassPathXmlApplicationContext("AOPspring.xml");
    useInterface pt = ( useInterface)context.getBean("payBean");
    pt.doRegisterUser("krishin");
    
      ((AbstractApplicationContext) context).close();
    }
}
