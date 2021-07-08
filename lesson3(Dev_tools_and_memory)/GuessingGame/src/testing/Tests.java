package testing;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import game.Controller;
import game.Model;
import game.View;

/*
 * Created by Koshkin Illia on 29.06.2021.
 */
public class Tests {
	
	Model model = new Model();
	View view = new View();
	Controller controller;
	
	@Before
	public void RunTest() {
		controller = new Controller(model, view);
	}
	
	// This test was successful
	@Ignore
	@Test
	public void setRandomNumberTest() {
		
		// random tests
		for (int i = 1000000; i >= 0; i--) {
			int number = controller.setRandomNumber();
			if ( (number >= 1) && (number <= 99)) {
				Assert.assertTrue(true);
			}
			else {
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
		Assert.assertEquals("Error in method without boolean", "You inserted: 5 which was the answer.", model.getAttempts().get(model.getAttempts().size() - 1));
		
		controller.putInAttempts(5, true);
		Assert.assertEquals("Error in method with boolean", "You inserted: 5 which was lower.", model.getAttempts().get(model.getAttempts().size() - 1));
	}
	
	@Test
	public void getInputValueTest() {
		
		InputStream stream = System.in; // backup to restore later
		ByteArrayInputStream byteStream = new ByteArrayInputStream("50".getBytes());
		System.setIn(byteStream);
		
		Assert.assertEquals(50, controller.getInputValue());
		
		System.setIn(stream);
		
	}
	
	@Test
	public void isValidTest() {
		Assert.assertEquals(false, controller.isValid(100));
		Assert.assertEquals(false, controller.isValid(0));
		Assert.assertEquals(true, controller.isValid(50));
	}
	
}
