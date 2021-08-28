import java.util.Scanner;

import static java.lang.System.*;

public class MonsterRunner {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        // Ask for name and size
        out.println("--- Monster 1 ---");

        out.print("Name: ");
        String name1 = keyboard.nextLine();

        out.print("Size: ");
        int size1 = keyboard.nextInt();
        keyboard.nextLine();

        // Instantiate a Monster
        Monster skel = new Skeleton(name1, size1);

        // Ask for name and size
        out.println("\n--- Monster 2 ---");

        out.print("Name: ");
        String name2 = keyboard.nextLine();

        out.print("Size: ");
        int size2 = keyboard.nextInt();
        keyboard.nextLine();

        out.print("Color: ");
        String color2 = keyboard.nextLine();

        // Instantiate another Monster
        Monster bob = new Blob(name2, size2, color2);

        out.println();

        // Compare the two Monsters
        if (skel.isBigger(bob))
            out.println("Monster one is bigger than Monster two.");
        else if (skel.isSmaller(bob))
            out.println("Monster one is smaller than Monster two.");
        else
            out.println("Monster one is the same size as Monster two.");

        if (skel.namesTheSame(bob))
            out.println("Monster one has the same name as Monster two.");
        else
            out.println("Monster one does not have the same name as Monster two.");
    }
}
