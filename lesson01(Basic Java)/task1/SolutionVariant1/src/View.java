
/**
 * Created by Illia Koshkin on 24.06.2021.
 */
public class View {
	
	// Output's constants
	public static final String ASK_FOR_INPUT_HELLO = "Input 'Hello' message:";
	public static final String ASK_FOR_INPUT_WORLD = "Input 'world!' message:";
	public static final String INVALID_INPUT = "Invalid input! Please, try again!";
	public static final String VALID_INPUT_HELLO_ASK_WORLD = "Great! And now, input 'world!' message:";

	public void printMessage(String message) {
		System.out.println(message);
	}
	
	public void combineOutputs(String helloMessage, String worldMessage) {
		System.out.println(helloMessage + ", " + worldMessage);
	}
	
}
