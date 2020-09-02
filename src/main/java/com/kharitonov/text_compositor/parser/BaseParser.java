package com.kharitonov.text_compositor.parser;

import com.kharitonov.text_compositor.component.TextComponent;

public interface BaseParser {
    TextComponent parse(String text);
}
