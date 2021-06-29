package testing;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import game.Controller;
import game.Model;
import game.View;

public class Tests {
	
	Model model = new Model();
	View view = new View();
	Controller controller;
	
	@Before
	public void RunTest() {
		controller = new Controller(model, view);
	}
	
	@Test
	public void setRandomNumberTest() {
		
		// random tests
		for (int i = 100; i >= 0; i--) {
			int number = controller.setRandomNumber();
			if ( (number < 0) || (number >= 100)) {
				Assert.fail();
			}
		}
		
	}
	
	@Test
	public void isLowerTest() {
		Assert.assertTrue(controller.isLower(4, 5));
	}

	@Test
	public void isLargerTest() {
		
		Model model = new Model();
		View view = new View();
		Controller controller = new Controller(model, view);
		
		Assert.assertTrue(controller.isLarger(5, 4));
	}
	
	@Test
	public void putInAttemptsTest() {
		
		controller.putInAttempts(5);
		Assert.assertEquals("Error in method without boolean", "You inserted: 5 which was the answer.", model.getAttempts()[model.getIterator() - 1]);
		
		controller.putInAttempts(5, true);
		Assert.assertEquals("Error in method with boolean", "You inserted: 5 which was lower.", model.getAttempts()[model.getIterator() - 1]);
	}
	
	@Test
	public void getInputValueTest() {
		
		InputStream stream = System.in; // backup to restore later
		ByteArrayInputStream byteStream = new ByteArrayInputStream("50".getBytes());
		System.setIn(byteStream);
		
		Assert.assertEquals(50, controller.getInputValue());
		
		System.setIn(stream);
		
	}
	
}
