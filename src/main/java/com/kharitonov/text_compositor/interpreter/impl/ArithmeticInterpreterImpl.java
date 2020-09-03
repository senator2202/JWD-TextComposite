package com.kharitonov.text_compositor.interpreter.impl;

import com.kharitonov.text_compositor.interpreter.ArithmeticInterpreter;
import org.nfunk.jep.JEP;

public class ArithmeticInterpreterImpl implements ArithmeticInterpreter {
    @Override
    public String interpret(String expression) {
        double value;
        JEP jep = new JEP();
        jep.parseExpression(expression);
        value = jep.getValue();
        return String.valueOf((int) value);
    }
}
