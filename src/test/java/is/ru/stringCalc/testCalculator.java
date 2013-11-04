package is.ru.stringCalc;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class testCalculator{

  Calculator calc = new Calculator();

  @Test
  public void testEmptyString() {
    assertEquals(0, calc.add(""));
  }
}
