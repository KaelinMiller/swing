/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.eonsahead.swing;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author kaeli
 */
public class MatrixTest {
    
    private static final double EPSILON = 1E-8;
    
    public MatrixTest() {
    }
    
    /**
     * Test of get method, of class Matrix.
     */
    @Test
    public void testGet() {
        System.out.println("get");
        int row = 2;
        int column = 2;
        Matrix instance = new Matrix();
        double expResult = 1.0;
        double result = instance.get(row, column);
        assertEquals(expResult, result, EPSILON);
    }

    /**
     * Test of set method, of class Matrix.
     */
    @Test
    public void testSet() {
        int row = 0;
        int column = 0;
        double value = 99.0;
        Matrix instance = new Matrix();
        instance.set(row, column, value);
        double result = instance.get(row, column);
        assertEquals(value, result, EPSILON);
    } // testSet()

    /**
     * Test of identity method, of class Matrix.
     */
    @Test
    public void testIdentity() {
        Matrix instance = new Matrix();
        instance.identity();
        double diagonalElement = 1.0;
        double nonDiagonalElement = 0.0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                double actual = instance.get(i, j);
                if (i == j) {
                    assertEquals(diagonalElement, actual, 1E-8);
                } // if
                else {
                    assertEquals(nonDiagonalElement, actual, 1E-8);
                } // else
            } // for
        } // for
    } // testIdentity()
    
    

    /**
     * Test of rotationZ method, of class Matrix.
     */
    @Test
    public void testRotationZ() {
        System.out.println("rotationZ");
        double angle = 0.0;
        Matrix instance = new Matrix();
        instance.rotationZ(angle);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of multiply method, of class Matrix.
     */
    @Test
    public void testMultiply() {
        System.out.println("multiply");
        Matrix otherMatrix = null;
        Matrix instance = new Matrix();
        Matrix expResult = null;
        Matrix result = instance.multiply(otherMatrix);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Matrix.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Matrix instance = new Matrix();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class Matrix.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Matrix.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
