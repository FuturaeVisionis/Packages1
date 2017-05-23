package goldenClouds;

import java.util.Scanner;

/**
 * Created by ronald on 11/09/16.
 */
public class Rainbow {

    enum Importance{
        Low, Medium, High
    }
    public void summer(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Type in either: Low, Medium or High ");
        String level = scanner.next();

        //create a variable
        Importance snow = Importance.valueOf(level);

        //Test the importance

        if (snow == Importance.Low) {
            System.out.println("You like cold weather!");
        } else if (snow == Importance.Medium) {
            System.out.println("You like mild weather.");
        } else if (snow == Importance.High) {
            System.out.println("You like hot weather!!");
        }
    }
}


