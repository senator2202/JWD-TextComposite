package com.kharitonov.text_compositor.parser.impl;

import com.kharitonov.text_compositor.component.impl.CompositeText;
import com.kharitonov.text_compositor.data_provider.StaticDataProvider;
import com.kharitonov.text_compositor.exception.ParserException;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class ParagraphParserTest {
    private final ParagraphParser parser = ParagraphParser.getInstance();

    @Test
    public void testParse() throws ParserException {
        String sourceText = StaticDataProvider.PARAGRAPH_SOURCE;
        String interpretedText = StaticDataProvider.PARAGRAPH_INTERPRETED;
        CompositeText compositeText = parser.parse(sourceText);
        String actualText = compositeText.toString();
        assertEquals(actualText, interpretedText);
    }
}