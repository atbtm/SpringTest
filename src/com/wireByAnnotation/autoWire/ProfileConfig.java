package com.wireByAnnotation.autoWire;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProfileConfig {
	@Bean
	public Profile profile() {
		Profile p = new Profile(student());
		return p;
	}
	@Bean
	public Student student() {
		Student s = new Student();
		s.setAge(1);
		s.setName("MM");
		return s;
	}
}
