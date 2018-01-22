package com.depInjectBySetter;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		AbstractApplicationContext context = 
		new ClassPathXmlApplicationContext("BeansTextEditor.xml");
		TextEditor te = (TextEditor) context.getBean("textEditorBySetter");
		System.out.println("SSSS");
		te.spellCheck();
	}
}
