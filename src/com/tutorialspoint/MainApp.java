package com.tutorialspoint;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class MainApp {
   public static void main(String[] args) {
      AbstractApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");
   //   HelloWorld obj = (HelloWorld) context.getBean("helloWorld");
   //   obj.getMessage();
      HelloChildWorld obj2 = (HelloChildWorld) context.getBean("helloChildWorld");
      obj2.setMessage("aaa");
      obj2.getMessage();
   }
}