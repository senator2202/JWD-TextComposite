package com.kharitonov.text_compositor.parser;

import com.kharitonov.text_compositor.component.TextComponent;
import com.kharitonov.text_compositor.exception.ParserException;

public interface BaseParser {
    String REGEX_PARAGRAPH = ".+";
    String REGEX_SENTENCE = "[A-ZА-Я][^.?!]+[.?!]";
    String REGEX_LEXEME = "[^\\s]+";

    TextComponent parse(String text) throws ParserException;
}
