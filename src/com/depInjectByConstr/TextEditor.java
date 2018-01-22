package com.depInjectByConstr;

public class TextEditor {
	private SpellChecker spellChecker;  
	public TextEditor(SpellChecker sc) {
		this.spellChecker = sc;
	}
	public void spellCheck() {
		spellChecker.checkSpelling();
	}
}
