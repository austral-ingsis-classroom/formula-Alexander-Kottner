package edu.austral.ingsis.math.Formula;

import java.util.List;

public class Variable implements Function {
  private final String name;
  private final double value;

  public Variable(String name, double value) {
    this.name = name;
    this.value = value;
  }

  @Override
  public double resolve() {
    return value;
  }

  @Override
  public String print() {
    return name;
  }

  @Override
  public List<String> listVariables() {
    return List.of(name);
  }
}
