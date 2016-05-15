/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collections;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Andrei
 */
public class IBookIT {
    
    public IBookIT() {
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
     * Test of setRecommendedReader method, of class IBook.
     */
    @Test
    public void testSetRecommendedReader() {
         IBook instance = new IBook("ISBN", new String[] {"Authors"});
        IBook.iBooksReaders expResult = IBook.iBooksReaders.APPIPHONE;
        instance.setRecommendedReader(expResult);
        IBook.iBooksReaders result = instance.getRecommendedReader();
        assertEquals(expResult, result);
    }

    /**
     * Test of getRecommendedReader method, of class IBook.
     */
    @Test
    public void testGetRecommendedReader() {
        IBook instance = new IBook("ISBN", new String[] {"Authors"});
        IBook.iBooksReaders expResult = IBook.iBooksReaders.APPIPAD;
        instance.setRecommendedReader(expResult);
        IBook.iBooksReaders result = instance.getRecommendedReader();
        assertEquals(expResult, result);
        
    }
    
}
