package edu.austral.ingsis.math;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

import edu.austral.ingsis.math.Formula.*;
import edu.austral.ingsis.math.Formula.Number;
import org.junit.jupiter.api.Test;

public class PrintTest {

  /** Case 1 + 6 */
  @Test
  public void shouldPrintFunction1() {
    final String expected = "(1 + 6)";
    final String result = new Addition(new Number(1), new Number(6)).print();

    assertThat(result, equalTo(expected));
  }

  /** Case 12 / 2 */
  @Test
  public void shouldPrintFunction2() {
    final String expected = "(12 / 2)";
    final String result = new Division(new Number(12), new Number(2)).print();

    assertThat(result, equalTo(expected));
  }

  /** Case (9 / 2) * 3 */
  @Test
  public void shouldPrintFunction3() {
    final String expected = "((9 / 2) * 3)";
    final String result =
        new Multiplication(new Division(new Number(9), new Number(2)), new Number(3)).print();

    assertThat(result, equalTo(expected));
  }

  /** Case (27 / 6) ^ 2 */
  @Test
  public void shouldPrintFunction4() {
    final String expected = "((27 / 6) ^ 2)";
    final String result =
        new Power(new Division(new Number(27), new Number(6)), new Number(2)).print();

    assertThat(result, equalTo(expected));
  }

  /** Case |value| - 8 */
  @Test
  public void shouldPrintFunction6() {
    final String expected = "(|value| - 8)";
    final String result =
        new Subtraction(new AbsoluteValue(new Variable("value", 1)), new Number(8)).print();

    assertThat(result, equalTo(expected));
  }

  /** Case |value| - 8 */
  @Test
  public void shouldPrintFunction7() {
    final String expected = "(|value| - 8)";
    final String result =
        new Subtraction(new AbsoluteValue(new Variable("value", 1)), new Number(8)).print();

    assertThat(result, equalTo(expected));
  }

  /** Case (5 - i) * 8 */
  @Test
  public void shouldPrintFunction8() {
    final String expected = "((5 - i) * 8)";
    final String result =
        new Multiplication(new Subtraction(new Number(5), new Variable("i", 1)), new Number(8))
            .print();

    assertThat(result, equalTo(expected));
  }
}
