package com.kharitonov.text_compositor.component.impl;

import com.kharitonov.text_compositor.component.TextComponent;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class CompositeText implements TextComponent {
    private static final String SPACE = " ";
    private static final String LINE_SEPARATOR;

    static {
        LINE_SEPARATOR = System.getProperty("line.separator");
    }

    private CompositeType type;
    private List<TextComponent> textComponents = new ArrayList<>();

    public CompositeText(CompositeType type) {
        this.type = type;
    }

    public CompositeType getType() {
        return type;
    }

    public void add(TextComponent c) {
        textComponents.add(c);
    }

    public void remove(TextComponent c) {
        textComponents.remove(c);
    }

    public Optional<TextComponent> getChild(int index) {
        return index >= 0 && index < textComponents.size()
                ? Optional.of(textComponents.get(index))
                : Optional.empty();
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        String delimiter = type == CompositeType.TEXT
                ? LINE_SEPARATOR
                : SPACE;
        int delta = type == CompositeType.TEXT ? 2 : 1;
        for (TextComponent textComponent : textComponents) {
            String childText = String.join(delimiter, textComponent.toString());
            builder.append(childText).append(delimiter);
        }
        builder.delete(builder.length() - delta, builder.length());
        return builder.toString();
    }
}
