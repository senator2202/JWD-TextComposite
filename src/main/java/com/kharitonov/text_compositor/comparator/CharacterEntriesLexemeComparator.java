package com.kharitonov.text_compositor.comparator;

import com.kharitonov.text_compositor.component.TextComponent;
import com.kharitonov.text_compositor.component.impl.AtomicText;
import com.kharitonov.text_compositor.component.impl.CompositeText;

import java.util.Comparator;

public class CharacterEntriesLexemeComparator implements Comparator<TextComponent> {
    private final char character;

    public CharacterEntriesLexemeComparator(char character) {
        this.character = character;
    }

    @Override
    public int compare(TextComponent o1, TextComponent o2) {
        int difference = countEntries(o1, character) - countEntries(o2, character);
        return difference == 0
                ? new AlphabeticLexemeComparator().compare(o1, o2)
                : difference;
    }

    private int countEntries(TextComponent textComponent, char character) {
        int count = 0;
        for (TextComponent child : ((CompositeText) textComponent).getChildren()) {
            AtomicText atomicText = (AtomicText) child;
            if (atomicText.getCharacter() == character) {
                count++;
            }
        }
        return count;
    }
}
