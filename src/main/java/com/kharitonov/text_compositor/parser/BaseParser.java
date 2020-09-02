package com.kharitonov.text_compositor.parser;

import com.kharitonov.text_compositor.component.impl.CompositeText;

public interface BaseParser {
    CompositeText parse(String text);
}
