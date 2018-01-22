package com.depInjectBySetter;

import com.depInjectByConstr.SpellChecker;
public class TextEditor {
	private SpellChecker spellChecker;  
	public TextEditor() {
		System.out.println("Inside TextEditor");
	}
	public void setSpellChecker(SpellChecker spellChecker) {
		this.spellChecker = spellChecker;
	}
	public SpellChecker getSpellChecker() {
		return this.spellChecker;
	}
	public void spellCheck() {
		spellChecker.checkSpelling();
	}
}
