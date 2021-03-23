package game_snakeandladder;

public class SneckAndLadder {

	public static void main(String[] args) {
		final int Play = 1;
		int die = (int) (Math.floor(Math.random() * 10) % 6) + 1;
		System.out.println("Player Get Number = " + die);
	}
}
