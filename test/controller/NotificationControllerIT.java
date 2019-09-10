/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Szczominik
 */
public class NotificationControllerIT {
    
    public NotificationControllerIT() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getEmail method, of class NotificationController.
     */
    @Test
    public void testGetEmail() {
        System.out.println("getEmail");
        int orderId = 0;
        NotificationController instance = new NotificationController();
        String expResult = "";
        String result = instance.getEmail(orderId);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getOrderDetails method, of class NotificationController.
     */
    @Test
    public void testGetOrderDetails() {
        System.out.println("getOrderDetails");
        int orderId = 0;
        NotificationController instance = new NotificationController();
        ArrayList<String> expResult = null;
        ArrayList<String> result = instance.getOrderDetails(orderId);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of send method, of class NotificationController.
     */
    @Test
    public void testSend() {
        System.out.println("send");
        int orderId = 0;
        NotificationController instance = new NotificationController();
        instance.send(orderId);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
