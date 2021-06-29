import java.util.Random;

public class Controller {

	public int setRandomNumber() {
		Random rand = new Random();
		
		return rand.nextInt(100);
	}

}
