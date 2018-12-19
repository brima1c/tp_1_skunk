package SkunkAppPackage;

import edu.princeton.cs.introcs.StdIn;
import edu.princeton.cs.introcs.StdOut;

public class SkunkApp implements Broadcast {
	public static void main(String[] args) {
		StdOut.println("Welcom to SEIS 635 2018 FALL SKUNK PROJECT");
		
		String[] array = new String[] {"player 1","player 2","player 3"};
		
		for (int i = 0; i < array.length; i++){
			StdOut.println("Play one turn for player " + (i+1));
			Turn turn = new Turn();		
			playTurn(turn, array[i]);
		}		
	}

	

	private static void playTurn(Turn turn, String player) {
		while (true) {
			StdOut.println(player + ", do you want to roll n or y ( enter = y)");
			String response = StdIn.readLine();

			if (!response.equals("n")) {
				turn.rollAgain();
				turn.scoreTurn();
			}
			else {
				StdOut.println(player + ", You turned down your roll");
				break;
			}
			int turnScore = turn.getTurnScore();
			if(turnScore == 0) { 
				StdOut.println("Penalty:: " + turn.getPenalty());
				StdOut.println(player + ", You lost all turn points");	
				StdOut.println(turn.toString());	
				StdOut.println(player + ", Your accumulated score is now " + turnScore + " for this turn");	
				StdOut.println(player + " You loose a turn !");
				StdOut.println(player + " Die 1 was : " + turn.getDie1Value());
				StdOut.println(player + " Die 2 was : " + turn.getDie2Value());
				break;
			}
			else {
				StdOut.println(turn.toString());	
				StdOut.println(player + ", Your accumulated score is " + turnScore + " for this turn");	
			}
		}
	}

	@Override
	public void showMessage(String msg) {
		StdOut.println(msg);
	}
}
