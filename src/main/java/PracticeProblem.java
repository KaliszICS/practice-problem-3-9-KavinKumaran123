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
		
		// Start from Left (L) → Right (R) using Middle (M)
		solve(n, 'L', 'R', 'M', result);
		
		// Convert ArrayList to String[]
		return result.toArray(new String[0]);
	}

	private static void solve(int n, char from, char to, char helper, ArrayList<String> result) {
		if (n == 0) return;

		// Step 1: move n-1 disks to helper
		solve(n - 1, from, helper, to, result);

		// Step 2: move largest disk
		result.add("" + from + to);

		// Step 3: move n-1 disks to destination
		solve(n - 1, helper, to, from, result);
	}

	// Empty placeholders (leave these as is if not needed)
	public static void q1() {}
	public static void q2() {}
	public static void q3() {}
	public static void q4() {}
	public static void q5() {}
}