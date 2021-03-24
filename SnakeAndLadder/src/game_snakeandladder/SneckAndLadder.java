package game_snakeandladder;

public class SneckAndLadder {
	public static final int NO_PLAY = 0;
	public static final int LADDER = 1;
	public static final int SNAKE = 2;
	public static final int START_POINT = 0;
	public static final int End_POINT = 100;

	public static void main(String[] args) {
		// Computation
		int currentPositionOfPlayer = START_POINT;
		int moves = 0;
		System.out.println("Well Come In Snake And Ladder Game");
		while (currentPositionOfPlayer != End_POINT) {
			int diceRoll = (int) (Math.floor(Math.random() * 10) % 6) + 1;
			System.out.println("You rolled: " + diceRoll);
			int move = (int) Math.floor(Math.random() * 10) % 3;
			if (move == NO_PLAY) {
				System.out.println("No Play");
			} else if (move == LADDER) {
				System.out.println("You Got Ladder");
				currentPositionOfPlayer += diceRoll;
				if (currentPositionOfPlayer > End_POINT) {
					currentPositionOfPlayer -= diceRoll;
				}
			} else {
				currentPositionOfPlayer -= diceRoll;
				if (currentPositionOfPlayer < START_POINT) {
					currentPositionOfPlayer = START_POINT;
				}
			}
			moves++;
			System.out.println("You Are At Position :" + currentPositionOfPlayer);
		}
		System.out.println("You reached exact winning position in : " + moves + " moves");
	}
}
