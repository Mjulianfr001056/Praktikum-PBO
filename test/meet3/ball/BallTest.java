/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package meet3.ball;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author user
 */
public class BallTest {
    
    private static Ball b1;
    public BallTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
        b1 = new Ball(0, 0, 5, 3, 4);
    }
    
    @AfterAll
    public static void tearDownClass() {
        b1 = null;
    }
    
    @BeforeEach
    public void setUp() {
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of getX method, of class Ball.
     */
    @Test
    public void testGetX() {
        System.out.println("getX");
        Ball instance = null;
        float expResult = 0.0F;
        float result = instance.getX();
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setX method, of class Ball.
     */
    @Test
    public void testSetX() {
        System.out.println("setX");
        float x = 0.0F;
        Ball instance = null;
        instance.setX(x);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getY method, of class Ball.
     */
    @Test
    public void testGetY() {
        System.out.println("getY");
        Ball instance = null;
        float expResult = 0.0F;
        float result = instance.getY();
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setY method, of class Ball.
     */
    @Test
    public void testSetY() {
        System.out.println("setY");
        float y = 0.0F;
        Ball instance = null;
        instance.setY(y);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getRadius method, of class Ball.
     */
    @Test
    public void testGetRadius() {
        System.out.println("getRadius");
        Ball instance = null;
        int expResult = 0;
        int result = instance.getRadius();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setRadius method, of class Ball.
     */
    @Test
    public void testSetRadius() {
        System.out.println("setRadius");
        int radius = 0;
        Ball instance = null;
        instance.setRadius(radius);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getXDelta method, of class Ball.
     */
    @Test
    public void testGetXDelta() {
        System.out.println("getXDelta");
        Ball instance = null;
        float expResult = 0.0F;
        float result = instance.getXDelta();
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setXDelta method, of class Ball.
     */
    @Test
    public void testSetXDelta() {
        System.out.println("setXDelta");
        float xDelta = 0.0F;
        Ball instance = null;
        instance.setXDelta(xDelta);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getYDelta method, of class Ball.
     */
    @Test
    public void testGetYDelta() {
        System.out.println("getYDelta");
        Ball instance = null;
        float expResult = 0.0F;
        float result = instance.getYDelta();
        assertEquals(expResult, result, 0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setYDelta method, of class Ball.
     */
    @Test
    public void testSetYDelta() {
        System.out.println("setYDelta");
        float yDelta = 0.0F;
        Ball instance = null;
        instance.setYDelta(yDelta);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of move method, of class Ball.
     */
    @Test
    public void testMove() {
        System.out.println("move");
        Ball instance = null;
        instance.move();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of reflectHorizontal method, of class Ball.
     */
    @Test
    public void testReflectHorizontal() {
        System.out.println("reflectHorizontal");
        Ball instance = null;
        instance.reflectHorizontal();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of reflectVertical method, of class Ball.
     */
    @Test
    public void testReflectVertical() {
        System.out.println("reflectVertical");
        Ball instance = null;
        instance.reflectVertical();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of toString method, of class Ball.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Ball instance = null;
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
