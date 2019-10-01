package ro.mirodone.springdemo;

import org.springframework.stereotype.Component;

@Component("thatSillyCar")
public class DaciaCar implements Car {
	
	private FortuneService fortuneService;

	@Override
	public String getDailyOffers() {
		
		return "Free MP3 stereo with every purchase !";
	}

	@Override
	public String getDailyFortune() {
	
		return fortuneService.getFortune();
	}

}
