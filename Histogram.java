import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Histogram {
    private Map<String, Integer> histogram;

    public Histogram() {
        // Call setSentence with an empty String to
        // initialize `histogram`
        setSentence("");
    }

    public Histogram(String sentence) {
        // Call setSentence with given parameter to
        // initialize `histogram`
        setSentence(sentence);
    }

    public void setSentence(String sentence) {
        // Initialize `histogram` as an empty TreeMap
        // Use split to convert sentence to an array
        histogram = new TreeMap<>();

        String[] array = sentence.split(" ");

        for (String key : array) {
            histogram.merge(key, 1, Integer::sum);
        }
    }

    @Override
    public String toString() {
        String output = "char\t1---5----01---5\n";

        Set<String> keySet = histogram.keySet();

        for (String key : keySet) {
            output += key + "\t\t";
            for (int i = 0; i < histogram.get(key); i++) {
                output += "*";
            }
            output += "\n";
        }

        return output + "\n\n";
    }
}
