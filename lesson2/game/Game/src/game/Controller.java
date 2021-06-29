package game;

import java.io.BufferedReader;
import java.io.IOException;
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
		
		while ( ! model.isGuessed()) {
			
			view.printMessage(View.INPUT_REQUEST + model.getMinPossibleInput()
				+ " and " + model.getMaxPossibleInput());
			int inputNumber = getInputValue();
			
			if (inputNumber == model.getRandomNumber()) {
				model.setGuessed(true);
				view.printMessage(View.CONGRATS);
			}
			
			if (isValid(inputNumber)) {
				if (inputNumber < model.getRandomNumber()) {
					view.printMessage(View.INPUTTED_VALUE_IS_LOWER);
					model.setMinPossibleInput(inputNumber); // check
					continue;
				}
				
				if (inputNumber > model.getRandomNumber()) {
					view.printMessage(View.INPUTTED_VALUE_IS_LARGER);
					model.setMaxPossibleInput(inputNumber);
					continue;
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
		} catch (IOException e) {
			view.printMessage(View.INVALID_INPUT);
		}
		try {
			reader.close();
		} catch (IOException e) {
			
		}
		return input;
	}
	
}
