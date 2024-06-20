package edu.austral.ingsis.math.Formula;

import java.util.ArrayList;
import java.util.List;

public class Power implements Function{
    private final Function base;
    private final Function exponent;

    public Power(Function base, Function exponent) {
        this.base = base;
        this.exponent = exponent;
    }
    @Override
    public double resolve() {
        return Math.pow(base.resolve(), exponent.resolve());
    }

    @Override
    public String print() {
        return "(" + base.print() + " ^ " + exponent.print() + ")";
    }

    @Override
    public List<String> listVariables() {
        List<String> variables = new ArrayList<>(base.listVariables());
        variables.addAll(exponent.listVariables());
        return variables;
    }
}
