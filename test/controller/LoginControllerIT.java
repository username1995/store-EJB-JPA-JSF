/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import cart.ShoppingCart;
import entity.Customer;
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
public class LoginControllerIT {
    
    public LoginControllerIT() {
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
     * Test of getCustomer method, of class LoginController.
     */
    @Test
    public void testGetCustomer() {
        System.out.println("getCustomer");
        LoginController instance = new LoginController();
        Customer expResult = null;
        Customer result = instance.getCustomer();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCustomer method, of class LoginController.
     */
    @Test
    public void testSetCustomer() {
        System.out.println("setCustomer");
        Customer customer = null;
        LoginController instance = new LoginController();
        instance.setCustomer(customer);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isAdminLogin method, of class LoginController.
     */
    @Test
    public void testIsAdminLogin() {
        System.out.println("isAdminLogin");
        LoginController instance = new LoginController();
        boolean expResult = false;
        boolean result = instance.isAdminLogin();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setAdminLogin method, of class LoginController.
     */
    @Test
    public void testSetAdminLogin() {
        System.out.println("setAdminLogin");
        boolean adminLogin = false;
        LoginController instance = new LoginController();
        instance.setAdminLogin(adminLogin);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isCustomerLogin method, of class LoginController.
     */
    @Test
    public void testIsCustomerLogin() {
        System.out.println("isCustomerLogin");
        LoginController instance = new LoginController();
        boolean expResult = false;
        boolean result = instance.isCustomerLogin();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCustomerLogin method, of class LoginController.
     */
    @Test
    public void testSetCustomerLogin() {
        System.out.println("setCustomerLogin");
        boolean customerLogin = false;
        LoginController instance = new LoginController();
        instance.setCustomerLogin(customerLogin);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getType method, of class LoginController.
     */
    @Test
    public void testGetType() {
        System.out.println("getType");
        LoginController instance = new LoginController();
        String expResult = "";
        String result = instance.getType();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setType method, of class LoginController.
     */
    @Test
    public void testSetType() {
        System.out.println("setType");
        String type = "";
        LoginController instance = new LoginController();
        instance.setType(type);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSelected method, of class LoginController.
     */
    @Test
    public void testSetSelected() {
        System.out.println("setSelected");
        String selected = "";
        LoginController instance = new LoginController();
        instance.setSelected(selected);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSelected method, of class LoginController.
     */
    @Test
    public void testGetSelected() {
        System.out.println("getSelected");
        LoginController instance = new LoginController();
        String expResult = "";
        String result = instance.getSelected();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getErrorMSG method, of class LoginController.
     */
    @Test
    public void testGetErrorMSG() {
        System.out.println("getErrorMSG");
        LoginController instance = new LoginController();
        String expResult = "";
        String result = instance.getErrorMSG();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setErrorMSG method, of class LoginController.
     */
    @Test
    public void testSetErrorMSG() {
        System.out.println("setErrorMSG");
        String errorMSG = "";
        LoginController instance = new LoginController();
        instance.setErrorMSG(errorMSG);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getEmail method, of class LoginController.
     */
    @Test
    public void testGetEmail() {
        System.out.println("getEmail");
        LoginController instance = new LoginController();
        String expResult = "";
        String result = instance.getEmail();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setEmail method, of class LoginController.
     */
    @Test
    public void testSetEmail() {
        System.out.println("setEmail");
        String email = "";
        LoginController instance = new LoginController();
        instance.setEmail(email);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPassword method, of class LoginController.
     */
    @Test
    public void testGetPassword() {
        System.out.println("getPassword");
        LoginController instance = new LoginController();
        String expResult = "";
        String result = instance.getPassword();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPassword method, of class LoginController.
     */
    @Test
    public void testSetPassword() {
        System.out.println("setPassword");
        String password = "";
        LoginController instance = new LoginController();
        instance.setPassword(password);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of login method, of class LoginController.
     */
    @Test
    public void testLogin() {
        System.out.println("login");
        LoginController instance = new LoginController();
        String expResult = "";
        String result = instance.login();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of isIsLogin method, of class LoginController.
     */
    @Test
    public void testIsIsLogin() {
        System.out.println("isIsLogin");
        LoginController instance = new LoginController();
        boolean expResult = false;
        boolean result = instance.isIsLogin();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setIsLogin method, of class LoginController.
     */
    @Test
    public void testSetIsLogin() {
        System.out.println("setIsLogin");
        boolean isLogin = false;
        LoginController instance = new LoginController();
        instance.setIsLogin(isLogin);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of loginMethod method, of class LoginController.
     */
    @Test
    public void testLoginMethod() {
        System.out.println("loginMethod");
        LoginController instance = new LoginController();
        String expResult = "";
        String result = instance.loginMethod();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of loginAdmin method, of class LoginController.
     */
    @Test
    public void testLoginAdmin() {
        System.out.println("loginAdmin");
        LoginController instance = new LoginController();
        String expResult = "";
        String result = instance.loginAdmin();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of register method, of class LoginController.
     */
    @Test
    public void testRegister() {
        System.out.println("register");
        LoginController instance = new LoginController();
        String expResult = "";
        String result = instance.register();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of logout method, of class LoginController.
     */
    @Test
    public void testLogout() {
        System.out.println("logout");
        ShoppingCart cart = null;
        LoginController instance = new LoginController();
        String expResult = "";
        String result = instance.logout(cart);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of checkout method, of class LoginController.
     */
    @Test
    public void testCheckout() {
        System.out.println("checkout");
        LoginController instance = new LoginController();
        String expResult = "";
        String result = instance.checkout();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
