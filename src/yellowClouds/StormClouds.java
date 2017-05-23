package yellowClouds;

import java.util.Date;
//import java.sql.Date;

import static greenClouds.ThunderClouds.myheight;

/**
 * Created by ronald on 11/09/16.
 */
public class StormClouds {

    public static blueClouds.RainClouds hurricane;

    public static void main(String[] args) {

        greenClouds.ThunderClouds wildstuff = null;

        wildstuff.thunder();

        hurricane.hail();


    }
    public static void Altitude(){

        String value = "Predicting the weather is very difficult";
        int water = 45;

        try {
            System.out.println("This weeks amount of rain per square inch is " + value.length());
            System.out.println("Today's humidity is: " + water / 40 + "%");
        } catch (Exception ex) {
            System.out.println("Sorry, we have a problem with today's weather prediction.");
        } finally {
            System.out.println("That was the weather for today. Have a good one folks!");
        }
    }
}
