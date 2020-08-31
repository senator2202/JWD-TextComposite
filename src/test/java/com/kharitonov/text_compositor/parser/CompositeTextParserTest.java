package com.kharitonov.text_compositor.parser;

import com.kharitonov.text_compositor.component.impl.CompositeText;
import com.kharitonov.text_compositor.data_provider.StaticDataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class CompositeTextParserTest {
    private final CompositeTextParser parser = new CompositeTextParser();

    @Test
    public void testParse() {
        String sourceText = StaticDataProvider.SOURCE_TEXT;
        CompositeText compositeText = parser.parse(sourceText);
        String actualText = compositeText.toString();
        assertEquals(actualText, sourceText);
    }
}