package unittesting_573.Junit_573;

import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
	@Test
    public void test(){
    	App a=new App();
    	int actual=a.add(35,35);
    	int expected=70;
    	assertEquals(expected,actual);
    }
}
