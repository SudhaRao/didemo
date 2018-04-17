package guru.springframework.services;

public class EnglishGreetingService implements GreetingServices{
	
	private GreetingRepository greetingRepo;
	
	public EnglishGreetingService(GreetingRepository greetingRepo) {
		super();
		this.greetingRepo = greetingRepo;
	}

	@Override
	public String sayGreeting() {
		// TODO Auto-generated method stub
		return "Hello from English Greeting Service :: " + greetingRepo.getEnglishGreeting();
	}

}
