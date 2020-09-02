package com.kharitonov.text_compositor.parser.impl;

import com.kharitonov.text_compositor.component.TextComponent;
import com.kharitonov.text_compositor.component.impl.CompositeText;
import com.kharitonov.text_compositor.component.impl.CompositeType;
import com.kharitonov.text_compositor.parser.BaseParser;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ParagraphParser implements BaseParser {
    private static final String PARAGRAPH_REGEX = ".+";
    private static final ParagraphParser INSTANCE = new ParagraphParser();
    private static final SentenceParser SENTENCE_PARSER =
            SentenceParser.getInstance();

    private ParagraphParser() {

    }

    public static ParagraphParser getInstance() {
        return INSTANCE;
    }

    @Override
    public List<TextComponent> parse(String text) {
        Pattern pattern = Pattern.compile(PARAGRAPH_REGEX);
        Matcher matcher = pattern.matcher(text);
        List<TextComponent> paragraphs = new ArrayList<>();
        while (matcher.find()) {
            String paragraphText = matcher.group();
            TextComponent paragraph =
                    new CompositeText(CompositeType.PARAGRAPH);
            List<TextComponent> sentences =
                    SENTENCE_PARSER.parse(paragraphText);
            for (TextComponent sentence : sentences) {
                paragraph.add(sentence);
            }
            paragraphs.add(paragraph);
        }
        return paragraphs;
    }
}
