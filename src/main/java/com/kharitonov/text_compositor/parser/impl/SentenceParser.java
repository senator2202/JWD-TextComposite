package com.kharitonov.text_compositor.parser.impl;

import com.kharitonov.text_compositor.component.TextComponent;
import com.kharitonov.text_compositor.component.impl.CompositeText;
import com.kharitonov.text_compositor.parser.BaseParser;
import com.kharitonov.text_compositor.type.CompositeType;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SentenceParser implements BaseParser {
    private static final SentenceParser INSTANCE = new SentenceParser();
    private static final LexemeParser LEXEME_PARSER =
            LexemeParser.getInstance();
    private static final String REGEX_LEXEME = "[^\\s]+";

    private SentenceParser() {
    }

    public static SentenceParser getInstance() {
        return INSTANCE;
    }

    @Override
    public CompositeText parse(String sentenceText) {
        Pattern pattern = Pattern.compile(REGEX_LEXEME);
        Matcher matcher = pattern.matcher(sentenceText);
        CompositeText sentence = new CompositeText(CompositeType.SENTENCE);
        while (matcher.find()) {
            String lexemeText = matcher.group();
            TextComponent lexeme = LEXEME_PARSER.parse(lexemeText);
            sentence.add(lexeme);
        }
        return sentence;
    }
}
