package com.kharitonov.text_compositor.parser.impl;

import com.kharitonov.text_compositor.component.TextComponent;
import com.kharitonov.text_compositor.component.impl.AtomicText;
import com.kharitonov.text_compositor.parser.AbstractParser;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LexemeParser implements AbstractParser {
    private static final String REGEX_LEXEME =
            "(?<dash>-)|" +
                    "(?<complexWord>\\(?\\p{L}+(-\\p{L}+)+\\)?)|" +
                    "(?<word>\\(?\\p{L}+['.,)?!:;]*)|" +
                    "(?<arithmeticExpression>[(\\d)(ij]" +
                    "[\\d\\s\\Q()+-*/ij\\E]+[\\d\\Q()+-*/ij\\E])";

    public List<TextComponent> parse(String text) {
        Pattern pattern = Pattern.compile(REGEX_LEXEME);
        Matcher matcher = pattern.matcher(text);
        List<TextComponent> lexemes = new ArrayList<>();
        while (matcher.find()) {
            String lexeme = matcher.group();
            TextComponent atomicText = new AtomicText(lexeme);
            lexemes.add(atomicText);
        }
        return lexemes;
    }
}
