package com.kharitonov.text_compositor.parser.impl;

import com.kharitonov.text_compositor.data_provider.StaticDataProvider;
import org.testng.annotations.Test;

import java.util.List;

import static org.testng.Assert.assertEquals;

public class LexemeParserTest {
    private final LexemeParser parser = new LexemeParser();

    @Test
    public void testParse() {
        String source = StaticDataProvider.SOURCE_TEXT;
        List<String> lexemes = parser.parse(source);
        int actual = lexemes.size();
        int expected = 126;
        assertEquals(actual, expected);
    }
}