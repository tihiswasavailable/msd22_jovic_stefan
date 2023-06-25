package at.fhj.msd;

import at.fhj.Calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    Calculator calculator;

    @BeforeEach
    void setup() {
        calculator = new Calculator();
    }

    @DisplayName("testing add1() method number 1")
    @Test
    void testAdd1() {
        double result = calculator.add(5,9);
        Assertions.assertEquals(14, result);
    }

    @DisplayName("testing add2() method number 2")
    @Test
    void testAdd2() {
        double result = calculator.add(-5,9);
        Assertions.assertEquals(4, result);
    }

    @DisplayName("testing add3() method number 3")
    @Test
    void testAdd3() {
        double result = calculator.add(-5,-9);
        Assertions.assertEquals(-14, result);
    }

    @DisplayName("testing minus1() method number 1")
    @Test
    void testMinus1() {
        double result = calculator.add(9,5);
        Assertions.assertEquals(4, result);
    }

    @DisplayName("testing minus2() method number 2")
    @Test
    void testMinus2() {
        double result = calculator.add(-5,-9);
        Assertions.assertEquals(4, result);
    }

    @DisplayName("testing minus3() method number 3")
    @Test
    void testMinus3() {
        double result = calculator.add(5,9);
        Assertions.assertEquals(-4, result);
    }

    @DisplayName("testing multiply1() method number 1")
    @Test
    void testMultiply1() {
        double result = calculator.add(5,9);
        Assertions.assertEquals(45, result);
    }

    @DisplayName("testing multiply2() method number 2")
    @Test
    void testMultiply2() {
        double result = calculator.add(9,5);
        Assertions.assertEquals(45, result);
    }

    @DisplayName("testing multiply3() method number 3")
    @Test
    void testMultiply3() {
        double result = calculator.add(-5,9);
        Assertions.assertEquals(-45, result);
    }

    @DisplayName("testing divide1() method number 1")
    @Test
    void testDivide1() {
        double result = calculator.add(12,2);
        Assertions.assertEquals(6, result);
    }
    @DisplayName("testing divide2() method number 2")
    @Test
    void testDivide2() {
        double result = calculator.add(10,2);
        Assertions.assertEquals(5, result);
    }
    @DisplayName("testing divide3() method number 3")
    @Test
    void testDivide3() {
        double result = calculator.add(-6,2);
        Assertions.assertEquals(-3, result);
    }
}
