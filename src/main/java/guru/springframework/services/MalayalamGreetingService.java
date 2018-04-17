package guru.springframework.services;


public class MalayalamGreetingService implements GreetingServices{
	
	private GreetingRepository greetingRepo;
	
	public MalayalamGreetingService(GreetingRepository greetingRepo) {
		super();
		this.greetingRepo = greetingRepo;
	}

	
	@Override
	public String sayGreeting() {
		// TODO Auto-generated method stub
		return "Hello from Malayalam Greeting Service";
	}


}
