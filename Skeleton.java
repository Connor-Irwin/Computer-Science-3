import static java.lang.System.*;

public class Skeleton implements Monster {
    // Add instance variables
    private String name;
    private int size;

    // Add a constructor
    public Skeleton(String n, int s) {
        name = n;
        size = s;
    }

    // Add code to implement the Monster interface
    public String getName() {
        return name;
    }

    public int getHowBig() {
        return size;
    }

    public boolean isBigger(Monster other) {
        if (other.getHowBig() > size) return true;
        return false;
    }

    public boolean isSmaller(Monster other) {
        if (other.getHowBig() < size) return true;
        return false;
    }

    public boolean namesTheSame(Monster other) {
        if (other.getName().equals(name)) return true;
        return false;
    }

    // Add a toString method
    @Override
    public String toString() {
        return "Name: " + name + "\nSize: " + size;
    }
}
