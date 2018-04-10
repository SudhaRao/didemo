package guru.springframe.controller;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import guru.springframework.controllers.ConstructorInjectedController;
import guru.springframework.services.GreetingServicesImpl;

public class ConstructorInjectedControllerTest {

	private ConstructorInjectedController constrInjController;
	
	
	@Before
	public void setUp() throws Exception{
		this.constrInjController = new ConstructorInjectedController(new GreetingServicesImpl());
	}

	@Test
	public void testGreeting() throws Exception{
		assertEquals(GreetingServicesImpl.HELLO_GURU, constrInjController.sayHello());
	}

}
