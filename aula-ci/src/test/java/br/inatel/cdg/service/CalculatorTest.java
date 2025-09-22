package br.inatel.cdg.service;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    @Test
    public void givenTwoIntegers_whenMethodAdd_theReturnTheirSum(){
        int sum = Calculator.add(1,2);
        assertEquals(3,sum);
    }

    @Test
    public void givenTwoIntegers_whenMethodSubtract_theReturnTheirDifference(){
        int sum = Calculator.subtract(1,2);
        assertEquals(-1,sum);
    }

    @Test
    public void givenTwoIntegers_whenMethodMultiply_theReturnTheirProduct(){
        int sum = Calculator.multiply(1,2);
        assertEquals(2,sum);
    }

}
