package game;

public class View {
	
	// Output messages
	public static final String START = "Hi! Try to guess a number that"
			+ " I chose. It is between 0 and 100.";
	public static final String INPUTTED_VALUE_IS_LARGER = "You are closer! "
			+ "My number is lower! Insert value between ";
	public static final String INPUTTED_VALUE_IS_LOWER = "You are closer! "
			+ "My number is larger! Insert value between ";
	public static final String INVALID_INPUT = "Invalid input! Repeat, please!";
	public static final String INPUT_REQUEST = "Input value between ";
	public static final String CONGRATS = "Congratulations! You've guessed my number!";;
	
	public void printMessage(String message) {
		System.out.println(message);
	}
}
