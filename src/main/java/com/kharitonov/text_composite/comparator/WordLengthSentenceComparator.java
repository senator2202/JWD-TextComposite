package com.kharitonov.text_composite.comparator;

import com.kharitonov.text_composite.type.AtomicType;
import com.kharitonov.text_composite.component.TextComponent;
import com.kharitonov.text_composite.component.impl.AtomicText;
import com.kharitonov.text_composite.component.impl.CompositeText;

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
