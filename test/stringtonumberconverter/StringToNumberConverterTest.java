/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringtonumberconverter;

import junit.framework.Assert;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author user
 */
public class StringToNumberConverterTest {
    
    public StringToNumberConverterTest() {
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
     * Test of convertNumber method, of class StringToNumberConverter.
     */
    @Test
    public void testConvertNumber() {
        System.out.println("convertNumber");
        String number = "9998";
        StringToNumberConverter StrObj = new StringToNumberConverter();
        String expResult = "9999.00";
      //  if(number.equals(expResult)) fail("Test Failed");
        String result = StrObj.convertNumber(number);
        System.out.println(result);
        Assert.assertEquals(result, expResult);
        
    }
    
}
