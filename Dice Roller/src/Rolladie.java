// Author Nathan Sims, first java project 6/13/2020!

package rolladie;
import java.util.Random;


public class Rolladie   {

    public static void main (String [] args) {
    // simulate the roll of a die and print result to system

        Random r = new Random ();

        int result1 = r.nextInt(6); //gives result between 0 and 5 (6 is exclusive)
        result1++;

        int result2 = r.nextInt(6);
        result2++;

        System.out.println("Die One Result: "+result1);
        System.out.println("Die Two Result: "+result2);

}

}

