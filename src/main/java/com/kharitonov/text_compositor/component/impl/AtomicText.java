package com.kharitonov.text_compositor.component.impl;

import com.kharitonov.text_compositor.component.TextComponent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Optional;


public class AtomicText implements TextComponent {
    private static final Logger LOGGER = LogManager.getLogger(AtomicText.class);
    private String text;

    public AtomicText(String text) {
        this.text = text;
    }

    public void add(TextComponent c) {
        LOGGER.error("Impossible to add components to atomic text object!");
    }

    public void remove(TextComponent c) {
        LOGGER.error("Impossible to remove components from " +
                "atomic text object!");
    }

    public Optional<TextComponent> getChild(int index) {
        LOGGER.error("Impossible to get child components from " +
                "atomic text object!");
        return Optional.empty();
    }

    @Override
    public String toString() {
        return text;
    }
}
