package guru.springframe.controller;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import guru.springframework.controllers.PropertyInjectedController;
import guru.springframework.services.GreetingServicesImpl;

public class PropertyInjectedControllerTest {
	
	private PropertyInjectedController propertyInjController;
	
	@Before
	public void setUp() throws Exception{
		this.propertyInjController = new PropertyInjectedController();
		this.propertyInjController.greetingServices = new GreetingServicesImpl();
		
	}

	@Test
	public void testGreeting() throws Exception{
		assertEquals(GreetingServicesImpl.HELLO_GURU, propertyInjController.sayHello());
	}

}
