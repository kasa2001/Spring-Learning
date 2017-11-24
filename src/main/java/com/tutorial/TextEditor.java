package com.tutorial;

public class TextEditor {
    private SpellChecker spellChecker;

    public TextEditor(SpellChecker spellChecker) {
        this.spellChecker = spellChecker;
    }

    public void spellCheck () {
        spellChecker.check();
    }
}
