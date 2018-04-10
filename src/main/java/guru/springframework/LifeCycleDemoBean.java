package guru.springframework;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;


@Component
public class LifeCycleDemoBean implements InitializingBean, DisposableBean, BeanNameAware, BeanFactoryAware, ApplicationContextAware {
	
	
	@Autowired
	public LifeCycleDemoBean() {
		super();
		// TODO Auto-generated constructor stub
		System.out.println("## I am in the LifeCycleDemoBean constructor");
	}

	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("## The LifeCycleBean has been terminated");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("## The LifeCycleBean property has been set");
	}
	

	@Override
	public void setBeanFactory(BeanFactory arg0) throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("## The LifeCycleBean factory has been set");
	}

	@Override
	public void setBeanName(String beanName) {
		// TODO Auto-generated method stub
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("## Application Context has been set");
	}
	
	@PostConstruct
	public void postConstruct() {
		System.out.println(" ## PostConstruct annotated method has been called");
	}
	
	@PreDestroy
	public void preDestroy() {
		System.out.println("## PreDestroy annotated methods has been called");

	}
	
	public void beforeInit() {
		System.out.println("## Before Init method - called by Bean Post Processor");

	}
	
	public void afterInit() {
		System.out.println("## After Init method - called by Bean Post Processor");
	}

}
