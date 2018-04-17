package guru.springframework.config;

import org.springframework.context.annotation.Bean;


import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

import guru.springframework.services.GreetingRepository;
import guru.springframework.services.GreetingServicesFactory;

@Configuration
public class GreetingServicesConfig {
	
	@Bean
	public GreetingServicesFactory greetingServicesFactory(GreetingRepository grtRepo) {
		return new GreetingServicesFactory(grtRepo);
	}
	
	@Bean
	@Primary
	@Profile({"default","en"})
	public GreetingServicesFactory englishGreetingServicesFactory(GreetingRepository grtRepo) {
		return new GreetingServicesFactory(grtRepo);
	}
	
	@Bean
	@Primary
	@Profile("ka")
	public GreetingServicesFactory KannadaGreetingServicesFactory(GreetingRepository grtRepo) {
		return new GreetingServicesFactory(grtRepo);
	}
	
	@Bean
	@Primary
	@Profile("ma")
	public GreetingServicesFactory MalayalamGreetingServicesFactory(GreetingRepository grtRepo) {
		return new GreetingServicesFactory(grtRepo);
	}
	
	
	

}
