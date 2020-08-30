package com.kharitonov.text_compositor.parser.impl;

import com.kharitonov.text_compositor.component.TextComponent;
import com.kharitonov.text_compositor.component.impl.CompositeText;
import com.kharitonov.text_compositor.component.impl.CompositeType;
import com.kharitonov.text_compositor.parser.AbstractParser;

import java.util.ArrayList;
import java.util.List;

public class SentenceParser implements AbstractParser {
    private static final String REGEX_SPLIT_SENTENCE = "[?.!]";

    @Override
    public List<TextComponent> parse(String text) {
        String[] sentencesArray = text.split(REGEX_SPLIT_SENTENCE);
        List<TextComponent> sentences = new ArrayList<>();
        int offset = -1;
        for (String sentenceText : sentencesArray) {
            offset+=sentenceText.length()+1;
            sentenceText += (char) text.charAt(offset);
            TextComponent sentence = new CompositeText(CompositeType.SENTENCE);
            List<TextComponent> lexemes = new LexemeParser().parse(sentenceText);
            for (TextComponent lexeme : lexemes) {
                sentence.add(lexeme);
            }
            sentences.add(sentence);
        }
        return sentences;
    }
}
