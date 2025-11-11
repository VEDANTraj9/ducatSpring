package com.ducat.Spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ducat.Spring.model.Employee;

public class Main {

	public static void main(String[] args) {
		ApplicationContext  ioc = new ClassPathXmlApplicationContext("application-context.xml");		
		Employee bean = ioc.getBean("e1",Employee.class);
		System.out.println(bean);
		
		
	}

}
