package edu.austral.ingsis.math.Formula;

import java.util.List;

public class AbsoluteValue implements Function {

  private final Function expression;

  public AbsoluteValue(Function expression) {
    this.expression = expression;
  }

  @Override
  public double resolve() {
    return Math.abs(expression.resolve());
  }

  @Override
  public String print() {
    return "|" + expression.print() + "|";
  }

  @Override
  public List<String> listVariables() {
    return expression.listVariables();
  }
}
