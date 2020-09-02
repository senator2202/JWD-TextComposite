package com.kharitonov.text_compositor.parser.impl;

import com.kharitonov.text_compositor.component.TextComponent;
import com.kharitonov.text_compositor.component.impl.AtomicText;
import com.kharitonov.text_compositor.parser.BaseParser;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.nfunk.jep.JEP;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LexemeParser implements BaseParser {
    public static final String REGEX_LEXEME = "[^\\s]+";
    private static final String REGEX_EXPRESSION =
            "[(\\d)(ij][\\d\\s\\Q()+-*/ij\\E]+[\\d\\Q()+-*/ij\\E]";
    private static final LexemeParser INSTANCE = new LexemeParser();
    private static final Logger LOGGER =
            LogManager.getLogger(LexemeParser.class);

    private LexemeParser() {

    }

    public static LexemeParser getInstance() {
        return INSTANCE;
    }

    public List<TextComponent> parse(String text) {
        Pattern pattern = Pattern.compile(REGEX_LEXEME);
        Matcher matcher = pattern.matcher(text);
        List<TextComponent> lexemes = new ArrayList<>();
        while (matcher.find()) {
            String lexeme = matcher.group();
            if (lexeme.matches(REGEX_EXPRESSION)) {
                lexeme = interpretExpression(lexeme);
            }
            TextComponent atomicText = new AtomicText(lexeme);
            lexemes.add(atomicText);
        }
        return lexemes;
    }

    private String interpretExpression(String expression) {
        double value;
        JEP jep = new JEP();
        jep.parseExpression(expression);
        value = jep.getValue();
        return String.valueOf((int) value);
    }
}
