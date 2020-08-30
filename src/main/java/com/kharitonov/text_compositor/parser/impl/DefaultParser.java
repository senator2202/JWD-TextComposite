package com.kharitonov.text_compositor.parser.impl;

import com.kharitonov.text_compositor.component.TextComponent;
import com.kharitonov.text_compositor.parser.AbstractParser;

import java.util.ArrayList;
import java.util.List;

public class DefaultParser implements AbstractParser {
    @Override
    public List<TextComponent> parse(String text) {
        List<String> list = new ArrayList<>();
        list.add(text);
        return null;
    }
}
