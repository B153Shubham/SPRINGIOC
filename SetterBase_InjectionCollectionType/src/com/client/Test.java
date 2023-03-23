package com.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.model.Student;

public class Test {

	public static void main(String[] args) {
		ApplicationContext ac= new ClassPathXmlApplicationContext("bean1.xml");
		
		Student s=ac.getBean("s",Student.class);
		
		System.out.println(s.getRollno());
		System.out.println(s.getName());
		System.out.println(s.getAddress());

	}

}
