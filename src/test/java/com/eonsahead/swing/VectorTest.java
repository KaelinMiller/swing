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
public class VectorTest {
    
    private static final double EPSILON = 1E-8;
    
    public VectorTest() {
    }

    /**
     * Test of get method, of class Vector.
     */
    @Test
    public void testGet() {
        System.out.println("get");
        int target = 2;
        Vector instance = new Vector(2,4,17);
        double expResult = 17.0;
        double result = instance.get(target);
        assertEquals(expResult, result, EPSILON);
    }

    /**
     * Test of dot method, of class Vector.
     */
    @Test
    public void testDot() {
        System.out.println("dot");
        Vector v = new Vector(1, 2, 3);
        Vector instance = new Vector(3, 4, 5);
        double expResult = 26.0;
        double result = instance.dot(v);
        assertEquals(expResult, result, EPSILON);
    }

    /**
     * Test of magnitude method, of class Vector.
     */
    @Test
    public void testMagnitude() {
        System.out.println("magnitude");
        Vector instance = new Vector(0, 3, 0);
        double expResult = 3.0;
        double result = instance.magnitude();
        assertEquals(expResult, result, EPSILON);
    }

    /**
     * Test of normalize method, of class Vector.
     */
    @Test
    public void testNormalize() {
        System.out.println("normalize");
        Vector instance = new Vector();
        Vector expResult = null;
        Vector result = instance.normalize();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of Cross method, of class Vector.
     */
    @Test
    public void testCross() {
        System.out.println("Cross");
        Vector v = null;
        Vector instance = new Vector();
        Vector expResult = null;
        Vector result = instance.cross(v);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
