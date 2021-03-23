package game_snakeandladder;

public class SneckAndLadder {

	public static void main(String[] args) {
		final int NO_PLAY = 0;
		final int LADDER = 1;
		final int SNAKE = 2;
		int die = (int) (Math.floor(Math.random() * 10) % 6) + 1;
		System.out.println("Player Get Number = " + die);
		int checkCondition = (int) Math.floor(Math.random() * 10) % 3;
		if (checkCondition == NO_PLAY) {
			System.out.println("Player No Play");
		} else if (checkCondition == LADDER) {
			System.out.println("Its Ladder");
		} else {
			System.out.println("Its Snake");
		}
	}
}
