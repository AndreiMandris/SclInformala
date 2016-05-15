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
public class ElectronicBookIT {

    public ElectronicBookIT() {
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
     * Test of getISBN method, of class ElectronicBook.
     */
    @Test
    public void testGetISBN() {
        ElectronicBook instance = new ElectronicBook("ISBN Test: ", new String[]{"John Doe", "Jane Doe"});
        String expectedResult = "ISBN Test: ";
        String result = instance.getISBN();
        assertEquals(expectedResult, result);

    }

    /**
     * Test of setISBN method, of class ElectronicBook.
     */
    @Test
    public void testSetISBN() {
        ElectronicBook instance = new ElectronicBook("ISBN", new String[]{"Ioana", "Elena"});
        String expectedISBN = "new ISBN";
        instance.setISBN(expectedISBN);
        String result = instance.getISBN();
        assertEquals(expectedISBN, result);

    }

    /**
     * Test of getAuthors method, of class ElectronicBook.
     */
    @Test
    public void testGetAuthors() {
        ElectronicBook instance = new ElectronicBook("ISBN", new String[]{"Ioana", "Elena"});
        String[] expectedResult = new String[]{"Ioana", "Elena"};
        String[] result = instance.getAuthors();
        assertArrayEquals(expectedResult, result);

    }

    /**
     * Test of setAuthors method, of class ElectronicBook.
     */
    @Test
    public void testSetAuthors() {
        String[] expResult = {"Jane Doe", "Joey Doe"};
        ElectronicBook instance = new ElectronicBook("ISBN: ", new String[]{"A", "B"});
        instance.setAuthors(expResult);
        String[] result = instance.getAuthors();
        assertArrayEquals(expResult, result);

    }

    /**
     * Test of getDownloadLinks method, of class ElectronicBook.
     */
    @Test
    public void testGetDownloadLinks() {
        ElectronicBook instance = new ElectronicBook("ISBN: ", new String[]{"Authors"}, new String[]{"downloadLinks"});
        String[] expResult = new String[]{"downloadLinks"};

        String[] result = instance.getDownloadLinks();
        assertArrayEquals(expResult, result);

    }

    /**
     * Test of setDownloadLinks method, of class ElectronicBook.
     */
    @Test
    public void testSetDownloadLinks() {
        ElectronicBook instance = new ElectronicBook("ISBN: ", new String[]{"Authors"});
        String[] expResult = new String[]{"downloadLinks"};
        instance.setDownloadLinks(expResult);
        String[] result = instance.getDownloadLinks();
        assertArrayEquals(expResult, result);

    }

    /**
     * Test of getRemarksAndNotes method, of class ElectronicBook.
     */
    @Test
    public void testGetRemarksAndNotes() {
        ElectronicBook instance = new ElectronicBook("ISBN: ", new String[]{"Authors"});
        String[] expectedResult = new String[]{"remarksAndNotes"};
        instance.setRemarksAndNotes(expectedResult);
        String[] result = instance.getRemarksAndNotes();
        assertArrayEquals(expectedResult, result);

    }

    /**
     * Test of setRemarksAndNotes method, of class ElectronicBook.
     */
    @Test
    public void testSetRemarksAndNotes() {
        String[] expectedResult = new String[]{"remarksAndNotes"};
        ElectronicBook instance = new ElectronicBook("ISBN: ", new String[]{"Authors"});
        instance.setRemarksAndNotes(expectedResult);
        String[] result = instance.getRemarksAndNotes();
        assertArrayEquals(expectedResult, result);

    }

    /**
     * Test of getPublisher method, of class ElectronicBook.
     */
    @Test
    public void testGetPublisher() {
        ElectronicBook instance = new ElectronicBook("ISBN: ", new String[]{"Authors"});
        String expectedResult = "publisher";
        instance.setPublisher("publisher");
        String result = instance.getPublisher();
        assertEquals(expectedResult, result);

    }

    /**
     * Test of setPublisher method, of class ElectronicBook.
     */
    @Test
    public void testSetPublisher() {
                
        ElectronicBook instance = new ElectronicBook("ISBN: ", new String[]{"Authors"});
        String expectedResult = "publisher";
        instance.setPublisher(expectedResult);
        
        String result = instance.getPublisher();
        assertEquals(expectedResult, result);
    }

    /**
     * Test of getPrice method, of class ElectronicBook.
     */
    @Test
    public void testGetPrice() {
        ElectronicBook instance = new ElectronicBook("ISBN: ", new String[]{"Authors"});
        float expectedResult = 2.2F;
        instance.setPrice(expectedResult);
        float result = instance.getPrice();
        assertEquals(expectedResult, result, 0);
    }

    /**
     * Test of setPrice method, of class ElectronicBook.
     */
    @Test
    public void testSetPrice() {
        ElectronicBook instance = new ElectronicBook("ISBN: ", new String[] {"Authors"});
        
        float expectedResult = 2.2F;
        instance.setPrice(expectedResult);
        float result = instance.getPrice();
        assertEquals(expectedResult, result, 0);
    }

    /**
     * Test of getElectronicFormat method, of class ElectronicBook.
     */
    @Test
    public void testGetElectronicFormat() {
        ElectronicBook instance = new ElectronicBook("ISBN: ", new String[] {"Authors"});
        ElectronicBook.FormatOfElectronicBook expectedResult = ElectronicBook.FormatOfElectronicBook.AZW;
        instance.setElectronicFormat(expectedResult);
        ElectronicBook.FormatOfElectronicBook result = instance.getElectronicFormat();
        assertEquals(expectedResult, result);
        
    }

    /**
     * Test of setElectronicFormat method, of class ElectronicBook.
     */
    @Test
    public void testSetElectronicFormat() {
        
        ElectronicBook instance = new ElectronicBook("ISBN: ", new String[] {"Authors"});
        ElectronicBook.FormatOfElectronicBook expectedResult = ElectronicBook.FormatOfElectronicBook.AZW;
        instance.setElectronicFormat(expectedResult);
        ElectronicBook.FormatOfElectronicBook result = instance.getElectronicFormat();
        assertEquals(expectedResult, result);
    }

    /**
     * Test of getYearOfPublication method, of class ElectronicBook.
     */
    @Test
    public void testGetYearOfPublication() {
        ElectronicBook instance = new ElectronicBook("ISBN: ", new String[] {"Authors"});
        ElectronicBook.YearOfPublication expectedResult = ElectronicBook.YearOfPublication.Y2005;
        instance.setYearOfPublication(expectedResult);
        ElectronicBook.YearOfPublication result = instance.getYearOfPublication();
        assertEquals(expectedResult, result);
       
    }

    /**
     * Test of setYearOfPublication method, of class ElectronicBook.
     */
    @Test
    public void testSetYearOfPublication() {
        ElectronicBook instance = new ElectronicBook("ISBN: ", new String[] {"Authors"});
        ElectronicBook.YearOfPublication expectedResult = ElectronicBook.YearOfPublication.Y2006;
        instance.setYearOfPublication(expectedResult);
        ElectronicBook.YearOfPublication result = instance.getYearOfPublication();
        assertEquals(expectedResult, result);
    }

    /**
     * Test of getTitle method, of class ElectronicBook.
     */
    @Test
    public void testGetTitle() {
        
        ElectronicBook instance = new ElectronicBook("ISBN: ", new String[] {"Authors"});
        String expectedResult = "test";
        instance.setTitle(expectedResult);
        String result = instance.getTitle();
        assertEquals(expectedResult, result);
        
    }

    /**
     * Test of setTitle method, of class ElectronicBook.
     */
    @Test
    public void testSetTitle() {
        
        ElectronicBook instance = new ElectronicBook("ISBN: ", new String[] {"Authors"});
        String expectedResult = "test";
        instance.setTitle(expectedResult);
        String result = instance.getTitle();
        assertEquals(expectedResult, result);
    }

}
