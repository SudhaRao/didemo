package guru.springframework.services;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Primary
@Profile({"en", "default"})
public class EnglishGreetingService implements GreetingServices{
	
	private GreetingRepository greetingRepo;
	
	public EnglishGreetingService(GreetingRepository greetingRepo) {
		super();
		this.greetingRepo = greetingRepo;
	}



	@Override
	public String sayGreeting() {
		// TODO Auto-generated method stub
		return "Hello from Primary Greeting Service :: " + greetingRepo.getEnglishGreeting();
	}

}
