import java.util.ArrayList;

public class Turn {
	private int turnScore;
	private Roll lastRoll;
	private ArrayList<Roll> rollSequence;
	private Turn turn;
	private String penalty;

	public Turn() {
		this.turnScore = 0;
		this.lastRoll = new Roll();
		this.rollSequence = new ArrayList<>();
		this.penalty = "";
	}

	public int getTurnScore() {
		return this.turnScore;
	}

	public Roll getLastRoll() {
		return this.lastRoll;
	}

	public void rollAgain() {
		this.lastRoll = new Roll();
		rollSequence.add(this.lastRoll);
	}

	public void scoreTurn() {

		if (this.getLastRoll().isDoubleSkunk()) {
			turnScore = 0;
			this.penalty = "double Skunk";
		} else if (this.getLastRoll().isDeuceSkunk()) {
			turnScore = 0;
			this.penalty = "A Skunk and a Deuce";

		} else if (this.getLastRoll().isSingleSkunk()) {
			this.penalty = "one Skunk";
			turnScore = 0;
		} else {
			turnScore += lastRoll.getDice().getLastRoll();
		}

	}
	public int getDie1Value() {
		return this.lastRoll.getDie1Value();
	}
	public int getDie2Value() {
		return this.lastRoll.getDie2Value();
	}
	public String getPenalty() {
		return this.penalty;
	}
}
