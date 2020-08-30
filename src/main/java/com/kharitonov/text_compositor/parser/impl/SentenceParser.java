package com.kharitonov.text_compositor.parser.impl;

import com.kharitonov.text_compositor.parser.AbstractParser;

import java.util.Arrays;
import java.util.List;

public class SentenceParser implements AbstractParser {
    private static final String REGEX_SPLIT_SENTENCE = "[?.!]";

    @Override
    public List<String> parse(String text) {
        String [] sentencesArray = text.split(REGEX_SPLIT_SENTENCE);
        return Arrays.asList(sentencesArray);
    }
}
