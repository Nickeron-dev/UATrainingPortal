package testing;

import org.junit.Assert;
import org.junit.Test;

import game.Controller;

public class Tests {
	
	@Test
	public void setRandomNumberTest() {
		Controller controller = new Controller();
		int number = controller.setRandomNumber();
		if ( (number < 0) || (number > 100)) {
			Assert.fail();
		}
	}
}
