package edu.austral.ingsis.math.Formula;

import java.util.List;

public class Number implements Function {

  private final double value;

  public Number(double value) {
    this.value = value;
  }

  @Override
  public double resolve() {
    return value;
  }

  @Override
  public String print() {
    if (value == Math.floor(value)) {
      return String.valueOf((int) value);
    } else {
      return String.valueOf(value);
    }
  }

  @Override
  public List<String> listVariables() {
    return List.of();
  }
}
