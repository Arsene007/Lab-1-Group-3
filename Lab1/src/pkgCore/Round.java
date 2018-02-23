package pkgCore;

import java.util.LinkedList;

public class Round {

	private int ComeOutScore;
	private eGameResult eGameResult;
	private LinkedList<Roll> roll = new LinkedList<Roll>();
	int Score = 0;

	public Round() {
		Roll r = new Roll();
		roll.add(r);
		ComeOutScore = r.getScore();

		if (ComeOutScore == 2 || ComeOutScore == 3 || ComeOutScore == 12) {
			eGameResult = eGameResult.CRAPS;
		}

		else if (ComeOutScore == 7 || ComeOutScore == 11) {

			eGameResult = eGameResult.NATURAL;
		}

		else {

			do {
				r = new Roll();
				roll.add(r);

			} while (ComeOutScore != r.getScore() || r.getScore() != 7);

			eGameResult = (r.getScore() == ComeOutScore) ? eGameResult.POINT : eGameResult.SEVEN_OUT;
		}
	}

	public int RollCount() {
		return 0;
	}

	public static boolean isNatural(int iScore) {
		return (iScore == 7 || iScore == 11);
	}

	public static boolean isCraps(int iScore) {
		return (iScore == 2 || iScore == 3 || iScore == 12);
	}


	public eGameResult geteGameResult() {
		return eGameResult;
	}

	public void seteGameResult(eGameResult eGameResult) {
		this.eGameResult = eGameResult;
	}

	public int FirstRoll() {
		return roll.getFirst().getScore();
	}

	public int LastRoll() {
		return roll.getLast().getScore();
	}
}
