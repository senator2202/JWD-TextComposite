package com.kharitonov.text_composite.parser.impl;

import com.kharitonov.text_composite.component.impl.CompositeText;
import com.kharitonov.text_composite.parser.BaseParser;
import com.kharitonov.text_composite.type.CompositeType;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ParagraphParser implements BaseParser {
    private static final ParagraphParser INSTANCE = new ParagraphParser();
    private static final SentenceParser SENTENCE_PARSER =
            SentenceParser.getInstance();
    private static final String REGEX_SENTENCE = "[A-ZА-Я][^.?!]+[.?!]+";

    private ParagraphParser() {
    }

    public static ParagraphParser getInstance() {
        return INSTANCE;
    }

    @Override
    public CompositeText parse(String paragraphText) {
        Pattern pattern = Pattern.compile(REGEX_SENTENCE);
        Matcher matcher = pattern.matcher(paragraphText);
        CompositeText paragraph = new CompositeText(CompositeType.PARAGRAPH);
        while (matcher.find()) {
            String sentenceText = matcher.group();
            CompositeText sentence = SENTENCE_PARSER.parse(sentenceText);
            paragraph.add(sentence);
        }
        return paragraph;
    }
}
