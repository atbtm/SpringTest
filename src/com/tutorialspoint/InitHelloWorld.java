package com.tutorialspoint;

import org.springframework.beans.factory.config.BeanPostProcessor;

public class InitHelloWorld implements BeanPostProcessor{
	public Object postProcessBeforeInitialization(Object bean, String beanName) {
		System.out.println("BeforeInit: "+beanName);
		return bean;
	}
	public Object postProcessAfterInitialization(Object bean, String beanName) {
		System.out.println("AfterInit: "+beanName);
		return bean;
	}
}
