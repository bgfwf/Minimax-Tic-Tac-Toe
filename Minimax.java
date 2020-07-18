import java.util.*;
		
public final class Minimax {
	
		static int minimax(State state)
		{
			if (state.getActions().isEmpty())
			{
				return 0;
			}
			
			if (state.terminalState())
			{
				System.out.println(state + "#");
				if (state.getPlayer())
				{
					return -1;
				}
				return 1;
			}
			
			if (state.getPlayer())
			{
				System.out.println(state + "!");
				int maxVal = Integer.MIN_VALUE;
				for (State option : state.getActions())
				{
					int val = minimax(option);
					maxVal = max(maxVal, val);
				}
				return maxVal;
			}
			
			else
			{
				System.out.println(state + "?");
				int minVal = Integer.MAX_VALUE;
				for (State option : state.getActions())
				{
					int val = minimax(option);
					minVal = min(minVal, val);
				}
				return minVal;
			}
		}
		
		private static int max(int x, int y)
		{
			if (x > y)
			{
				return x;
			}
			return y;
		}
		
		private static int min(int x, int y)
		{
			if (x > y)
			{
				return y;
			}
			return x;
		}
		
	public static class State {
		
		final ArrayList<String> state;
		final boolean player1;
		final boolean player2;
		
		public State (ArrayList<String> state, boolean player1)
		{
			this.state = state;
			this.player1 = player1;
			this.player2 = !player1;
		}
		
		ArrayList<String> getState()
		{
			return state;
		}
		
		boolean getPlayer()
		{
			return player1;
		}
		
		Collection<State> getActions()
		{
			List<State> actions = new LinkedList<State>();
			if (state.get(0).equals("A") && player1)
			{
				ArrayList<String> newState = new ArrayList<String>();
				newState.addAll(state);
				newState.set(0, "X");
				actions.add(new State(newState, player2));
			}
			if (state.get(1).equals("B") && player1)
			{
				ArrayList<String> newState = new ArrayList<String>();
				newState.addAll(state);
				newState.set(1, "X");
				actions.add(new State(newState, player2));
			}
			if (state.get(2).equals("C") && player1)
			{
				ArrayList<String> newState = new ArrayList<String>();
				newState.addAll(state);
				newState.set(2, "X");
				actions.add(new State(newState, player2));
			}
			if (state.get(3).equals("D") && player1)
			{
				ArrayList<String> newState = new ArrayList<String>();
				newState.addAll(state);
				newState.set(3, "X");
				actions.add(new State(newState, player2));
			}
			if (state.get(4).equals("E") && player1)
			{
				ArrayList<String> newState = new ArrayList<String>();
				newState.addAll(state);
				newState.set(4, "X");
				actions.add(new State(newState, player2));
			}
			if (state.get(5).equals("F") && player1)
			{
				ArrayList<String> newState = new ArrayList<String>();
				newState.addAll(state);
				newState.set(5, "X");
				actions.add(new State(newState, player2));
			}
			if (state.get(6).equals("G") && player1)
			{
				ArrayList<String> newState = new ArrayList<String>();
				newState.addAll(state);
				newState.set(6, "X");
				actions.add(new State(newState, player2));
			}
			if (state.get(7).equals("H") && player1)
			{
				ArrayList<String> newState = new ArrayList<String>();
				newState.addAll(state);
				newState.set(7, "X");
				actions.add(new State(newState, player2));
			}
			if (state.get(8).equals("I") && player1)
			{
				ArrayList<String> newState = new ArrayList<String>();
				newState.addAll(state);
				newState.set(8, "X");
				actions.add(new State(newState, player2));
			}
			
			
			if (state.get(0).equals("A")&& player2)
			{
				ArrayList<String> newState = new ArrayList<String>();
				newState.addAll(state);
				newState.set(0, "O");
				actions.add(new State(newState, player2));
			}
			if (state.get(1).equals("B") && player2)
			{
				ArrayList<String> newState = new ArrayList<String>();
				newState.addAll(state);
				newState.set(1, "O");
				actions.add(new State(newState, player2));
			}
			if (state.get(2).equals("C") && player2)
			{
				ArrayList<String> newState = new ArrayList<String>();
				newState.addAll(state);
				newState.set(2, "O");
				actions.add(new State(newState, player2));
			}
			if (state.get(3).equals("D") && player2)
			{
				ArrayList<String> newState = new ArrayList<String>();
				newState.addAll(state);
				newState.set(3, "O");
				actions.add(new State(newState, player2));
			}
			if (state.get(4).equals("E") && player2)
			{
				ArrayList<String> newState = new ArrayList<String>();
				newState.addAll(state);
				newState.set(4, "O");
				actions.add(new State(newState, player2));
			}
			if (state.get(5).equals("F") && player2)
			{
				ArrayList<String> newState = new ArrayList<String>();
				newState.addAll(state);
				newState.set(5, "O");
				actions.add(new State(newState, player2));
			}
			if (state.get(6).equals("G") && player2)
			{
				ArrayList<String> newState = new ArrayList<String>();
				newState.addAll(state);
				newState.set(6, "O");
				actions.add(new State(newState, player2));
			}
			if (state.get(7).equals("H") && player2)
			{
				ArrayList<String> newState = new ArrayList<String>();
				newState.addAll(state);
				newState.set(7, "O");
				actions.add(new State(newState, player2));
			}
			if (state.get(8).equals("I") && player2)
			{
				ArrayList<String> newState = new ArrayList<String>();
				newState.addAll(state);
				newState.set(8, "O");
				actions.add(new State(newState, player2));
			}
			return actions;
		}
		
		boolean terminalState()
		{
			if ((state.get(0).equals(state.get(1)) && state.get(1).equals(state.get(2))) || (state.get(3).equals(state.get(4)) && state.get(4).equals(state.get(5))) || (state.get(6).equals(state.get(7)) && state.get(7).equals(state.get(8))) || (state.get(0).equals(state.get(3)) && state.get(3).equals(state.get(6))) || (state.get(1).equals(state.get(4)) && state.get(4).equals(state.get(7))) || (state.get(2).equals(state.get(5)) && state.get(5).equals(state.get(8))) || (state.get(0).equals(state.get(4)) && state.get(4).equals(state.get(8))) || (state.get(2).equals(state.get(4)) && state.get(4).equals(state.get(6))))
			{
				return true;
			}
			return false;
		}
		
		public String toString()
		{
			return "" + state;
		}
	}
}
