package game;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;

public class Controller {
	
	private Model model;
	private View view;
	
	public Controller(Model model, View view) {
		this.model = model;
		this.view = view;
	}
	
	public void run() {
		view.printMessage(View.START);
		model.setRandomNumber(setRandomNumber());
		
		point :
		while ( ! model.isGuessed()) {
			
			view.printMessage(View.INPUT_REQUEST + model.getMinPossibleInput()
				+ " and " + model.getMaxPossibleInput());
			int inputNumber = getInputValue();
			
			if (inputNumber == model.getRandomNumber()) {
				model.setGuessed(true);
				putInAttempts(inputNumber);
				view.printMessage(View.CONGRATS);
				for ( model.setIterator(model.getIterator() - 1); model.getIterator() >= 0; 
						model.setIterator(model.getIterator() - 1)) {
					System.out.println(model.getAttempts()[model.getIterator()]);
				}
			}
			
			if (isValid(inputNumber)) {
				if (inputNumber < model.getRandomNumber()) {
					view.printMessage(View.INPUTTED_VALUE_IS_LOWER);
					model.setMinPossibleInput(inputNumber); // check
					putInAttempts(inputNumber, true);
					continue point;
				}
				
				if (inputNumber > model.getRandomNumber()) {
					view.printMessage(View.INPUTTED_VALUE_IS_LARGER);
					model.setMaxPossibleInput(inputNumber);
					putInAttempts(inputNumber, false);
					continue point;
				}
			}
		}
	}
	
	private boolean isValid(int inputNumber) {
		
		if (inputNumber <= model.getMaxPossibleInput() &&
				inputNumber >= model.getMinPossibleInput()) {
			return true;
		}
		
		return false;
	}

	public int setRandomNumber() {
		Random rand = new Random();
		return rand.nextInt(100);
	}
	
	public boolean isLower(int first, int second) {
		return first < second;
	}

	public boolean isLarger(int first, int second) {
		return first > second;
	}
	
	public int getInputValue() {
		BufferedReader reader =
				new BufferedReader(new InputStreamReader(System.in));
		
		int input = 0;
		try {
			input = Integer.parseInt(reader.readLine());
		} catch (Exception e) {
			view.printMessage(View.INVALID_INPUT);
		}
		return input;
	}
	
	public String putInAttempts(int inputNumber) {
		model.getAttempts()[model.getIterator()] = ("You inserted: " + inputNumber + " which was the answer.");
		model.setIterator(model.getIterator() + 1);
		return model.getAttempts()[model.getIterator()];
	}
	
	public String putInAttempts(int inputNumber, boolean isLower) {
		if (isLower) {
			model.getAttempts()[model.getIterator()] = ("You inserted: " + inputNumber + " which was lower.");
		}
		if ( ! isLower) {
			model.getAttempts()[model.getIterator()] = ("You inserted: " + inputNumber + " which was larger.");
		}
		model.setIterator(model.getIterator() + 1);
		return model.getAttempts()[model.getIterator()];
	}
	
}
