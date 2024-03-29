package Amit_Paz_exercise_2.calculator_execise_2;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 * 
 * Israel Amit Uliel 319050423
 * Paz Abitbul 315663963
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
	
	// Start F check
	// F min
    @Test
    public void ex2_partition_F_min()
    {
    	int number = 1;
        String expectedResult = "F";
        assertEquals(expectedResult, App.numberToChar(number));       
    }
    
 // F min + 1
    @Test
    public void ex2_partition_F_minPlus1()
    {
    	int number = 2;
        String expectedResult = "F";
        assertEquals(expectedResult, App.numberToChar(number)); 
    }
    
    // F nominal
    @Test
    public void ex2_partition_F_nominal()
    {
    	int number = 25;
        String expectedResult = "F";
        assertEquals(expectedResult, App.numberToChar(number)); 
    }
    
    // F max - 1
    @Test
    public void ex2_partition_F_maxMinus1()
    {
    	int number = 48;
        String expectedResult = "F";
        assertEquals(expectedResult, App.numberToChar(number)); 
    }
    
 // F max
    @Test
    public void ex2_partition_F_max()
    {
    	int number = 49;
        String expectedResult = "F";
        assertEquals(expectedResult, App.numberToChar(number)); 
    }
    // End F check
      
    
}
