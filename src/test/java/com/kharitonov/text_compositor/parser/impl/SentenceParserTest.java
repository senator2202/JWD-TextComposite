package com.kharitonov.text_compositor.parser.impl;

import com.kharitonov.text_compositor.data_provider.StaticDataProvider;
import org.testng.annotations.Test;

import java.util.List;

import static org.testng.Assert.assertEquals;

public class SentenceParserTest {
    private final SentenceParser parser = new SentenceParser();

    @Test
    public void testParse() {
        String source = StaticDataProvider.SOURCE_TEXT;
        List<String> sentences = parser.parse(source);
        int actual = sentences.size();
        int expected = 6;
        assertEquals(actual, expected);
    }
}