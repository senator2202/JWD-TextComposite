package com.kharitonov.text_compositor.parser.impl;

import com.kharitonov.text_compositor.component.TextComponent;
import com.kharitonov.text_compositor.component.impl.CompositeText;
import com.kharitonov.text_compositor.component.impl.CompositeType;
import com.kharitonov.text_compositor.parser.AbstractParser;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SentenceParser implements AbstractParser {
    private static final String REGEX_SENTENCE = "[A-ZА-Я][^.?!]+[.?!]";

    @Override
    public List<TextComponent> parse(String text) {
        Pattern pattern = Pattern.compile(REGEX_SENTENCE);
        Matcher matcher = pattern.matcher(text);
        List<TextComponent> sentences = new ArrayList<>();
        while (matcher.find()) {
            String sentenceText = matcher.group();
            TextComponent sentence =
                    new CompositeText(CompositeType.SENTENCE);
            List<TextComponent> lexemes =
                    new LexemeParser().parse(sentenceText);
            for (TextComponent lexeme : lexemes) {
                sentence.add(lexeme);
            }
            sentences.add(sentence);
        }
        return sentences;
    }
}
