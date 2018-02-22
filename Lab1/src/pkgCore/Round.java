package pkgCore;

import java.util.LinkedList;

public class Round {

	private int ComeOutScore;
	private eGameResult eGameResult;
	private LinkedList<Roll> rolls = new LinkedList<Roll>();
	
	public static void main(String[] args) {
		
	}
	
	public void rollDice()
	{
		roll r = new roll();
		rolls.add(r);
	}
	
	public boolean isComeOut()
	{
		return (rolls.size()==1 ? true:false);
	}
	
	public byte ComeOutRoll()
	{
		return rolls.getFirst().ScoreRoll();
		
	}
	
	public boolean isNatural()
	{
		return ComeOutRoll().isNatural();
	}
	
	public for RollLoop();
			{
	
			}
	
	public Round() {
		// TODO: Execute Come Out roll, value ComeOutScore

		// TODO: Create a loop that will execute a roll until point is made, or
		// seven-out

		// TODO: value the eGameResult after the round is complete
	}

	public int RollCount() {
		// Return the roll count
		return 0;
	}

}
