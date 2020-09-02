package com.kharitonov.text_compositor.parser.impl;

import com.kharitonov.text_compositor.component.impl.CompositeText;
import com.kharitonov.text_compositor.parser.BaseParser;
import com.kharitonov.text_compositor.type.CompositeType;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TextParser implements BaseParser {
    private static final ParagraphParser PARAGRAPH_PARSER =
            ParagraphParser.getInstance();
    private static final String REGEX_PARAGRAPH = ".+";

    @Override
    public CompositeText parse(String text) {
        Pattern pattern = Pattern.compile(REGEX_PARAGRAPH);
        Matcher matcher = pattern.matcher(text);
        CompositeText compositeText = new CompositeText(CompositeType.TEXT);
        while (matcher.find()) {
            String paragraphText = matcher.group();
            CompositeText paragraph = PARAGRAPH_PARSER.parse(paragraphText);
            compositeText.add(paragraph);
        }
        return compositeText;
    }
}
