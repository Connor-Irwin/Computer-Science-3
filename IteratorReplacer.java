import java.util.ArrayList;
import java.util.Arrays;
import java.util.ListIterator;

/**
 * Read in a list of words, a word to replace, and a word with which to replace the original word.
 * Replace all occurrences of the original word with the new word.
 * You must use a ListIterator
 */
public class IteratorReplacer {
    private ArrayList<String> list;
    private String toRemove;
    private String replaceWith;
    
    /**
     * Constructor for IteratorReplacer:
     * Initialize instance variables here.
     * list should be an empty list.
     * toRemove and replaceWith should be empty Strings.
     */
    public IteratorReplacer() {
        list = new ArrayList<>();
        toRemove = "";
        replaceWith = "";
    }
    
    /**
     * Set the values here for testing
     */
    public void setEmAll(String line, String rem, String rep) {
        list = new ArrayList<>(Arrays.asList(line.split(" ")));
        toRemove = rem;
        replaceWith = rep;
    }

    /**
     * Replaces all occurrences of `toRemove` with `replaceWith`
     */
    public void replace() {
        ListIterator<String> it = list.listIterator();

        while (it.hasNext()) {
            if (it.next().equals(toRemove)) {
                it.set(replaceWith);
            }
        }
    }

    @Override
    public String toString() {
        return list.toString();
    }
}
