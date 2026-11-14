/*
Samuel Guizar
11/13/26
Module 6 Assignment
*/


public class Fan {

    //Constants for fan speed
    public static final int STOPPED = 0;
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;

    //Private fields
    private int speed;
    private boolean on;
    private double radius;
    private String color;

    //No argument constructor
    public Fan() {
        speed = STOPPED;
        on = false;
        radius = 6;
        color = "white";
    }

    //Constructor with arguments
    public Fan(int speed, boolean on, double radius, String color) {
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    //Get and set for speed
    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    //Get and set for on
    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    //Get and set for radius
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    //Get and set for color
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    //Returns a description of the fan
    @Override
    public String toString() {

        if (on) {
            return "Fan Speed: " + speed
                    + "\nFan Radius: " + radius
                    + "\nFan Color: " + color
                    + "\nFan is On";
        } else {
            return "Fan Radius: " + radius
                    + "\nFan Color: " + color
                    + "\nFan is Off";
        }
    }
}