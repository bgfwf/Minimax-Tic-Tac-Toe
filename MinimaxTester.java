import java.util.*;

public class MinimaxTester {
	
	public static void main(String[] args) {
		ArrayList<String> start = new ArrayList<String>();
		start.add("A");
		start.add("X");
		start.add("C");
		start.add("D");
		start.add("E");
		start.add("F");
		start.add("G");
		start.add("O");
		start.add("I");
		Minimax.State state = new Minimax.State(start, true);
		if (Minimax.minimax(state) == 1)
		{
			System.out.println("Player 1 Wins!");
		}
		else if (Minimax.minimax(state) == -1)
		{
			System.out.println("Player 2 Wins!");
		}
		else
		{
			System.out.println("It is a tie");
		}
	}
}