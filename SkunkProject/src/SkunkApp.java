import edu.princeton.cs.introcs.StdOut;

public class SkunkApp {
	public static void main(String[] args)
	{
		StdOut.println("Welcom to SEIS 635 SKUNL PROJECT");
		StdOut.println("Play one turn for player 1");
		String player = 'player1;
		Turn turn = new Turn();
		
		StdOut.println("do you want to roll n or y ( enter = y");
		String response = StdOut.readLine();
		if (response equals ('n'))
		{turn rollAgain();
		turn scoreAgain();
		StdOut.println("You rolled a" + turn.getLastRoll());
		
		
		int turn score = turn.getTurnScore();
		StdOut.println("Your scored" + turnScore + 'for this turn');
		}
		
	}

}
