package com.kharitonov.text_compositor.parser.impl;

import com.kharitonov.text_compositor.component.impl.AtomicText;
import com.kharitonov.text_compositor.component.impl.CompositeText;
import com.kharitonov.text_compositor.interpreter.ArithmeticInterpreter;
import com.kharitonov.text_compositor.interpreter.impl.ArithmeticInterpreterImpl;
import com.kharitonov.text_compositor.parser.BaseParser;
import com.kharitonov.text_compositor.type.AtomicType;
import com.kharitonov.text_compositor.type.CompositeType;

public class LexemeParser implements BaseParser {
    private static final LexemeParser INSTANCE = new LexemeParser();
    private static final String PUNCTUATION = ".,?!:;-()";
    private static final String REGEX_WORD_CHARACTER = "[\\d\\p{L}']";
    private static final String REGEX_EXPRESSION =
            "[(\\d)][\\d\\Q()+-*/\\E]+[\\d\\Q()+-*/\\E]";

    private LexemeParser() {
    }

    public static LexemeParser getInstance() {
        return INSTANCE;
    }

    @Override
    public CompositeText parse(String lexemeText) {
        if (lexemeText.matches(REGEX_EXPRESSION)) {
            ArithmeticInterpreter interpreter = new ArithmeticInterpreterImpl();
            lexemeText = interpreter.interpret(lexemeText);
        }
        CompositeText lexeme = new CompositeText(CompositeType.LEXEME);
        char[] lexemeChars = lexemeText.toCharArray();
        for (char lexemeChar : lexemeChars) {
            AtomicText atomicText = null;
            if (isPunctuation(lexemeChar)) {
                atomicText = new AtomicText(lexemeChar, AtomicType.PUNCTUATION);
            }
            if (isWordCharacter(lexemeChar)) {
                atomicText = new AtomicText(lexemeChar,
                        AtomicType.WORD_CHARACTER);
            }
            if (atomicText != null) {
                lexeme.add(atomicText);
            }
        }
        return lexeme;
    }

    private boolean isWordCharacter(char character) {
        String characterString = String.valueOf(character);
        return characterString.matches(REGEX_WORD_CHARACTER);
    }

    private boolean isPunctuation(char character) {
        String characterString = String.valueOf(character);
        return PUNCTUATION.contains(characterString);
    }
}
