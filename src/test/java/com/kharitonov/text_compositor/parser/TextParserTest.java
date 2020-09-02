package com.kharitonov.text_compositor.parser;

import com.kharitonov.text_compositor.component.impl.CompositeText;
import com.kharitonov.text_compositor.data_provider.StaticDataProvider;
import com.kharitonov.text_compositor.parser.impl.TextParser;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class TextParserTest {
    private final TextParser parser = new TextParser();

    @Test
    public void testParse() {
        String sourceText = StaticDataProvider.SOURCE_TEXT;
        String interpretedText = StaticDataProvider.INTERPRETED_TEXT;
        CompositeText compositeText = parser.parse(sourceText);
        String actualText = compositeText.toString();
        assertEquals(actualText, interpretedText);
    }
}