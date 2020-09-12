package com.kharitonov.text_composite.parser.impl;

import com.kharitonov.text_composite.component.impl.CompositeText;
import com.kharitonov.text_composite.data_provider.StaticDataProvider;
import com.kharitonov.text_composite.parser.BaseParser;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class LexemeParserTest {
    private final BaseParser parser = LexemeParser.getInstance();

    @Test
    public void testParse() {
        String sourceText = StaticDataProvider.LEXEME_SOURCE;
        String interpretedText = StaticDataProvider.LEXEME_INTERPRETED;
        CompositeText compositeText = parser.parse(sourceText);
        String actualText = compositeText.toString();
        assertEquals(actualText, interpretedText);
    }
}