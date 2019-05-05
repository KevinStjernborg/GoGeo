package shared;

/**
 * T�nkt att fungera som den klassen som skickas fram och tillbaka, kan byggas p� med fler booleans beroende p� vad den inneh�ller
 * @author kevin
 *
 */

public class Message {
	private Guess guess;
	private int timerInt;
	private boolean containsGuess;
	private boolean containsTimerInt;
	
	public Message() {
		containsGuess = false;
		containsTimerInt = false;
	}

	public boolean containsGuess() {
		return containsGuess;
	}


	public boolean containsStartTimer() {
		return containsTimerInt;
	}

	public Guess getGuess() {
		return guess;
	}

	public int getStartTimer() {
		return timerInt;
	}

	public void setGuess(Guess guess) {
		containsGuess = true;
		this.guess = guess;
	}

	public void setStartTimer(int startTimer) {
		containsGuess = true;
		this.timerInt = startTimer;
	}
	
	
	
	
	
}
