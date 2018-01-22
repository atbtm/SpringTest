package com.depInjectByConstr;

public class SpellChecker {
	{
		System.out.println("Injed SpellChecker");
	}
	public SpellChecker(){
		System.out.println("Inside SpellChecker constructor." );
	}
	public void checkSpelling() {
		System.out.println("Checking spelling..");
	}
}
