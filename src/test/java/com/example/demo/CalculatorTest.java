package com.example.demo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    private Calculator calc;
    private final int a = 9, b = 3;
    private final double aa= 9, bb = 3;
    @BeforeEach
    void setUp() {
        calc = new Calculator();
    }

    @Test
    void add() {

           int result = calc.add(a,b);
           assertEquals(12,result);

    }

    @Test
    void subtract() {
        int result = calc.subtract(a,b);
        assertEquals(6,result);
    }

    @Test
    void division() {
        int result = calc.division(a,b);
        assertEquals(3,result);
    }

    @Test
    void multiply() {
        int result = calc.multiply(a,b);
        assertEquals(27,result);
    }

    @Test
    void divisionbyzero() {

        assertThrows(IllegalArgumentException.class,()-> calc.division(a, 0));
    }

    @Test
    void square_of_a_number() {
        int result = calc.square(a);
        assertEquals(81,result);
    }
    @Test
    void power_of_a_number() {
        double result = calc.power(aa,bb);
        assertEquals(729,result); // 9 power 3
    }

}