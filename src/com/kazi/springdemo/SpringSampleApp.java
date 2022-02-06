package com.kazi.springdemo;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringSampleApp {

	public static void main(String[] args) {

		// load spring configuration
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		// get beans from spring container
		Coach theCoach = context.getBean("myCoach", Coach.class);

		// call methods on the bean
		System.out.println(theCoach.getDailyWorkout());

		// close context
		context.close();
	}

}
