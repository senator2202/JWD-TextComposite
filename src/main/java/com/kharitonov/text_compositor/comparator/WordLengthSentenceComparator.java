package com.kharitonov.text_compositor.comparator;

import com.kharitonov.text_compositor.component.TextComponent;
import com.kharitonov.text_compositor.component.impl.AtomicText;
import com.kharitonov.text_compositor.component.impl.CompositeText;
import com.kharitonov.text_compositor.type.AtomicType;

import java.util.Comparator;
import java.util.List;

public class WordLengthSentenceComparator implements Comparator<TextComponent> {
    @Override
    public int compare(TextComponent o1, TextComponent o2) {
        return totalWordLength(o1) - totalWordLength(o2);
    }

    private int totalWordLength(TextComponent textComponent) {
        CompositeText sentence = (CompositeText) textComponent;
        int sum = 0;
        for (TextComponent lexeme : sentence.getChildren()) {
            List<TextComponent> chars = ((CompositeText) lexeme).getChildren();
            for (TextComponent ch : chars) {
                AtomicText atomicText = ((AtomicText) ch);
                if (atomicText.getType() == AtomicType.WORD_CHARACTER) {
                    sum += 1;
                }
            }
        }
        return sum;
    }
}
