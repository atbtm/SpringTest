package com.wireByAnnotation.autoWire;
import org.springframework.beans.factory.annotation.Autowired;

import com.depInjectByConstr.SpellChecker;;
public class TextEditor {
	@Autowired
	private SpellChecker spellChecker;  
	public void spellCheck() {
		spellChecker.checkSpelling();
	}
}
