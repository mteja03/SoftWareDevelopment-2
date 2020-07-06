package Lab2;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * @author vrieser
 *
 */
public class BackTest
{

	/**
     * Default constructor for test class 
     */
    public BackTest()
    {
    }

	@Test
	public void testBack()
	{
		Game game = new Game();

		
		Room start= game.getCurrentRoom();
		
		Command command = new Command("go", "east");
		game.goRoom( command );
		
		assertTrue(!start.equals( game.getCurrentRoom()));
		
		Command back = new Command("back", null);
		
		// You will need to uncomment the following two lines to test your goBack() method!
		//this method is working because, Test class and Game class are in same package...
		game.goBack(back );
		assertTrue(start.equals( game.getCurrentRoom()));
		
	}
	
	
	
	
}