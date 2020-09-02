package com.kharitonov.text_compositor.main;

import com.kharitonov.text_compositor.component.impl.CompositeText;
import com.kharitonov.text_compositor.exception.ProjectFileReaderException;
import com.kharitonov.text_compositor.parser.impl.TextParser;
import com.kharitonov.text_compositor.reader.ProjectFileReader;

public class Main {
    public static void main(String[] args) throws ProjectFileReaderException {
        ProjectFileReader reader = new ProjectFileReader();
        String data = reader.read("input\\text.txt");
        TextParser parser = new TextParser();
        CompositeText compositeText = parser.parse(data);
        System.out.println(compositeText);
    }
}
