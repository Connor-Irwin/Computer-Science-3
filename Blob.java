import org.jetbrains.annotations.NotNull;

public class Blob implements Monster {
    // Add instance variables
    private final String name;
    private final int size;
    private final String color;

    // Add a constructor
    public Blob(String n, int s, String c) {
        name = n;
        size = s;
        color = c;
    }

    // Add code to implement the Monster interface
    public String getName() {
        return name;
    }

    public int getHowBig() {
        return size;
    }

    public String getColor() {
        return color;
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
        return "Name: " + name + "\nSize: " + size + "\nColor: " + color;
    }
}
