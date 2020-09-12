package com.kharitonov.text_composite.parser.impl;

import com.kharitonov.text_composite.component.impl.CompositeText;
import com.kharitonov.text_composite.data_provider.StaticDataProvider;
import com.kharitonov.text_composite.parser.BaseParser;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class ParagraphParserTest {
    private final BaseParser parser = ParagraphParser.getInstance();

    @Test
    public void testParse() {
        String sourceText = StaticDataProvider.PARAGRAPH_SOURCE;
        String interpretedText = StaticDataProvider.PARAGRAPH_INTERPRETED;
        CompositeText compositeText = parser.parse(sourceText);
        String actualText = compositeText.toString();
        assertEquals(actualText, interpretedText);
    }
}