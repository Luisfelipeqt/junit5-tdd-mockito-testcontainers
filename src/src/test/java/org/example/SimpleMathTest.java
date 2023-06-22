package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleMathTest {

    private SimpleMath simpleMath;

    @BeforeEach
    public void setUp(){
        simpleMath = new SimpleMath();
    };


    @Test
    void testSum(){

        double firstNumber = 6.2D;
        double secondNumber = 2D;

        Double actual = simpleMath.sum(firstNumber, secondNumber);
        Double expected = 8.2D;
        assertEquals(expected, actual,
                () -> firstNumber + " + " + secondNumber + "  did not produce " + expected + "!");
        assertNotEquals(9.2D, actual);
        assertNotNull(actual);
    }


    @Test
    void testSub(){
        double firstNumber = 10D;
        double secondNumber = 5D;

        Double actual = simpleMath.subtraction(firstNumber, secondNumber);
        Double expected = 5D;
        assertEquals(expected, actual);
        assertNotEquals(6D, expected);
        assertNotNull(expected);
    }


    @Test
    void testMult(){
        double firstNumber = 15D;
        double secondNumber = 15D;

        Double actual = simpleMath.multiplication(firstNumber, secondNumber);
        Double expected = 225D;
        assertEquals(actual, expected,
                () -> firstNumber + " * " + secondNumber + " did not produce " + expected);
        assertNotEquals(30, expected);
        assertNotNull(expected);
    }

    @Test
    void testDiv(){
        double firstNumber = 150D;
        double secondNumber = 8D;

        Double actual = simpleMath.division(firstNumber, secondNumber);
        Double expected = 18.75D;
        assertEquals(expected, actual,
                () -> firstNumber + " / " + secondNumber + " did not produce " + expected + "!");
        assertNotEquals(18D, actual);
        assertNotNull(expected);
    }
}