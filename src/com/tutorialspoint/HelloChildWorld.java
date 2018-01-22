package com.tutorialspoint;

public class HelloChildWorld {
	private String message;

	public void setMessage(String message){
		this.message  = message;
	}
	public void getMessage(){
		System.out.println("Your Sub Message : " + message);
	}
}
