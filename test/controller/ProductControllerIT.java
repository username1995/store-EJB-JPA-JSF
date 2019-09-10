/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import entity.Product;
import java.math.BigDecimal;
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
public class ProductControllerIT {
    
    public ProductControllerIT() {
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
     * Test of getName method, of class ProductController.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        ProductController instance = new ProductController();
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setName method, of class ProductController.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "";
        ProductController instance = new ProductController();
        instance.setName(name);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPrice method, of class ProductController.
     */
    @Test
    public void testGetPrice() {
        System.out.println("getPrice");
        ProductController instance = new ProductController();
        BigDecimal expResult = null;
        BigDecimal result = instance.getPrice();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPrice method, of class ProductController.
     */
    @Test
    public void testSetPrice() {
        System.out.println("setPrice");
        BigDecimal price = null;
        ProductController instance = new ProductController();
        instance.setPrice(price);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getDesc method, of class ProductController.
     */
    @Test
    public void testGetDesc() {
        System.out.println("getDesc");
        ProductController instance = new ProductController();
        String expResult = "";
        String result = instance.getDesc();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setDesc method, of class ProductController.
     */
    @Test
    public void testSetDesc() {
        System.out.println("setDesc");
        String desc = "";
        ProductController instance = new ProductController();
        instance.setDesc(desc);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCategoryName method, of class ProductController.
     */
    @Test
    public void testGetCategoryName() {
        System.out.println("getCategoryName");
        ProductController instance = new ProductController();
        String expResult = "";
        String result = instance.getCategoryName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCategoryName method, of class ProductController.
     */
    @Test
    public void testSetCategoryName() {
        System.out.println("setCategoryName");
        String categoryName = "";
        ProductController instance = new ProductController();
        instance.setCategoryName(categoryName);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getProduct method, of class ProductController.
     */
    @Test
    public void testGetProduct() {
        System.out.println("getProduct");
        ProductController instance = new ProductController();
        Product expResult = null;
        Product result = instance.getProduct();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setProduct method, of class ProductController.
     */
    @Test
    public void testSetProduct() {
        System.out.println("setProduct");
        Product product = null;
        ProductController instance = new ProductController();
        instance.setProduct(product);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addProduct method, of class ProductController.
     */
    @Test
    public void testAddProduct() {
        System.out.println("addProduct");
        ProductController instance = new ProductController();
        instance.addProduct();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateName method, of class ProductController.
     */
    @Test
    public void testUpdateName() {
        System.out.println("updateName");
        Product pr = null;
        ProductController instance = new ProductController();
        String expResult = "";
        String result = instance.updateName(pr);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateDesc method, of class ProductController.
     */
    @Test
    public void testUpdateDesc() {
        System.out.println("updateDesc");
        Product pr = null;
        ProductController instance = new ProductController();
        String expResult = "";
        String result = instance.updateDesc(pr);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updatePrice method, of class ProductController.
     */
    @Test
    public void testUpdatePrice() {
        System.out.println("updatePrice");
        Product pr = null;
        ProductController instance = new ProductController();
        String expResult = "";
        String result = instance.updatePrice(pr);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of DeleteProduct method, of class ProductController.
     */
    @Test
    public void testDeleteProduct() {
        System.out.println("DeleteProduct");
        Product p = null;
        ProductController instance = new ProductController();
        String expResult = "";
        String result = instance.DeleteProduct(p);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
