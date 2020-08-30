package com.kharitonov.text_compositor.reader;

import com.kharitonov.text_compositor.data_provider.StaticDataProvider;
import com.kharitonov.text_compositor.exception.ProjectFileReaderException;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class ProjectFileReaderTest {
    private final ProjectFileReader reader = new ProjectFileReader();

    @Test
    public void testRead() throws ProjectFileReaderException {
        String actual = reader.read("input\\text.txt");
        String expected = StaticDataProvider.SOURCE_TEXT;
        assertEquals(actual, expected);
    }
}