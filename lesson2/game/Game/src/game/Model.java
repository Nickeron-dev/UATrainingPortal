package game;

public class Model {
	
	private int randomNumber;
	private boolean isGuessed = false;
	private int minPossibleInput = 0;
	private int maxPossibleInput = 99;
	private String[] attempts = new String[100];
	private int iterator = 0;
	
	public String[] getAttempts() {
		return attempts;
	}

	public void setAttempts(String[] attempts) {
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
