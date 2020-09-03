package com.kharitonov.text_compositor.service;

import com.kharitonov.text_compositor.component.TextComponent;
import com.kharitonov.text_compositor.component.impl.CompositeText;
import com.kharitonov.text_compositor.data_provider.StaticDataProvider;
import org.testng.annotations.Test;

import java.util.List;

public class CompositeTextServiceTest {
    private final CompositeTextService service = new CompositeTextService();

    @Test
    public void testSortParagraphsBySentenceNumber() {
        CompositeText compositeText = StaticDataProvider.COMPOSITE_TEXT;
        List<TextComponent> list =
                service.sortParagraphsBySentenceNumber(compositeText);
    }

    @Test
    public void testSortSentencesByLexemeLengths() {
        CompositeText compositeText = StaticDataProvider.COMPOSITE_TEXT;
        List<TextComponent> list =
                service.sortSentencesByLexemeLengths(compositeText);
    }

    @Test
    public void testSortSentencesByWordLengths() {
        CompositeText compositeText = StaticDataProvider.COMPOSITE_TEXT;
        List<TextComponent> list =
                service.sortSentencesByWordLengths(compositeText);
    }

    @Test
    public void testSortLexemesByCharacterEntries() {
        CompositeText compositeText = StaticDataProvider.COMPOSITE_TEXT;
        List<TextComponent> list =
                service.sortLexemesByCharacterEntries(compositeText, 'a');
    }
}