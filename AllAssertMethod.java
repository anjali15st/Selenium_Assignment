import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotNull;
import static org.testng.Assert.assertNotSame;
import static org.testng.Assert.assertNull;
import static org.testng.Assert.assertSame;
import static org.testng.Assert.assertTrue;


import org.testng.annotations.Test;

public class AllAssertMethod 
{
	@Test		
    public void testAssert(){					
        		
        		
        String string1="Junit";					
        String string2="Junit";					
        String string3="test";					
        String string4="test";					
        String string5=null;					
        int variable1=1;					
        int	variable2=2;					
        int[] airethematicArrary1 = { 1, 2, 3 };					
        int[] airethematicArrary2 = { 1, 2, 3 };					
        		
        //Assert statements		
        assertEquals(string1,string2);					
        assertSame(string3, string4);					
        assertNotSame(string1, string3);					
        assertNotNull(string1);			
        assertNull(string5);			
        assertTrue(variable1<variable2);					
       				
    }		
}		
	
	
	
	


