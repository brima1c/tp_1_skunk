import java.util.ArrayList;

public class Turn 
{
private int turnScore;
private Roll lastRoll;
private ArrayList<Roll> rollSequence;

public Turn()
{
	this.turnScore = 0;
    this.lastRoll = null;
    this.rollSequence = new ArrayList<>();
    

}
public int getTurnScore() {
	
return this.turnScore;
}
public Roll getLastRoll() {
	
	return this.getLastRoll();
	
}
public void rollAgain() {
	this.lastRoll = new Roll();
	rollSequence.add(this.lastRoll);
	
}

public void scoreTurn() {
	
	if (this.getLastRoll().isDoubleSkunk())
	{
		turnScore = 0;	
	}
	else if (this.getLastRoll().isDeuceSkunk())
	{
		turnScore = 0;	
	}
	else if (this.getLastRoll().isDoubleSkunk())
	{
		turnScore = 0;	
	}
	else
	{
		turnScore += lastRoll.getDice().getLastRoll();
	}

	
}
}

	

