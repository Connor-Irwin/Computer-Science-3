import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class SpanishToEnglish {
    private Map<String, String> pairs;

    public SpanishToEnglish() {
        // Instantiate `pairs` as an empty TreeMap
        pairs = new TreeMap<>();
    }

    public void putEntry(String entry) {
        // String `entry` will be two words, separated by a space
        // The first word should be used as the key
        // The second word should be used as the value
        String[] split = entry.split(" ");
        pairs.put(split[0], split[1]);
    }

    public String translate(String sentence) {
        Scanner scan = new Scanner(sentence);
        StringBuilder output = new StringBuilder();

        // Scan through `sentence` using each word as a key for values in `pairs`
        // Remember to add a space between each word in the output.
        while (scan.hasNext()) {
            output.append(pairs.get(scan.next()));
            if (scan.hasNext()) {
                output.append(" ");
            }
        }

        return output.toString();
    }

    public String toString() {
        return pairs.toString().replaceAll("\\,", "\n");
    }
}
