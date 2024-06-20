package edu.austral.ingsis.math.Formula;

import java.util.List;


public class ListLog implements Log{

    private final List<Function> loggedExpressions= List.of();
    @Override
    public Void addExpression(Function log) {
        loggedExpressions.add(log);
        return null;
    }

    @Override
    public String showLoggedExpressions() {
        String result = "";
        for (int i=0; i<loggedExpressions.size(); i++){
            result += (i+1) + ": " + loggedExpressions.get(i).print();
        }
        return result;
    }
}
