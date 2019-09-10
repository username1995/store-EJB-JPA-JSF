/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import cart.ShoppingCart;
import entity.Customer;
import entity.CustomerOrder;
import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import session.CustomerOrderFacade;
import session.OrderManager;

/**
 *
 * @author Szczominik
 */
public class CustomerOrderControllerIT {
    
    public CustomerOrderControllerIT() {
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
     * Test of getCustomerID method, of class CustomerOrderController.
     */
    @Test
    public void testGetCustomerID() {
        System.out.println("getCustomerID");
        CustomerOrderController instance = new CustomerOrderController();
        int expResult = 0;
        int result = instance.getCustomerID();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getOrderManager method, of class CustomerOrderController.
     */
    @Test
    public void testGetOrderManager() {
        System.out.println("getOrderManager");
        CustomerOrderController instance = new CustomerOrderController();
        OrderManager expResult = null;
        OrderManager result = instance.getOrderManager();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setOrderManager method, of class CustomerOrderController.
     */
    @Test
    public void testSetOrderManager() {
        System.out.println("setOrderManager");
        OrderManager orderManager = null;
        CustomerOrderController instance = new CustomerOrderController();
        instance.setOrderManager(orderManager);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCustomerOrder method, of class CustomerOrderController.
     */
    @Test
    public void testGetCustomerOrder() {
        System.out.println("getCustomerOrder");
        CustomerOrderController instance = new CustomerOrderController();
        CustomerOrderFacade expResult = null;
        CustomerOrderFacade result = instance.getCustomerOrder();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCustomerOrder method, of class CustomerOrderController.
     */
    @Test
    public void testSetCustomerOrder() {
        System.out.println("setCustomerOrder");
        CustomerOrderFacade customerOrder = null;
        CustomerOrderController instance = new CustomerOrderController();
        instance.setCustomerOrder(customerOrder);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPhone method, of class CustomerOrderController.
     */
    @Test
    public void testGetPhone() {
        System.out.println("getPhone");
        CustomerOrderController instance = new CustomerOrderController();
        String expResult = "";
        String result = instance.getPhone();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPhone method, of class CustomerOrderController.
     */
    @Test
    public void testSetPhone() {
        System.out.println("setPhone");
        String phone = "";
        CustomerOrderController instance = new CustomerOrderController();
        instance.setPhone(phone);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCart method, of class CustomerOrderController.
     */
    @Test
    public void testGetCart() {
        System.out.println("getCart");
        CustomerOrderController instance = new CustomerOrderController();
        ShoppingCart expResult = null;
        ShoppingCart result = instance.getCart();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCart method, of class CustomerOrderController.
     */
    @Test
    public void testSetCart() {
        System.out.println("setCart");
        ShoppingCart cart = null;
        CustomerOrderController instance = new CustomerOrderController();
        instance.setCart(cart);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getOrderId method, of class CustomerOrderController.
     */
    @Test
    public void testGetOrderId() {
        System.out.println("getOrderId");
        CustomerOrderController instance = new CustomerOrderController();
        int expResult = 0;
        int result = instance.getOrderId();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setOrderId method, of class CustomerOrderController.
     */
    @Test
    public void testSetOrderId() {
        System.out.println("setOrderId");
        int orderId = 0;
        CustomerOrderController instance = new CustomerOrderController();
        instance.setOrderId(orderId);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getName method, of class CustomerOrderController.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        CustomerOrderController instance = new CustomerOrderController();
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setName method, of class CustomerOrderController.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "";
        CustomerOrderController instance = new CustomerOrderController();
        instance.setName(name);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEmail method, of class CustomerOrderController.
     */
    @Test
    public void testGetEmail() {
        System.out.println("getEmail");
        CustomerOrderController instance = new CustomerOrderController();
        String expResult = "";
        String result = instance.getEmail();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEmail method, of class CustomerOrderController.
     */
    @Test
    public void testSetEmail() {
        System.out.println("setEmail");
        String email = "";
        CustomerOrderController instance = new CustomerOrderController();
        instance.setEmail(email);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getAddress method, of class CustomerOrderController.
     */
    @Test
    public void testGetAddress() {
        System.out.println("getAddress");
        CustomerOrderController instance = new CustomerOrderController();
        String expResult = "";
        String result = instance.getAddress();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAddress method, of class CustomerOrderController.
     */
    @Test
    public void testSetAddress() {
        System.out.println("setAddress");
        String address = "";
        CustomerOrderController instance = new CustomerOrderController();
        instance.setAddress(address);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCityRegion method, of class CustomerOrderController.
     */
    @Test
    public void testGetCityRegion() {
        System.out.println("getCityRegion");
        CustomerOrderController instance = new CustomerOrderController();
        String expResult = "";
        String result = instance.getCityRegion();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCityRegion method, of class CustomerOrderController.
     */
    @Test
    public void testSetCityRegion() {
        System.out.println("setCityRegion");
        String cityRegion = "";
        CustomerOrderController instance = new CustomerOrderController();
        instance.setCityRegion(cityRegion);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCcNumber method, of class CustomerOrderController.
     */
    @Test
    public void testGetCcNumber() {
        System.out.println("getCcNumber");
        CustomerOrderController instance = new CustomerOrderController();
        String expResult = "";
        String result = instance.getCcNumber();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCcNumber method, of class CustomerOrderController.
     */
    @Test
    public void testSetCcNumber() {
        System.out.println("setCcNumber");
        String ccNumber = "";
        CustomerOrderController instance = new CustomerOrderController();
        instance.setCcNumber(ccNumber);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getOrders method, of class CustomerOrderController.
     */
    @Test
    public void testGetOrders() {
        System.out.println("getOrders");
        CustomerOrderController instance = new CustomerOrderController();
        List<CustomerOrder> expResult = null;
        List<CustomerOrder> result = instance.getOrders();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCustOrder method, of class CustomerOrderController.
     */
    @Test
    public void testGetCustOrder() {
        System.out.println("getCustOrder");
        int id = 0;
        CustomerOrderController instance = new CustomerOrderController();
        List<CustomerOrder> expResult = null;
        List<CustomerOrder> result = instance.getCustOrder(id);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of placeOrder method, of class CustomerOrderController.
     */
    @Test
    public void testPlaceOrder() {
        System.out.println("placeOrder");
        Customer c = null;
        ShoppingCart cart = null;
        CustomerOrderController instance = new CustomerOrderController();
        String expResult = "";
        String result = instance.placeOrder(c, cart);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
