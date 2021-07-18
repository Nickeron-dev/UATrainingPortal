import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

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
	public void launch() throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		
		model.setHelloMessage(getHelloMessageWithScanner(reader));
		model.setWorldMessage(getWorldMessageWithScanner(reader));
		
		view.combineOutputs(model.getHelloMessage(), model.getWorldMessage());
		
	}
	
	// Returns message if it is valid
	private String getHelloMessageWithScanner(BufferedReader reader) throws IOException {
		view.printMessage(View.ASK_FOR_INPUT_HELLO);
		
		String readString = reader.readLine();
		while ( ! readString.equals(CORRECT_HELLO_MESSAGE)) {
			view.printMessage(View.INVALID_INPUT + "\n" + View.ASK_FOR_INPUT_HELLO);
			readString = reader.readLine();
		}
		
		return readString;
	}
	
	// Returns message if it is valid
	private String getWorldMessageWithScanner(BufferedReader reader) throws IOException {
		view.printMessage(View.VALID_INPUT_HELLO_ASK_WORLD);
		
		String readString = reader.readLine();
		while ( ! readString.equals(CORRECT_WORLD_MESSAGE)) {
			view.printMessage(View.INVALID_INPUT + "\n" + View.ASK_FOR_INPUT_WORLD);
			readString = reader.readLine();
		}
		
		return readString;
	}
	
}
