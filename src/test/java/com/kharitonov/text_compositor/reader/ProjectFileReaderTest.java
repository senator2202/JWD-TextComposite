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
        String expected = StaticDataProvider.TEXT_SOURCE;
        assertEquals(actual, expected);
    }

    @Test(expectedExceptions = ProjectFileReaderException.class,
            expectedExceptionsMessageRegExp = "Error during reading file!")
    public void testReadCaughtIOException() throws ProjectFileReaderException {
        reader.read("blabla");
    }

    @Test(expectedExceptions = ProjectFileReaderException.class,
            expectedExceptionsMessageRegExp = "Null pointer detected!")
    public void testReadCaughtNullException() throws ProjectFileReaderException {
        reader.read(null);
    }
}