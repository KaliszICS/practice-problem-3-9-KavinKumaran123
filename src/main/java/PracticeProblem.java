import java.util.ArrayList;

public class PracticeProblem {

	public static void main(String args[]) {
		String[] moves = towerOfHanoi(3);
		for (String move : moves) {
			System.out.println(move);
		}
	}

	public static String[] towerOfHanoi(int n) {
		ArrayList<String> result = new ArrayList<>();
		
		// Move from Left (L) → Right (R) using Middle (M)
		solve(n, 'L', 'R', 'M', result);
		
		return result.toArray(new String[0]);
	}

	private static void solve(int n, char from, char to, char helper, ArrayList<String> result) {
		if (n == 0) return;

		// Move n-1 disks from "from" → "helper"
		solve(n - 1, from, helper, to, result);

		// Move largest disk from "from" → "to"
		result.add("" + from + to);

		// Move n-1 disks from "helper" → "to"
		solve(n - 1, helper, to, from, result);
	}

	public static void q1() {}
	public static void q2() {}
	public static void q3() {}
	public static void q4() {}
	public static void q5() {}
}