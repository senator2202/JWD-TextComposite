package com.kharitonov.text_composite.reader;

import com.kharitonov.text_composite.exception.ProjectFileReaderException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ProjectFileReader {
    private static final Logger LOGGER =
            LogManager.getLogger(ProjectFileReader.class);

    public String read(String fileName) throws ProjectFileReaderException {
        try {
            String data = new String(Files.readAllBytes(Paths.get(fileName)));
            LOGGER.info("File '{}' was successfully read", fileName);
            return data;
        } catch (IOException e) {
            throw new ProjectFileReaderException("Error during reading file!",
                    e);
        } catch (NullPointerException e) {
            throw new ProjectFileReaderException("Null pointer detected!", e);
        }
    }
}