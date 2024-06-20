package edu.austral.ingsis.math;

import edu.austral.ingsis.math.Formula.*;
import edu.austral.ingsis.math.Formula.Number;
import org.junit.jupiter.api.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.assertThat;

public class ResolutionWithVariablesTest {

  /** Case 1 + x where x = 3 */
  @Test
  public void shouldResolveFunction1() {
    final Double result = new Addition(new Number(1), new Variable("x", 3)).resolve();

    assertThat(result, equalTo(4d));
  }

  /** Case 12 / div where div = 4 */
  @Test
  public void shouldResolveFunction2() {
    final Double result = new Division(new Number(12), new Variable("div", 4)).resolve();

    assertThat(result, equalTo(3d));
  }

  /** Case (9 / x) * y where x = 3 and y = 4 */
  @Test
  public void shouldResolveFunction3() {
    final Double result = new Multiplication(new Division(new Number(9), new Variable("x", 3)), new Variable("y", 4)).resolve();

    assertThat(result, equalTo(12d));
  }

  /** Case (27 / a) ^ b where a = 9 and b = 3 */
  @Test
  public void shouldResolveFunction4() {
    final Double result = new Power(new Division(new Number(27), new Variable("a", 9)), new Variable("b", 3)).resolve();

    assertThat(result, equalTo(27d));
  }

  /** Case z ^ (1/2) where z = 36 */
  @Test
  public void shouldResolveFunction5() {
    final Double result = new SquareRoot(new Variable("z", 36)).resolve();

    assertThat(result, equalTo(6d));
  }

  /** Case |value| - 8 where value = 8 */
  @Test
  public void shouldResolveFunction6() {
    final Double result = new Subtraction(new AbsoluteValue(new Variable("value", 8)), new Number(8)).resolve();

    assertThat(result, equalTo(0d));
  }

  /** Case |value| - 8 where value = 8 */
  @Test
  public void shouldResolveFunction7() {
    final Double result = new Subtraction(new AbsoluteValue(new Variable("value", 8)), new Number(8)).resolve();

    assertThat(result, equalTo(0d));
  }

  /** Case (5 - i) * 8 where i = 2 */
  @Test
  public void shouldResolveFunction8() {
    final Double result = new Multiplication(new Subtraction(new Number(5), new Variable("i", 2)), new Number(8)).resolve();

    assertThat(result, equalTo(24d));
  }
}
