package greenClouds;


import blueClouds.RainClouds;
import goldenClouds.Rainbow;
import yellowClouds.StormClouds;
import java.util.Scanner;

/**
 * Created by ronald on 11/09/16.
 */
public class ThunderClouds {

    public static int myheight;

    public static void thunder(){

        String water = "icy";
        int height = 1000;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a height in meters: ");
        myheight = scanner.nextInt();

        if(water.equals("icy") && myheight > height){
            System.out.println("Yahaa man, it's going to be a stormy night!!");
        }else{
            System.out.println("No storm today man, rest in peace!");
        }
    }

    public static void main(String[] args) {

        RainClouds rainClouds = new RainClouds();
        rainClouds.hail();

        RainClouds.DustyClouds rainClouds2 = rainClouds.new DustyClouds();
        rainClouds2.tornado();

        RainClouds.DustyClouds.WindBlast rainclouds3 = rainClouds2.new WindBlast();
        rainclouds3.icyrain();

        StormClouds rainClouds4 = new StormClouds();
        rainClouds4.Altitude();

        Rainbow rainClouds5 = new Rainbow();
        rainClouds5.summer();
    }
}
