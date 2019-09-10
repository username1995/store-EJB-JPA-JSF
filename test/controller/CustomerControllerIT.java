/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import entity.Customer;
import entity.CustomerOrder;
import java.util.Collection;
import java.util.List;
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
public class CustomerControllerIT {
    
    public CustomerControllerIT() {
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
     * Test of getSelected method, of class CustomerController.
     */
    @Test
    public void testGetSelected() {
        System.out.println("getSelected");
        CustomerController instance = new CustomerController();
        String expResult = "";
        String result = instance.getSelected();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSelected method, of class CustomerController.
     */
    @Test
    public void testSetSelected() {
        System.out.println("setSelected");
        String selected = "";
        CustomerController instance = new CustomerController();
        instance.setSelected(selected);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSelectedCustomer method, of class CustomerController.
     */
    @Test
    public void testGetSelectedCustomer() {
        System.out.println("getSelectedCustomer");
        CustomerController instance = new CustomerController();
        Customer expResult = null;
        Customer result = instance.getSelectedCustomer();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSelectedCustomerId method, of class CustomerController.
     */
    @Test
    public void testGetSelectedCustomerId() {
        System.out.println("getSelectedCustomerId");
        CustomerController instance = new CustomerController();
        Integer expResult = null;
        Integer result = instance.getSelectedCustomerId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCustomers method, of class CustomerController.
     */
    @Test
    public void testGetCustomers() {
        System.out.println("getCustomers");
        CustomerController instance = new CustomerController();
        List<Customer> expResult = null;
        List<Customer> result = instance.getCustomers();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getcustomerorderCollection method, of class CustomerController.
     */
    @Test
    public void testGetcustomerorderCollection() {
        System.out.println("getcustomerorderCollection");
        CustomerController instance = new CustomerController();
        Collection<CustomerOrder> expResult = null;
        Collection<CustomerOrder> result = instance.getcustomerorderCollection();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSelectedCustomer method, of class CustomerController.
     */
    @Test
    public void testSetSelectedCustomer() {
        System.out.println("setSelectedCustomer");
        Customer selectedCustomer = null;
        CustomerController instance = new CustomerController();
        instance.setSelectedCustomer(selectedCustomer);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSelectedCustomerId method, of class CustomerController.
     */
    @Test
    public void testSetSelectedCustomerId() {
        System.out.println("setSelectedCustomerId");
        Integer selectedCustomerId = null;
        CustomerController instance = new CustomerController();
        instance.setSelectedCustomerId(selectedCustomerId);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
