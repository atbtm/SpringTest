package com.beanAutowire;

import org.springframework.beans.factory.annotation.Autowired;

import com.depInjectByConstr.SpellChecker;

public class TextEditor {
	private SpellChecker spellChecker;
	private Tokenizer tokenizer;
	private String name;
	public void setSpellChecker( SpellChecker spellChecker ){
		this.spellChecker = spellChecker;
	}
	public void setTokenizer(Tokenizer tk) {
		this.tokenizer = tk;
	}
	public Tokenizer getTokenizer() {
		return this.tokenizer;
	}
	public SpellChecker getSpellChecker() {
		return spellChecker;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void spellCheck() {
		spellChecker.checkSpelling();
	}
	public void tokenize() {
		tokenizer.tokenize();
	}
}
