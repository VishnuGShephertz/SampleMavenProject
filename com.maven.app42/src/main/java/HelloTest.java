import net.viralpatel.maven.AppTest;
import junit.framework.TestCase;

/**
 * 
 */

/**
 * @author Vishnu
 *
 */
public class HelloTest extends TestCase {
	 public void testApp()  
     {
         assertTrue( AppTest.now().length() > 0 );
     }
}
