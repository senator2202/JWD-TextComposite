package com.kharitonov.text_compositor.parser.impl;

import com.kharitonov.text_compositor.parser.AbstractParser;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ParagraphParser implements AbstractParser {
    private static final String PARAGRAPH_REGEX = ".+";

    @Override
    public List<String> parse(String text) {
        Pattern pattern = Pattern.compile(PARAGRAPH_REGEX);
        Matcher matcher = pattern.matcher(text);
        List<String> paragraphs = new ArrayList<>();
        while (matcher.find()) {
            String paragraph = matcher.group();
            paragraphs.add(paragraph);
        }
        return paragraphs;
    }
}
