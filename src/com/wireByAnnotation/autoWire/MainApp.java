package com.wireByAnnotation.autoWire;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	public static void main(String[] args) {
		/**
		 * autowired 
		 * 
		AbstractApplicationContext context = 
				new ClassPathXmlApplicationContext("BeansTextEditor.xml");
		TextEditor te = (TextEditor) context.getBean("autoWiredTextEditor");
		te.spellCheck();
		context = new ClassPathXmlApplicationContext("AnnotationBeans.xml");
		Profile p = (Profile) context.getBean("profile");
		p.printAge();
		p.printName();*/

		System.out.println("===============================");
		AnnotationConfigApplicationContext ctx = 
				new AnnotationConfigApplicationContext(ProfileConfig.class);
		Profile p2 = (Profile) ctx.getBean(Profile.class);
		p2.printAge();
		p2.printName();
	}
}
