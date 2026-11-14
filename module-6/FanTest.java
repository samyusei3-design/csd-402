/*
Samuel Guizar
11/13/26
Module 6 Assignment
*/


public class FanTest {

    public static void main(String[] args) {

        //Create fan using default constructor
        Fan fan1 = new Fan();

        //Create fan using argument constructor
        Fan fan2 = new Fan(Fan.FAST, true, 10, "blue");

        //Display default fan
        System.out.println("Default Fan:");
        System.out.println(fan1.toString());

        System.out.println();

        //Display second fan
        System.out.println("Second Fan:");
        System.out.println(fan2.toString());

        System.out.println();

        //Test setter methods on first fan
        fan1.setSpeed(Fan.MEDIUM);
        fan1.setOn(true);
        fan1.setRadius(8);
        fan1.setColor("black");

        //Display updated first fan
        System.out.println("Updated Default Fan:");
        System.out.println(fan1.toString());

        System.out.println();

        //Test getter methods
        System.out.println("Testing Getter Methods:");
        System.out.println("Fan 1 Speed: " + fan1.getSpeed());
        System.out.println("Fan 1 On: " + fan1.isOn());
        System.out.println("Fan 1 Radius: " + fan1.getRadius());
        System.out.println("Fan 1 Color: " + fan1.getColor());
    }
}