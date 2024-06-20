package edu.austral.ingsis.math.Formula;

import java.util.List;

public class SquareRoot implements Function {

  private final Function expression;

  public SquareRoot(Function expression) {
    this.expression = expression;
  }

  @Override
  public double resolve() {
    return Math.sqrt(expression.resolve());
  }

  @Override
  public String print() {
    return "(√" + expression.print() + ")";
  }

  @Override
  public List<String> listVariables() {
    return expression.listVariables();
  }
}
