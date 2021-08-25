import static java.lang.System.*;

public class Blob implements Monster {
    // Add instance variables
    private String name;
    private int size;
    private String color;

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
        return "Name: " + name + "\nSize: " + size + "\nColor: " + color;
    }
}
