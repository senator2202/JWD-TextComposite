package com.kharitonov.text_compositor.reader;

import com.kharitonov.text_compositor.exception.ProjectFileReaderException;
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
            String message = String.format("File %s was successfully read!",
                    fileName);
            LOGGER.info(message);
            return data;
        } catch (IOException e) {
            throw new ProjectFileReaderException("Error during reading file!",
                    e);
        } catch (NullPointerException e) {
            throw new ProjectFileReaderException("Null pointer detected!", e);
        }
    }
}