package com.kharitonov.text_compositor.parser;

import com.kharitonov.text_compositor.component.TextComponent;

import java.util.List;

public interface AbstractParser {
    List<TextComponent> parse(String text);
}
