import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.TreeMap;

import static java.lang.System.out;

public class PartList {
    private TreeMap<Part, Integer> partsMap;

    public PartList() {
        // Instantiate partsMap here as an empty TreeMap
        partsMap = new TreeMap<>();
    }

    public PartList(String fileName) {
        this();
        try {
            Scanner file = new Scanner(new File(fileName));

            // Add code here to read from the file
            // And add Parts to the map
            while (file.hasNext()) {
                Part part = new Part(file.nextLine());

                if (partsMap.containsKey(part)) {
                    partsMap.put(part, partsMap.get(part) + 1);
                } else {
                    partsMap.put(part, 1);
                }
            }

            // No need to add anything in the catch blocks
            // This is just a demonstration
        } catch (IOException e) { // Most specific exceptions must be listed first
            out.println(e);
        } catch (RuntimeException e) {
            out.println(e);
        } catch (Exception e) {
            out.println(e);
        } finally {
            out.println("Done!");
        }
    }

    @Override
    public String toString() {
        String output = "";
        for (Part s : partsMap.keySet()) {
            output += s + " - " + partsMap.get(s) + "\n";
        }
        return output;
    }
}
