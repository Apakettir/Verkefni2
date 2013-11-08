package is.ru.stringCalc;

import static org.junit.Assert.assertEquals;
import is.ru.stringCalc.Calculator.neikvaedTalaExcep;
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.ExpectedException;

public class testCalculator{

  @Rule
  public ExpectedException exception = ExpectedException.none();

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

  @Test(expected=neikvaedTalaExcep.class)
  public void testException(){
    exception.expectMessage("Negatives not allowed: -5, -9");
    calc.add("4,-5,3,-9");
  }
}
