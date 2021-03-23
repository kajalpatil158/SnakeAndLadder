package game_snakeandladder;

public class SneckAndLadder {
	public static final int NO_PLAY = 0;
	public static final int LADDER = 1;
	public static final int SNAKE = 2;
	public static final int START_POINT = 0;
	public static final int End_POINT = 100;

	public static void main(String[] args) {
		// Computation
		int playerCurrentPosition = START_POINT;
		for (int noOfTimesDiceRolled = 1; playerCurrentPosition >= 0; noOfTimesDiceRolled++) {
			int diceRoll = (int) (Math.floor(Math.random() * 10) % 6) + 1;
			System.out.println("You rolled: " + diceRoll);
			playerCurrentPosition = PlayerMovement(diceRoll, playerCurrentPosition);
			System.out.println("Your position Number is : " + playerCurrentPosition);
			if (playerCurrentPosition >= 100)
				System.out.println("Game Over");
			break;
		}
	}

	// Check condition by switch case
	static int PlayerMovement(int numbRolled, int postionPlayer) {
		int move = (int) Math.floor(Math.random() * 10) % 3;
		switch (move) {
		case NO_PLAY:
			System.out.println("No Play");
			break;
		case SNAKE:
			System.out.println("You Are Bitten by Snake");
			if (postionPlayer - numbRolled >= 0) {
				postionPlayer = postionPlayer - numbRolled;
				break;
			} else {
				postionPlayer = START_POINT;
				break;
			}
		case LADDER:
			System.out.println("You Got Ladder");
			postionPlayer = postionPlayer + numbRolled;
			break;
		}
		return postionPlayer;
	}
}
