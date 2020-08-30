package com.kharitonov.text_compositor.component;

public interface TextComponent {
    void operation();
    void add(TextComponent c);
    void remove(TextComponent c);
    TextComponent getChild(int index);
}
