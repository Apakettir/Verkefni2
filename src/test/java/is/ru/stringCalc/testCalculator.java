package is.ru.stringCalc;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class testCalculator{

  Calculator calc = new Calculator();

  @Test
  public void testEmptyString() {
    assertEquals(0, calc.add(""));
  }

  @Test
  public void testOneNumber() {
    assertEquals(1, calc.add("1"));
  }

  @Test
  public void testTwoNumbers() {
    assertEquals(3, calc.add("1, 2"));
  }

  @Test
  public void testThreeNumbers() {
    assertEquals(6, calc.add("1, 2, 3"));
  }

  @Test
  public void testTenNumbers() {
    assertEquals(55, calc.add("1, 2, 3, 4, 5, 6, 7, 8, 9, 10"));
  }

  @Test
  public void testNewLineSplit(){
    assertEquals(7, calc.add("1\n2,4"));
  }

  @Test
  public void testDotDelimiter(){
    assertEquals(6, calc.add("//.\n1.2.3"));
  }
  @Test
  public void testSemicolonDelimiter(){
    assertEquals(7, calc.add("//;\n1;2;4"));
  }
}
