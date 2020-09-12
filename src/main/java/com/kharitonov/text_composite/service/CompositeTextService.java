package com.kharitonov.text_composite.service;

import com.kharitonov.text_composite.comparator.CharacterEntriesLexemeComparator;
import com.kharitonov.text_composite.comparator.ChildrenNumberComparator;
import com.kharitonov.text_composite.comparator.LexemeLengthSentenceComparator;
import com.kharitonov.text_composite.comparator.WordLengthSentenceComparator;
import com.kharitonov.text_composite.component.TextComponent;
import com.kharitonov.text_composite.component.impl.CompositeText;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class CompositeTextService {
    public List<TextComponent> sortParagraphsBySentenceNumber(CompositeText compositeText) {
        List<TextComponent> paragraphs =
                new ArrayList<>(compositeText.getChildren());
        Comparator<TextComponent> comparator = new ChildrenNumberComparator();
        paragraphs.sort(comparator);
        return paragraphs;
    }

    public List<TextComponent> sortSentencesByWordLengths(CompositeText compositeText) {
        List<TextComponent> sentences = getAllSentences(compositeText);
        Comparator<TextComponent> comparator =
                new WordLengthSentenceComparator();
        sentences.sort(comparator);
        return sentences;
    }

    public List<TextComponent> sortSentencesByLexemeLengths(CompositeText compositeText) {
        List<TextComponent> sentences = getAllSentences(compositeText);
        Comparator<TextComponent> comparator =
                new LexemeLengthSentenceComparator();
        sentences.sort(comparator);
        return sentences;
    }

    public List<TextComponent> sortLexemesByCharacterEntries(CompositeText compositeText,
                                                             char character) {
        List<TextComponent> lexemes = getAllLexemes(compositeText);
        Comparator<TextComponent> comparator =
                new CharacterEntriesLexemeComparator(character);
        lexemes.sort(comparator);
        return lexemes;
    }

    private List<TextComponent> getAllLexemes(CompositeText compositeText) {
        List<TextComponent> lexemes = new ArrayList<>();
        for (TextComponent paragraph : compositeText.getChildren()) {
            for (TextComponent sentence : ((CompositeText) paragraph).getChildren()) {
                lexemes.addAll(((CompositeText) sentence).getChildren());
            }
        }
        return lexemes;
    }

    private List<TextComponent> getAllSentences(CompositeText compositeText) {
        List<TextComponent> sentences = new ArrayList<>();
        for (TextComponent paragraph : compositeText.getChildren()) {
            sentences.addAll(((CompositeText) paragraph).getChildren());
        }
        return sentences;
    }
}
