package com.kharitonov.text_composite.interpreter.impl;

import com.kharitonov.text_composite.interpreter.ArithmeticInterpreter;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class ArithmeticInterpreterImplTest {
    private final ArithmeticInterpreter interpreter =
            new ArithmeticInterpreterImpl();

    @Test
    public void testInterpret() {
        String source = "(-5+1/2*(2+5*2-9))*1200";
        String expected = "-4200";
        String actual = interpreter.interpret(source);
        assertEquals(actual, expected);
    }
}