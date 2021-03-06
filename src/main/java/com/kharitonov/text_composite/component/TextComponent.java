package com.kharitonov.text_composite.component;

import java.util.Optional;

public interface TextComponent {
    void add(TextComponent c);

    void remove(TextComponent c);

    Optional<TextComponent> getChild(int index);
}
