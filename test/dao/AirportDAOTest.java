/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import data.Airport;
import java.util.ArrayList;
import java.util.Iterator;
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
        // create object airport
        Airport airport = new Airport("TIT", "ma ville", "mon pays");
        AirportDAO airportDAO = new AirportDAO();
        // find airport  create 
        Airport expResult = airportDAO.find(airport.getAita());
        
        // if find aita is empty
        if (expResult.getAita().isEmpty()) {
            // insert airport in table
            Airport result = airportDAO.create(airport);   
            // find airport
            expResult = airportDAO.find(airport.getAita());
            assertEquals(expResult, result);
        }

    }

    /**
     * Test of update method, of class AirportDAO.
     */
//    @Test
//    public void testUpdate() {
//        System.out.println("update");
//        Airport airport = null;
//        AirportDAO instance = new AirportDAO();
//        boolean expResult = false;
//        boolean result = instance.update(airport);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
    /**
     * Test of delete method, of class AirportDAO.
     */
    @Test
    public void testDelete() {
        System.out.println("delete");
        AirportDAO airportDAO = new AirportDAO();
        
        // create object airport
        Airport airportInsert = new Airport("AGA", "agadir", "Maroc");
        // find airport  create 
        Airport findAirport = airportDAO.find(airportInsert.getAita());
        
        // if find airport is empty
        if (findAirport.getAita().isEmpty()) {
            // Insert airport in table
            Airport resultAirport = airportDAO.create(airportInsert);  
            // find airport
            findAirport = airportDAO.find(resultAirport.getAita()); 
            // delete airport
            boolean result = airportDAO.delete(findAirport);
            boolean expResult = true;
            assertEquals(expResult, result);
        }
    }
    /**
     * Test of findAll method, of class AirportDAO.
     */
    @Test
    public void testGetdAll() {
        System.out.println("findAll");
        AirportDAO airportDAO = new AirportDAO();
        ArrayList<Airport> arrayAirport = airportDAO.getAll();
        String expResult = "";
        String result = "";
        for (int i = 0; i < arrayAirport.size(); i++) {
            expResult += airportDAO.find(arrayAirport.get(i).getAita());
            result += arrayAirport.get(i);
        }
        assertEquals(expResult, result);

    }

    /**
     * Test of find method, of class AirportDAO.
     */
    @Test
    public void testFind() {
        System.out.println("find"); 
        AirportDAO airportDAO = new AirportDAO();
        String primary_key = "DXB";
        String expResult = "Airport{aita=DXB, city=Dubaï, country=Émirats arabes unis}";
        String result = airportDAO.find(primary_key).toString();
        assertEquals(expResult, result);
    }
    /**
     * Test of witdh method, of class AirportDAO.
     */
//    @Test
//    public void testWith() {
//        System.out.println("witdh");
//        Object WithTable = null;
//        Object forign_key = null;
//        AirportDAO instance = new AirportDAO();
//        Object expResult = null;
//        Object result = instance.witdh(WithTable, forign_key);
//        assertEquals(expResult, result);
//        // TODO review the generated test code and remove the default call to fail.
//        fail("The test case is a prototype.");
//    }
}
