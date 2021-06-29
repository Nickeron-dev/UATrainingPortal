package testing;

import org.junit.Assert;
import org.junit.Test;

import game.Controller;

public class Testing {

	@Test
	public void randomTest() {
		Controller controller = new Controller();
		int number = controller.setRandomNumber();
		if ( (number < 0) && (number > 100) ) {
			Assert.fail();
		}
	}
}
