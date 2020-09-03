package com.kharitonov.text_compositor.parser.impl;

import com.kharitonov.text_compositor.component.impl.CompositeText;
import com.kharitonov.text_compositor.data_provider.StaticDataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class LexemeParserTest {
    private final LexemeParser parser = LexemeParser.getInstance();

    @Test
    public void testParse() {
        String sourceText = StaticDataProvider.LEXEME_SOURCE;
        String interpretedText = StaticDataProvider.LEXEME_INTERPRETED;
        CompositeText compositeText = parser.parse(sourceText);
        String actualText = compositeText.toString();
        assertEquals(actualText, interpretedText);
    }
}