import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class OddEvenSets {
	private Set<Integer> odds;
	private Set<Integer> evens;

	public OddEvenSets() {
		this("");
	}

	public OddEvenSets(String line) {
		// Instantiate odds and evens as empty TreeSet objects
		// Create a Scanner to read the integers from line
		// Loop through the Scanner and assign each integer to the appropriate set
		odds = new TreeSet<>();
		evens = new TreeSet<>();
		Scanner in = new Scanner(line);

		while (in.hasNextInt()) {
			int next = in.nextInt();

			if (next % 2 == 0) {
				evens.add(next);
			} else {
				odds.add(next);
			}
		}
	}

	@Override
	public String toString() {
		return "ODDS : " + odds + "\nEVENS : " + evens;
	}
}
