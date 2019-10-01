package ro.mirodone.springdemo;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class RandomFortuneService implements FortuneService {

	// create an array of strings
	private String[] data = {
			"1",
			"2",
			"3"
	};

	private Random myRandom  = new Random();

	@Override
	public String getFortune() {

		int index = myRandom.nextInt(data.length);
		String myFortune = data[index];

		return myFortune;
	}

}
