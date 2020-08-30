package com.kharitonov.text_compositor.component.impl;

import com.kharitonov.text_compositor.component.TextComponent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

public class CompositeText implements TextComponent {
    private static final Logger LOGGER = LogManager.getLogger(CompositeText.class);
    private CompositeType type;
    private List<TextComponent> textComponents = new ArrayList<>();

    public CompositeText(CompositeType type) {
        this.type = type;
    }

    public CompositeType getType() {
        return type;
    }

    public void operation() {

    }

    public void add(TextComponent c) {

    }

    public void remove(TextComponent c) {

    }

    public TextComponent getChild(int index) {
        return null;
    }
}
