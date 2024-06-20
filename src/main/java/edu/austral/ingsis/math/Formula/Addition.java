package edu.austral.ingsis.math.Formula;

import java.util.ArrayList;
import java.util.List;

public class Addition implements Function {

  private final Function left;
  private final Function right;

  public Addition(Function left, Function right) {
    this.left = left;
    this.right = right;
  }

  @Override
  public double resolve() {
    return left.resolve() + right.resolve();
  }

  @Override
  public String print() {
    return "(" + left.print() + " + " + right.print() + ")";
  }

  @Override
  public List<String> listVariables() {
    List<String> variables = new ArrayList<>(left.listVariables());
    variables.addAll(right.listVariables());
    return variables;
  }
}
