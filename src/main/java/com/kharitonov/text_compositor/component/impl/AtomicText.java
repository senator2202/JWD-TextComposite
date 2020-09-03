package com.kharitonov.text_compositor.component.impl;

import com.kharitonov.text_compositor.component.TextComponent;
import com.kharitonov.text_compositor.type.AtomicType;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Optional;

public class AtomicText implements TextComponent {
    private static final Logger LOGGER = LogManager.getLogger(AtomicText.class);
    private final char character;
    private final AtomicType type;

    public AtomicText(char character, AtomicType type) {
        this.character = character;
        this.type = type;
    }

    public char getCharacter() {
        return character;
    }

    public AtomicType getType() {
        return type;
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
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AtomicText that = (AtomicText) o;
        if (character != that.character) {
            return false;
        }
        return type == that.type;
    }

    @Override
    public int hashCode() {
        int result = character;
        result = 31 * result + type.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return String.valueOf(character);
    }
}
