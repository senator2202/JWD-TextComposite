package com.kharitonov.text_compositor.comparator;

import com.kharitonov.text_compositor.component.TextComponent;
import com.kharitonov.text_compositor.component.impl.CompositeText;

import java.util.Comparator;

public class ChildrenNumberComparator implements Comparator<TextComponent> {
    @Override
    public int compare(TextComponent o1, TextComponent o2) {
        return ((CompositeText) o1).childrenNumber() -
                ((CompositeText) o2).childrenNumber();
    }
}
