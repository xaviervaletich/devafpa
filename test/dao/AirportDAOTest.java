/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import data.Airport;
import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Salim El Moussaoui <salim.elmoussaoui.afpa2017@gmail.com>
 */
public class AirportDAOTest {
    
    public AirportDAOTest() {
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
     * Test of create method, of class AirportDAO.
     */
    @Test
    public void testCreate() {
        System.out.println("create");
        Airport airport = null;
        AirportDAO instance = new AirportDAO();
        Airport expResult = null;
        Airport result = instance.create(airport);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of update method, of class AirportDAO.
     */
    @Test
    public void testUpdate() {
        System.out.println("update");
        Airport airport = null;
        AirportDAO instance = new AirportDAO();
        boolean expResult = false;
        boolean result = instance.update(airport);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of delete method, of class AirportDAO.
     */
    @Test
    public void testDelete() {
        System.out.println("delete");
        Airport airport = null;
        AirportDAO instance = new AirportDAO();
        boolean expResult = false;
        boolean result = instance.delete(airport);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of findAll method, of class AirportDAO.
     */
    @Test
    public void testFindAll() {
        System.out.println("findAll");
        AirportDAO instance = new AirportDAO();
        ArrayList expResult = null;
        ArrayList result = instance.findAll();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of find method, of class AirportDAO.
     */
    @Test
    public void testFind() {
        System.out.println("find");
        String primary_key = "";
        AirportDAO instance = new AirportDAO();
        Airport expResult = null;
        Airport result = instance.find(primary_key);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of witdh method, of class AirportDAO.
     */
    @Test
    public void testWitdh() {
        System.out.println("witdh");
        Object WithTable = null;
        Object forign_key = null;
        AirportDAO instance = new AirportDAO();
        Object expResult = null;
        Object result = instance.witdh(WithTable, forign_key);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
