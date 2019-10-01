package ro.mirodone.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {
		
		//read spring config file
		
		ClassPathXmlApplicationContext context = 
				new ClassPathXmlApplicationContext("applicationContext.xml");
		
		//get bean from spring container
		
		Car theCar = context.getBean("thatSillyCar", Car.class);
		Car bestCar = context.getBean("ferrariCar", Car.class );
		
		//call method on the bean
		
	//	System.out.println(theCar.getDailyOffers());
		System.out.println(bestCar.getDailyOffers());
		
		// call method to get daily fortune
		
		System.out.println(bestCar.getDailyFortune());
		
		// close context
		
		context.close();

	}

}
