package com.kharitonov.text_composite.comparator;

import com.kharitonov.text_composite.component.TextComponent;
import com.kharitonov.text_composite.component.impl.CompositeText;

import java.util.Comparator;

public class LexemeLengthSentenceComparator implements Comparator<TextComponent> {
    @Override
    public int compare(TextComponent o1, TextComponent o2) {
        return totalLexemeLength(o1) - totalLexemeLength(o2);
    }

    private int totalLexemeLength(TextComponent textComponent) {
        CompositeText sentence = (CompositeText) textComponent;
        int sum = 0;
        for (TextComponent lexeme : sentence.getChildren()) {
            sum += ((CompositeText) lexeme).childrenNumber();
        }
        return sum;
    }
}
