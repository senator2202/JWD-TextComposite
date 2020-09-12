package com.kharitonov.text_composite.service;

import com.kharitonov.text_composite.component.TextComponent;
import com.kharitonov.text_composite.component.impl.CompositeText;
import com.kharitonov.text_composite.data_provider.StaticDataProvider;
import org.testng.annotations.Test;

import java.util.List;

import static org.testng.Assert.assertEquals;

public class CompositeTextServiceTest {
    private final CompositeTextService service = new CompositeTextService();

    @Test
    public void testSortParagraphsBySentenceNumber() {
        CompositeText compositeText = StaticDataProvider.COMPOSITE_TEXT;
        List<CompositeText> expectedList = StaticDataProvider.SORTED_PARAGRAPHS;
        List<TextComponent> actualList =
                service.sortParagraphsBySentenceNumber(compositeText);
        assertEquals(actualList, expectedList);
    }

    @Test
    public void testSortSentencesByWordLengths() {
        CompositeText compositeText = StaticDataProvider.COMPOSITE_TEXT;
        List<CompositeText> expectedList =
                StaticDataProvider.SORTED_SENTENCES_WORD_LENGTH;
        List<TextComponent> actualList =
                service.sortSentencesByWordLengths(compositeText);
        assertEquals(actualList, expectedList);
    }

    @Test
    public void testSortSentencesByLexemeLengths() {
        CompositeText compositeText = StaticDataProvider.COMPOSITE_TEXT;
        List<CompositeText> expectedList =
                StaticDataProvider.SORTED_SENTENCES_LEXEME_LENGTH;
        List<TextComponent> actualList =
                service.sortSentencesByLexemeLengths(compositeText);
        assertEquals(actualList, expectedList);
    }

    @Test
    public void testSortLexemesByCharacterEntries() {
        CompositeText compositeText = StaticDataProvider.COMPOSITE_TEXT;
        List<CompositeText> expectedList = StaticDataProvider.SORTED_LEXEMES;
        List<TextComponent> actualList =
                service.sortLexemesByCharacterEntries(compositeText, 'a');
        assertEquals(actualList, expectedList);
    }
}