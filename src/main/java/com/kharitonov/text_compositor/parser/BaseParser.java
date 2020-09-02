package com.kharitonov.text_compositor.parser;

import com.kharitonov.text_compositor.component.TextComponent;
import com.kharitonov.text_compositor.exception.ParserException;

public interface BaseParser {
    TextComponent parse(String text) throws ParserException;
}
