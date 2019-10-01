package ro.mirodone.springdemo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationBeanScopeDemoApp {

	public static void main(String[] args) {


		//read spring config file
		
				ClassPathXmlApplicationContext context = 
						new ClassPathXmlApplicationContext("applicationContext.xml");
				
				// retrieve bean from spring container
				
				Car theCar = context.getBean("ferrariCar", Car.class);
				Car bestCar = context.getBean("ferrariCar", Car.class );
				
				
				// check if they are the same
				
				boolean result = (theCar == bestCar);
				
				//print the results
				
				System.out.println(result + " >>" + theCar + " >>" + bestCar);

	}


}
