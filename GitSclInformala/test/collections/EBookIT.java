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
public class EBookIT {
    
    public EBookIT() {
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
     * Test of getRecommendedReader method, of class EBook.
     */
    @Test
    public void testGetRecommendedReader() {
        
        EBook instance = new EBook("ISBN", new String[] {"Authors"});
        EBook.eBooksReaders expResult = EBook.eBooksReaders.AMAZON;
        instance.setRecommendedReader(expResult);
        EBook.eBooksReaders result = instance.getRecommendedReader();
        assertEquals(expResult, result);
        
    }

    /**
     * Test of setRecommendedReader method, of class EBook.
     */
    @Test
    public void testSetRecommendedReader() {
        
        EBook.eBooksReaders expResult = EBook.eBooksReaders.AMAZON;
        EBook instance = new EBook("ISBN", new String[] {"Authors"});
        instance.setRecommendedReader(expResult);
        EBook.eBooksReaders result = instance.getRecommendedReader();
        assertEquals(expResult, result);
        
    }
    
}
