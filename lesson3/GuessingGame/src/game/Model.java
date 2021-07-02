package game;

import java.util.ArrayList;
import java.util.List;

/*
 * Created by Koshkin Illia on 29.06.2021.
 */
public class Model {
	
	// Data
	private int randomNumber;
	private boolean isGuessed = false;
	
	private int minPossibleInput = GlobalConstants.PRIMARY_MIN_BARRIER;
	private int maxPossibleInput = GlobalConstants.PRIMARY_MAX_BARRIER;
	
	private List<String> attempts = new ArrayList<String>(15);
	private int iterator = 0;
	
	public List<String> getAttempts() {
		return attempts;
	}

	public void setAttempts(List<String> attempts) {
		this.attempts = attempts;
	}

	public int getIterator() {
		return iterator;
	}

	public void setIterator(int iterator) {
		this.iterator = iterator;
	}

	public int getRandomNumber() {
		return randomNumber;
	}

	public void setRandomNumber(int randomNumber) {
		this.randomNumber = randomNumber;
	}

	public boolean isGuessed() {
		return isGuessed;
	}

	public void setGuessed(boolean isGuessed) {
		this.isGuessed = isGuessed;
	}

	public int getMinPossibleInput() {
		return minPossibleInput;
	}

	public void setMinPossibleInput(int minPossibleInput) {
		this.minPossibleInput = minPossibleInput;
	}

	public int getMaxPossibleInput() {
		return maxPossibleInput;
	}

	public void setMaxPossibleInput(int maxPossibleInput) {
		this.maxPossibleInput = maxPossibleInput;
	}
	
}
