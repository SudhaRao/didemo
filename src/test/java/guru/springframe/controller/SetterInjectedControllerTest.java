package guru.springframe.controller;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import guru.springframework.controllers.SetterInjectedController;
import guru.springframework.services.GreetingServicesImpl;

public class SetterInjectedControllerTest {

	private SetterInjectedController setterInjController;
	
	@Before
	public void setUp() throws Exception{
		this.setterInjController = new SetterInjectedController();
		this.setterInjController.setGreetingServices(new GreetingServicesImpl());
		
	}

	@Test
	public void testGreeting() throws Exception{
		assertEquals(GreetingServicesImpl.HELLO_GURU, setterInjController.sayHello());
	}

}
