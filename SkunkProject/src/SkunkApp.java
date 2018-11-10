import edu.princeton.cs.introcs.StdIn;
import edu.princeton.cs.introcs.StdOut;

public class SkunkApp implements Broadcast {
	public static void main(String[] args) {
		StdOut.println("Welcom to SEIS 635 SKUNL PROJECT");
		StdOut.println("Play one turn for player 1");
		String player = "player";
		Turn turn = new Turn();

		while (true) {
			StdOut.println("do you want to roll n or y ( enter = y");

			String response = StdIn.readLine();

			if (response.equals('n')) {
				turn.rollAgain();
				turn.scoreTurn();
			}

			else {
				StdOut.println("You turned down your roll");
				break;
			}
			int turnScore = turn.getTurnScore();
			String turnScore1 = null;
			StdOut.println("Your scored" + turnScore1 + "for this turn");
		}
	}

	@Override
	public void showMessage(String msg) {

		StdOut.println(msg);

	}
}
