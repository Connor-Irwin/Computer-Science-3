import java.util.Map;
import java.util.TreeMap;

public class Acronyms {
    private final Map<String, String> acronymTable;

    public Acronyms() {
        acronymTable = new TreeMap<>();
    }

    public void putEntry(String entry) {
        String[] list = entry.split(" - ");

        acronymTable.put(list[0], list[1]);
    }

    public String convert(String line) {
        for (String key : acronymTable.keySet()) {
            line = line.replaceAll("\\b" + key + "\\b", acronymTable.get(key));
        }

        return line;
    }

    @Override
    public String toString() {
        return acronymTable.toString().replaceAll(",", "\n");
    }
}
