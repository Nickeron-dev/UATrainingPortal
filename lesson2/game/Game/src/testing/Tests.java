package testing;

import org.junit.Assert;
import org.junit.Test;

import game.Controller;
import game.Model;
import game.View;

public class Tests {
	
	@Test
	public void setRandomNumberTest() {
		
		Model model = new Model();
		View view = new View();
		Controller controller = new Controller(model, view);
		
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
		
		Model model = new Model();
		View view = new View();
		Controller controller = new Controller(model, view);
		
		Assert.assertTrue(controller.isLower(4, 5));
	}

	@Test
	public void isLargerTest() {
		
		Model model = new Model();
		View view = new View();
		Controller controller = new Controller(model, view);
		
		Assert.assertTrue(controller.isLarger(5, 4));
	}
	
}
