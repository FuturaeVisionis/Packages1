package blueClouds;

/**
 * Created by ronald on 22/12/16.
 */
public class HailClouds {

    /**
     * These bottom guys are called instance variables or attributes or object fields. They store the state of the object (instance)
     */

    String curve;
    String color;


    HailClouds(String curve){
        this.curve = curve;
        System.out.println("My hail is " + curve);
    }

    public void cold() {
        System.out.println("We are very cold clouds");
    }


    public static void main(String[] args) {

        RainClouds google = new RainClouds(); // <-- within the same package, no import or reference name needed!!
        google.hail();

        goldenClouds.Rainbow microsoft = new goldenClouds.Rainbow(); // <-- package name reference OR use import statement
        microsoft.summer();

        HailClouds hailClouds = new HailClouds("Google"); // Each object has it's own copy of the instance variable.
        hailClouds.cold();

    }
}
