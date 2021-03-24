package game_snakeandladder;

public class SneckAndLadder {
	// Initialization Of Constants
	public static final int NO_OF_PLAYERS = 1;
	public static final int NO_PLAY = 0;
	public static final int LADDER = 1;
	public static final int SNAKE = 2;
	public static final int START_POINT = 0;
	public static final int End_POINT = 100;

	public static void main(String[] args) {
		// Initialization Of Veribles
		int playerOnePosition = START_POINT;
		int playerTwoPosition = START_POINT;
		boolean firstPlayer = true;
		// Message
		System.out.println("Well Come In Snake And Ladder Game");
		System.out.println("Both players are at the starting position...");
		// Computation
		while (playerOnePosition != End_POINT && playerTwoPosition != End_POINT) {
			// Check For Player One
			if (firstPlayer) {
				int diceRoll = (int) (Math.floor(Math.random() * 10) % 6) + 1;
				int move = (int) Math.floor(Math.random() * 10) % 3;
				if (move == NO_PLAY) {
					firstPlayer = false;
				} else if (move == LADDER) {
					playerOnePosition += diceRoll;
					if (playerOnePosition > End_POINT) {
						playerOnePosition -= diceRoll;
					}
				} else {
					firstPlayer = false;
					playerOnePosition -= diceRoll;
					if (playerOnePosition < START_POINT) {
						playerOnePosition = START_POINT;
					}
				}
			}
			// Check For Player Two
			else {
				int diceRoll = (int) (Math.floor(Math.random() * 10) % 6) + 1;
				int move = (int) Math.floor(Math.random() * 10) % 3;
				if (move == NO_PLAY) {
					firstPlayer = true;
				} else if (move == LADDER) {
					playerTwoPosition += diceRoll;
					if (playerTwoPosition > End_POINT) {
						playerTwoPosition -= diceRoll;
					}
				} else {
					firstPlayer = true;
					playerTwoPosition -= diceRoll;
					if (playerTwoPosition < START_POINT) {
						playerTwoPosition = START_POINT;
					}
				}
			}
		}
		// Check Condition For Who Will Win
		if (playerOnePosition == End_POINT) {
			System.out.println("Player 1 won the game");
		} else {
			System.out.println("Player 2 won the game");
		}

	}
}
