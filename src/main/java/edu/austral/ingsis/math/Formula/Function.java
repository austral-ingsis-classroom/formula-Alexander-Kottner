package edu.austral.ingsis.math.Formula;

import java.util.List;

public interface Function {

  double resolve();

  String print();

  List<String> listVariables();
}
