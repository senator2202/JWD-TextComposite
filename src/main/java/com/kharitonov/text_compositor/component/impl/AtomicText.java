package com.kharitonov.text_compositor.component.impl;

import com.kharitonov.text_compositor.component.TextComponent;


public class AtomicText implements TextComponent {
    private String text;

    public AtomicText(String text) {
        this.text = text;
    }

    public void add(TextComponent c) {

    }

    public void remove(TextComponent c) {

    }

    public TextComponent getChild(int index) {
        return null;
    }

    @Override
    public String toString() {
        return text;
    }
}
