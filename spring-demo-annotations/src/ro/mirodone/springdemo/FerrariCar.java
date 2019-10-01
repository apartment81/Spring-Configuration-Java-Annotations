package ro.mirodone.springdemo;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class FerrariCar implements Car {
	
	
	// filed injection
	
	@Autowired
	//@Qualifier("happyFortuneService")
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;
	
	
	
	  //default constructor for testing 
	  public FerrariCar() {
	  System.out.println(">> FerrariCar : default constructor"); }
	  
	
	// Spring will scan for a component that implements FortuneService
	//HappyFortuneService will meet the requirement
	
	/*// constructor injection
	 * @Autowired 
	 * public FerrariCar(FortuneService theFortuneService) {
	 * fortuneService = theFortuneService; }
	 */
	
	/*
	 * // setter injection
	 * 
	 * @Autowired public void setFortuneService(FortuneService fortuneService) {
	 * this.fortuneService = fortuneService; }
	 */
	

	@Override
	public String getDailyOffers() {
	
		return "Ferrari keychain for every purchase!";
	}



	@Override
	public String getDailyFortune() {

		
	return fortuneService.getFortune();
	}

}
