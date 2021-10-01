import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Relatives {
    private Map<String, Set<String>> map;

    public Relatives() {
        map = new TreeMap<>();
    }

    public void setPersonRelative(String line) {
        String[] array = line.split(" ");

        Set<String> set = map.get(array[0]);
        if (set == null) set = new TreeSet<>();
        set.add(array[1]);

        map.put(array[0], set);
    }

    public String getRelatives(String person) {
        return map.get(person).toString().replaceAll("[,\\[\\]]", "");
    }

    @Override
    public String toString() {
        String output = "";
        for (String person : map.keySet()) {
            output += person + " is related to ";
            for (String s : map.get(person)) {
                output += s + " ";
            }
            output += "\n";
        }
        return output;
    }
}
