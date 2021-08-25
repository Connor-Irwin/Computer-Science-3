import org.jetbrains.annotations.NotNull;

public class Skeleton implements Monster {
    // Add instance variables
    private final String name;
    private final int size;

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

    public boolean isBigger(@NotNull Monster other) {
        return other.getHowBig() > size;
    }

    public boolean isSmaller(@NotNull Monster other) {
        return other.getHowBig() < size;
    }

    public boolean namesTheSame(@NotNull Monster other) {
        return other.getName().equals(name);
    }

    // Add a toString method
    @Override
    public String toString() {
        return "Name: " + name + "\nSize: " + size;
    }
}
