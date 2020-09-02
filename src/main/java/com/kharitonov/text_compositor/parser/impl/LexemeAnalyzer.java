package com.kharitonov.text_compositor.parser.impl;

import com.kharitonov.text_compositor.component.TextComponent;
import com.kharitonov.text_compositor.parser.BaseParser;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LexemeAnalyzer implements BaseParser {
    public static final String REGEX_LEXEME =
            "(?<dash>-)|" +
                    "(?<complexWord>\\(?\\p{L}+(-\\p{L}+)+\\)?)|" +
                    "(?<word>\\(?\\p{L}+['.,)?!:;]*)|" +
                    "(?<arithmeticExpression>[(\\d)(ij]" +
                    "[\\d\\s\\Q()+-*/ij\\E]+[\\d\\Q()+-*/ij\\E])";
    private static final String REGEX_DASH = "|";
    private static final String REGEX_WORD = "(?\\p{L}+['.,)?!:;]*)";
    private static final String REGEX_COMPLEX_WORD =
            "\\(?\\p{L}+(-\\p{L}+)+\\)?)";
    private static final String REGEX_EXPRESSION =
            "[(\\d)(ij][\\d\\s\\Q()+-*/ij\\E]+[\\d\\Q()+-*/ij\\E]";

    @Override
    public List<TextComponent> parse(String text) {
        String regex = LexemeParser.REGEX_LEXEME;
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        if (matcher.find()) {
        }
        return null;//TODO: working on lexeme parsing
    }
}
