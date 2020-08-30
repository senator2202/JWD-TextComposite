package com.kharitonov.text_compositor.component.impl;

import com.kharitonov.text_compositor.parser.AbstractParser;
import com.kharitonov.text_compositor.parser.impl.DefaultParser;
import com.kharitonov.text_compositor.parser.impl.LexemeParser;
import com.kharitonov.text_compositor.parser.impl.ParagraphParser;
import com.kharitonov.text_compositor.parser.impl.SentenceParser;

public enum CompositeType {
    TEXT(new ParagraphParser()),
    PARAGRAPH(new SentenceParser()),
    SENTENCE(new LexemeParser()),
    LEXEME(new DefaultParser());

    private AbstractParser parser;

    CompositeType(AbstractParser parser) {
        this.parser = parser;
    }

    public AbstractParser getParser() {
        return parser;
    }
}
