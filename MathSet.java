import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class MathSet {
    private final Set<Integer> one;
    private final Set<Integer> two;

    public MathSet() {
        this("", "");
    }

    public MathSet(String o, String t) {
        // Suggested implementation: ignore or follow - your choice
        // Instantiate one and two as empty TreeSet objects
        // Create a Scanner to read the integers from o
        // Loop through the Scanner and assign each integer to one
        // Create a Scanner to read the integers from t
        // Loop through the Scanner and assign each integer to two
        one = new TreeSet<>();
        two = new TreeSet<>();

        Scanner a = new Scanner(o);
        Scanner b = new Scanner(t);

        while (a.hasNextInt()) {
            one.add(a.nextInt());
        }

        while (b.hasNextInt()) {
            two.add(b.nextInt());
        }
    }

    // Complete the following five methods so that they behave like the 
    // Mathematical Set Operations

    public Set<Integer> union() {
        Set<Integer> u = new TreeSet<>();

        u.addAll(one);
        u.addAll(two);

        return u;
    }

    public Set<Integer> intersection() {

        Set<Integer> i = new TreeSet<>(one);
        i.retainAll(two);

        return i;
    }

    public Set<Integer> differenceAMinusB() {
        Set<Integer> amb = new TreeSet<>(one);
        amb.removeAll(two);

        return amb;
    }

    public Set<Integer> differenceBMinusA() {
        Set<Integer> bma = new TreeSet<>(two);
        bma.removeAll(one);

        return bma;
    }

    public Set<Integer> symmetricDifference() {
        Set<Integer> sd = new TreeSet<>(differenceAMinusB());

        sd.addAll(differenceBMinusA());

        return sd;
    }

    @Override
    public String toString() {
        return "Set one - " + one + "\n" + "Set two - " + two + "\n";
    }
}
