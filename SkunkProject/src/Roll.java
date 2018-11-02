import java.util.Random;

public class Roll {
private Dice dice;

public Roll()
{
	this.dice = new Dice();
	this.dice.roll();
	
}
public Dice getDice()
{
	return this.dice;
}
public void setDice(Die die1, Die die2)
{
this.dice.setDie1(die1);
this.dice.setDie2(die2);
this.dice.roll();

}

public boolean isSingleSkunk()
{
	if (isDoubleSkunk()|| isSingleSkunk())
		return false;
	else
		return ((Dice) this.dice.getDie1).getLastRoll() == 1 || ((Dice) this.dice.getDie2).getLastRoll() == 1;
}
public boolean isDeuceSkunk()
{
	return this.dice.getDie1().getLastRoll() == 1 && this.dice.getDie2().getLastRoll()==2
			|| this .dice.getDie2().getLastRoll() == 1 && this.dice.getDie1().getLastRoll() == 2;
}

public boolean isDoubleSkunk()
{
	return (this.dice.getDie1().getLastRoll() == 1 && dice.getDie2().getLastRoll() == 1);
	
}
}
