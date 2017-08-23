package com.draxvel.calc;

import org.junit.Test;

import javax.jws.soap.SOAPBinding;

import static org.junit.Assert.*;

public class CalculatorTest {

    @Test
    public void testAdd() throws Exception {
        Calculator calculator = new Calculator();
        calculator.add(1,1);
        assertEquals(2,calculator.getResult());
    }

    @Test()
    public void testDiv() throws UserException {
        Calculator calculator = new Calculator();
        calculator.div(36,6);
        assertEquals(6,calculator.getResult());
    }

    @Test(expected = Exception.class)
    public void testDivExeption() throws UserException {
        Calculator calculator = new Calculator();
        calculator.div();
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDivRuntimeException() throws UserException {
        Calculator calculator = new Calculator();
        calculator.div(36,0);
    }
}