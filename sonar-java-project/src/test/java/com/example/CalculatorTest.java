package com.example;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    Calculator calc = new Calculator();

    @Test
    public void testAddition() {
        assertEquals(5, calc.add(2, 3));
    }

    @Test
    public void testSubtraction() {
        assertEquals(1, calc.subtract(5, 4));
    }

    @Test
    public void testMultiplication() {
        assertEquals(20, calc.multiply(4, 5));
    }

    @Test
    public void testDivision() {
        assertEquals(2, calc.divide(10, 5));
    }

    @Test
    public void testDivideByZero() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> calc.divide(5, 0));
        assertEquals("Cannot divide by zero", exception.getMessage());
    }
}

