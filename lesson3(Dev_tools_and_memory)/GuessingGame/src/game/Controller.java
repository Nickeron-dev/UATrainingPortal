package game;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;

/*
 * Created by Koshkin Illia on 29.06.2021.
 */
public class Controller {
	
	private Model model;
	private View view;
	
	public Controller(Model model, View view) {
		this.model = model;
		this.view = view;
	}
	
	// The Work method
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
				for (int i = model.getAttempts().size() - 1; i >= 0; i--) {
					System.out.println(model.getAttempts().get(i));
				}
			}
			
			if (isValid(inputNumber)) {
				boolean isLower = inputNumber < model.getRandomNumber();
				putInAttempts(inputNumber, isLower);
				view.printMessage(isLower 
						? View.INPUTTED_VALUE_IS_LOWER : View.INPUTTED_VALUE_IS_LARGER);
				
				if (inputNumber < model.getRandomNumber()) {
					model.setMinPossibleInput(inputNumber);
					continue point;
				}
				
				if (inputNumber > model.getRandomNumber()) {
					model.setMaxPossibleInput(inputNumber);
					continue point;
				}
			}
		}
	}
	
	public boolean isValid(int inputNumber) {
		
		if (inputNumber <= model.getMaxPossibleInput() &&
				inputNumber >= model.getMinPossibleInput()) {
			return true;
		}
		
		return false;
	}
	
	// [1 - 99]
	public int setRandomNumber() {
		Random rand = new Random();
		return rand.nextInt(model.getMaxPossibleInput() - model.getMinPossibleInput()) + model.getMinPossibleInput();
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
			if (! isValid(input)) {
				throw new Exception();
			}
		} catch (Exception e) {
			view.printMessage(View.INVALID_INPUT);
		}
		return input;
	}
	
	public String putInAttempts(int inputNumber) {
		model.getAttempts().add("You inserted: " + inputNumber + " which was the answer.");
		model.setIterator(model.getIterator() + 1);
		return model.getAttempts().get(model.getAttempts().size() - 1);
	}
	
	public String putInAttempts(int inputNumber, boolean isLower) {
		if (isLower) {
			model.getAttempts().add("You inserted: " + inputNumber + " which was lower.");
		}
		if ( ! isLower) {
			model.getAttempts().add("You inserted: " + inputNumber + " which was larger.");
		}
		model.setIterator(model.getIterator() + 1);
		return model.getAttempts().get(model.getAttempts().size() - 1);
	}
	
}
