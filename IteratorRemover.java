import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/**
 * Read in a list of words and a word to remove from the list.
 * Remove all occurrences of the word from list.
 * You must use an Iterator
 */

public class IteratorRemover {
    private ArrayList<String> list;
    private String toRemove;

    /**
     * Constructor for IteratorRemover:
     * Initialize instance variables here.
     * list should be an empty ArrayList
     * toRemove should be an empty String
     */
    public IteratorRemover() {
        list = new ArrayList<>();
        toRemove = "";
    }

    /**
     * Use this method to set the list and the
     * word to be removed.
     */
    public void setTest(String line, String rem) {
        list = new ArrayList<>(Arrays.asList(line.split(" ")));
        toRemove = rem;
    }

    /**
     * Removes all occurrences of toRemove from list
     */
    public void remove() {
        Iterator<String> it = list.iterator();

        while (it.hasNext()) {
            if (toRemove.equals(it.next())) {
                it.remove();
            }
        }
    }

    /**
     * Returns list as a String
     */
    @Override
    public String toString() {
        return list.toString();
    }
}
