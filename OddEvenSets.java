import java.util.Set;

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
	}

	@Override
	public String toString() {
		return "ODDS : " + odds + "\nEVENS : " + evens + "\n\n";
	}
}
