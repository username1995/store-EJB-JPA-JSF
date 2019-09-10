/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import entity.Category;
import entity.Product;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import javax.faces.model.SelectItem;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import session.CategoryFacade;
import session.OrderManager;

/**
 *
 * @author Szczominik
 */
public class CategoryControllerTest {
    
    public CategoryControllerTest() {
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
     * Test of getName method, of class CategoryController.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        CategoryController instance = new CategoryController();
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setName method, of class CategoryController.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "";
        CategoryController instance = new CategoryController();
        instance.setName(name);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCategoryName method, of class CategoryController.
     */
    @Test
    public void testGetCategoryName() {
        System.out.println("getCategoryName");
        CategoryController instance = new CategoryController();
        String expResult = "";
        String result = instance.getCategoryName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCategoryName method, of class CategoryController.
     */
    @Test
    public void testSetCategoryName() {
        System.out.println("setCategoryName");
        String CategoryName = "";
        CategoryController instance = new CategoryController();
        instance.setCategoryName(CategoryName);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCategoryChoices method, of class CategoryController.
     */
    @Test
    public void testGetCategoryChoices() {
        System.out.println("getCategoryChoices");
        CategoryController instance = new CategoryController();
        List<SelectItem> expResult = null;
        List<SelectItem> result = instance.getCategoryChoices();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCategoryChoices method, of class CategoryController.
     */
    @Test
    public void testSetCategoryChoices() {
        System.out.println("setCategoryChoices");
        List<SelectItem> categoryChoices = null;
        CategoryController instance = new CategoryController();
        instance.setCategoryChoices(categoryChoices);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getOrderManager method, of class CategoryController.
     */
    @Test
    public void testGetOrderManager() {
        System.out.println("getOrderManager");
        CategoryController instance = new CategoryController();
        OrderManager expResult = null;
        OrderManager result = instance.getOrderManager();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setOrderManager method, of class CategoryController.
     */
    @Test
    public void testSetOrderManager() {
        System.out.println("setOrderManager");
        OrderManager orderManager = null;
        CategoryController instance = new CategoryController();
        instance.setOrderManager(orderManager);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCategoryFacade method, of class CategoryController.
     */
    @Test
    public void testGetCategoryFacade() {
        System.out.println("getCategoryFacade");
        CategoryController instance = new CategoryController();
        CategoryFacade expResult = null;
        CategoryFacade result = instance.getCategoryFacade();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCategoryFacade method, of class CategoryController.
     */
    @Test
    public void testSetCategoryFacade() {
        System.out.println("setCategoryFacade");
        CategoryFacade categoryFacade = null;
        CategoryController instance = new CategoryController();
        instance.setCategoryFacade(categoryFacade);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getNewCat method, of class CategoryController.
     */
    @Test
    public void testGetNewCat() {
        System.out.println("getNewCat");
        CategoryController instance = new CategoryController();
        String expResult = "";
        String result = instance.getNewCat();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNewCat method, of class CategoryController.
     */
    @Test
    public void testSetNewCat() {
        System.out.println("setNewCat");
        String newCat = "";
        CategoryController instance = new CategoryController();
        instance.setNewCat(newCat);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSelected method, of class CategoryController.
     */
    @Test
    public void testGetSelected() {
        System.out.println("getSelected");
        CategoryController instance = new CategoryController();
        String expResult = "";
        String result = instance.getSelected();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSelected method, of class CategoryController.
     */
    @Test
    public void testSetSelected() {
        System.out.println("setSelected");
        String selected = "";
        CategoryController instance = new CategoryController();
        instance.setSelected(selected);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSelectedCategory method, of class CategoryController.
     */
    @Test
    public void testGetSelectedCategory() {
        System.out.println("getSelectedCategory");
        CategoryController instance = new CategoryController();
        Category expResult = null;
        Category result = instance.getSelectedCategory();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSelectedCategoryName method, of class CategoryController.
     */
    @Test
    public void testGetSelectedCategoryName() {
        System.out.println("getSelectedCategoryName");
        CategoryController instance = new CategoryController();
        String expResult = "";
        String result = instance.getSelectedCategoryName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCategories method, of class CategoryController.
     */
    @Test
    public void testGetCategories() {
        System.out.println("getCategories");
        CategoryController instance = new CategoryController();
        List<Category> expResult = null;
        List<Category> result = instance.getCategories();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getcategoryProducts method, of class CategoryController.
     */
    @Test
    public void testGetcategoryProducts() {
        System.out.println("getcategoryProducts");
        CategoryController instance = new CategoryController();
        Collection<Product> expResult = null;
        Collection<Product> result = instance.getcategoryProducts();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSelectedCategory method, of class CategoryController.
     */
    @Test
    public void testSetSelectedCategory() {
        System.out.println("setSelectedCategory");
        Category selectedCategory = null;
        CategoryController instance = new CategoryController();
        instance.setSelectedCategory(selectedCategory);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSelectedCategoryName method, of class CategoryController.
     */
    @Test
    public void testSetSelectedCategoryName() {
        System.out.println("setSelectedCategoryName");
        String selectedCategoryName = "";
        CategoryController instance = new CategoryController();
        instance.setSelectedCategoryName(selectedCategoryName);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addCategory method, of class CategoryController.
     */
    @Test
    public void testAddCategory() {
        System.out.println("addCategory");
        CategoryController instance = new CategoryController();
        boolean expResult = false;
        boolean result = instance.addCategory();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCats method, of class CategoryController.
     */
    @Test
    public void testGetCats() {
        System.out.println("getCats");
        CategoryController instance = new CategoryController();
        List<Category> expResult = null;
        List<Category> result = instance.getCats();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCats method, of class CategoryController.
     */
    @Test
    public void testSetCats() {
        System.out.println("setCats");
        List<Category> cats = null;
        CategoryController instance = new CategoryController();
        instance.setCats(cats);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCategryMap method, of class CategoryController.
     */
    @Test
    public void testGetCategryMap() {
        System.out.println("getCategryMap");
        CategoryController instance = new CategoryController();
        Map<String, Category> expResult = null;
        Map<String, Category> result = instance.getCategryMap();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCategryMap method, of class CategoryController.
     */
    @Test
    public void testSetCategryMap() {
        System.out.println("setCategryMap");
        Map<String, Category> categryMap = null;
        CategoryController instance = new CategoryController();
        instance.setCategryMap(categryMap);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCategory method, of class CategoryController.
     */
    @Test
    public void testGetCategory() {
        System.out.println("getCategory");
        CategoryController instance = new CategoryController();
        Category expResult = null;
        Category result = instance.getCategory();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of updateName method, of class CategoryController.
     */
    @Test
    public void testUpdateName() {
        System.out.println("updateName");
        Category c = null;
        CategoryController instance = new CategoryController();
        String expResult = "";
        String result = instance.updateName(c);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
