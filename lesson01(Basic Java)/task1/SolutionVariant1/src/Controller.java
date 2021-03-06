import java.util.Scanner;

/**
 * Created by Illia Koshkin on 24.06.2021.
 */
public class Controller {
	
	// The Constants
	public static final String CORRECT_HELLO_MESSAGE = "Hello";
	public static final String CORRECT_WORLD_MESSAGE = "world!";
	
	// Constructor
	private Model model;
	private View view;
	
	public Controller(Model model, View view) {
		this.model = model;
		this.view = view;
	}
	
	// The Work method
	public void launch() {
		Scanner scan = new Scanner(System.in);
		
		model.setHelloMessage(getHelloMessageWithScanner(scan));
		model.setWorldMessage(getWorldMessageWithScanner(scan));
		
		view.combineOutputs(model.getHelloMessage(), model.getWorldMessage());
		
	}
	
	// Returns message if it is valid
	private String getHelloMessageWithScanner(Scanner scan) {
		view.printMessage(View.ASK_FOR_INPUT_HELLO);
		
		String scannedString = scan.next();
		while ( ! scannedString.equals(CORRECT_HELLO_MESSAGE)) {
			view.printMessage(View.INVALID_INPUT + "\n" + View.ASK_FOR_INPUT_HELLO);
			scannedString = scan.next();
		}
		
		return scannedString;
	}
	
	// Returns message if it is valid
	private String getWorldMessageWithScanner(Scanner scan) {
		view.printMessage(View.VALID_INPUT_HELLO_ASK_WORLD);
		
		String scannedString = scan.next();
		while ( ! scannedString.equals(CORRECT_WORLD_MESSAGE)) {
			view.printMessage(View.INVALID_INPUT + "\n" + View.ASK_FOR_INPUT_WORLD);
			scannedString = scan.next();
		}
		
		return scannedString;
	}
	
}
