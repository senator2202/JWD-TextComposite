package com.kharitonov.text_compositor.component.impl;

import com.kharitonov.text_compositor.component.TextComponent;

import java.util.ArrayList;
import java.util.List;

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

    public TextComponent getChild(int index) {
        return textComponents.get(index);
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (TextComponent textComponent : textComponents) {
            String childText = String.join(SPACE, textComponent.toString());
            builder.append(childText).append(SPACE);
            if (type == CompositeType.TEXT) {
                builder.append(LINE_SEPARATOR);
            }
        }
        builder.deleteCharAt(builder.length() - 1);
        if (type == CompositeType.TEXT) {
            builder.deleteCharAt(builder.length() - 2);
        }
        return builder.toString();
    }
}
