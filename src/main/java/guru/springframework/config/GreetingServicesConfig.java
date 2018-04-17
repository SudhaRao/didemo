package guru.springframework.config;

import org.springframework.context.annotation.Bean;


import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;

import guru.springframework.services.GreetingRepository;
import guru.springframework.services.GreetingServices;
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
	public GreetingServices englishGreetingServicesFactory(GreetingServicesFactory grtRepo) {
		return grtRepo.createGreetingService("en");
	}
	
	@Bean
	@Primary
	@Profile("ka")
	public GreetingServices KannadaGreetingServicesFactory(GreetingServicesFactory grtRepo) {
		return  grtRepo.createGreetingService("ka");
	}
	
	@Bean
	@Primary
	@Profile("ma")
	public GreetingServices MalayalamGreetingServicesFactory(GreetingServicesFactory grtRepo) {
		return grtRepo.createGreetingService("ma");
	}
	
	
	

}
