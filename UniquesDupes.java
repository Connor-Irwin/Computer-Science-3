import java.util.*;

public class UniquesDupes {
    public static Set<String> getUniques(String input) {
        // Create a Set of Strings called `uniques` and instantiate it with a TreeSet
        // Create a List of Strings called `list` and instantiate it with an ArrayList using `input`
        // Add items from `list` to `uniques`
        String[] words = input.split(" ");
        List<String> list = new ArrayList<>(Arrays.asList(words));

        // Return `uniques`
        return new TreeSet<>(list);
    }

    public static Set<String> getDupes(String input) {
        // Create a Set of Strings called `uniques` and instantiate it with a TreeSet
        // Create a Set of Strings called `dupes` and instantiate it with a TreeSet
        // Create a List of Strings called `list` and instantiate it with an ArrayList using `input`
        // Add items from `list` to `uniques` and determine which items should go in `dupes`
        TreeSet<String> uniques = new TreeSet<>();
        TreeSet<String> dupes = new TreeSet<>();
        String[] words = input.split(" ");
        List<String> list = new ArrayList<>(Arrays.asList(words));

        for (String word : list) {
            if (!uniques.add(word)) {
                dupes.add(word);
            }
        }

        // Return `dupes`
        return dupes;
    }
}
