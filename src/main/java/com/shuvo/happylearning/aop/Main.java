package com.shuvo.happylearning.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.shuvo.happylearning.aop.services.ShapeService;

public class Main {
	
	public static void main(String[] args) {
			
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		ShapeService shpservice = context.getBean("shapeservice",ShapeService.class);
		
		//System.out.println(shpservice.getCircle().getName());
		
		shpservice.getTringle().setName("David");
	}
}
