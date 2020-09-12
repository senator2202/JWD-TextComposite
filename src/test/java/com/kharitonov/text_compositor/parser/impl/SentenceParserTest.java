package com.kharitonov.text_compositor.parser.impl;

import com.kharitonov.text_compositor.component.impl.CompositeText;
import com.kharitonov.text_compositor.data_provider.StaticDataProvider;
import com.kharitonov.text_compositor.parser.BaseParser;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class SentenceParserTest {
    private final BaseParser parser = SentenceParser.getInstance();

    @Test
    public void testParse() {
        String sourceText = StaticDataProvider.SENTENCE_SOURCE;
        String interpretedText = StaticDataProvider.SENTENCE_INTERPRETED;
        CompositeText compositeText = parser.parse(sourceText);
        String actualText = compositeText.toString();
        assertEquals(actualText, interpretedText);
    }
}