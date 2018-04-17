package guru.springframework;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

import guru.springframework.config.GreetingServicesConfig;
import guru.springframework.controllers.ConstructorInjectedController;
import guru.springframework.controllers.HelloController;
import guru.springframework.controllers.PropertyInjectedController;
import guru.springframework.controllers.SetterInjectedController;

@SpringBootApplication
@ComponentScan(basePackages="guru.springframework")

public class DiDemoApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(DiDemoApplication.class, args);		
		
		HelloController helloCtr = (HelloController)ctx.getBean(HelloController.class);
				
		
		System.out.println("\n" + helloCtr.sayHello());
		
		System.out.println(ctx.getBean(PropertyInjectedController.class).sayHello());
		
		System.out.println(ctx.getBean(SetterInjectedController.class).sayHello());

		System.out.println(ctx.getBean(ConstructorInjectedController.class).sayHello() +"\n");

	}
}
