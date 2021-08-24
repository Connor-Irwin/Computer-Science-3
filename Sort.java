//sort example using an array of Comparable

import static java.lang.System.*;
import java.util.Arrays;

public class Sort {
    public static void main (String[] args) {
        Comparable[] creatureList = new Creature[3];

        //add 3 creatures to creatureList
        Creature lucy = new Creature(10);
        Creature pablo = new Creature(99);
        Creature ed = new Creature(1);

        creatureList[0] = lucy;
        creatureList[1] = pablo;
        creatureList[2] = ed;

        Arrays.sort(creatureList);  //will throw an exception until
                                    //creatures are added to the array		
        
        for(Comparable it : creatureList)
        {
            out.println(it);
        }	
    }
}