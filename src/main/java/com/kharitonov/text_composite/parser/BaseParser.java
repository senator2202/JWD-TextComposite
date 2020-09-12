package com.kharitonov.text_composite.parser;

import com.kharitonov.text_composite.component.impl.CompositeText;

public interface BaseParser {
    CompositeText parse(String text);
}
