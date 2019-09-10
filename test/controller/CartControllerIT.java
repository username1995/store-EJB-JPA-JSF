/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import cart.ShoppingCart;
import cart.ShoppingCartItem;
import entity.Product;
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
public class CartControllerIT {
    
    public CartControllerIT() {
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
     * Test of getCart method, of class CartController.
     */
    @Test
    public void testGetCart() {
        System.out.println("getCart");
        CartController instance = new CartController();
        ShoppingCart expResult = null;
        ShoppingCart result = instance.getCart();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCart method, of class CartController.
     */
    @Test
    public void testSetCart() {
        System.out.println("setCart");
        ShoppingCart cart = null;
        CartController instance = new CartController();
        instance.setCart(cart);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getQuantity method, of class CartController.
     */
    @Test
    public void testGetQuantity() {
        System.out.println("getQuantity");
        CartController instance = new CartController();
        String expResult = "";
        String result = instance.getQuantity();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setQuantity method, of class CartController.
     */
    @Test
    public void testSetQuantity() {
        System.out.println("setQuantity");
        String quantity = "";
        CartController instance = new CartController();
        instance.setQuantity(quantity);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addToCart method, of class CartController.
     */
    @Test
    public void testAddToCart() {
        System.out.println("addToCart");
        Product product = null;
        CartController instance = new CartController();
        String expResult = "";
        String result = instance.addToCart(product);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of viewCart method, of class CartController.
     */
    @Test
    public void testViewCart() {
        System.out.println("viewCart");
        CartController instance = new CartController();
        String expResult = "";
        String result = instance.viewCart();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getItems method, of class CartController.
     */
    @Test
    public void testGetItems() {
        System.out.println("getItems");
        CartController instance = new CartController();
        List<ShoppingCartItem> expResult = null;
        List<ShoppingCartItem> result = instance.getItems();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of clear method, of class CartController.
     */
    @Test
    public void testClear() {
        System.out.println("clear");
        CartController instance = new CartController();
        instance.clear();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
