/*
 * Author: Rocky Shi
 * Date: May 19, 2025
 * File Name: Animal.java
 * Description: Animal class to learn about OOP
 */

public class Animal {
    // Attributes
    private String name;
    private String color;
    private int numLegs;
    private boolean hasTail;
    private boolean isCarnivore;
    private boolean isAquatic;

    // Constructor
    public Animal (String defaultName, String defaultColor, int defaultNumLegs, boolean defaultTail) {
        name = defaultName;
        color = defaultColor;
        numLegs = defaultNumLegs;
        hasTail = defaultTail;

        isCarnivore = true;
        isAquatic = false;
    }

    // Methods
    public void run () {
        System.out.println("This " + name + " is running.");
    }
    public void hunt () {
        System.out.println("This " + name + " is hunting for food!");
    }
    public void eat () {
        System.out.println("This " + name + " is eating.");
    }
    public void sleep () {
        System.out.println("This " + name + " is sleeping.");
    }
    public void play () {
        System.out.println("This " + name + " is playing with its friends!");
    }
    public void displayAnimal () {
        System.out.println("Name: " + name);
        System.out.println("Color: " + color);
        System.out.println("Number of legs: " + numLegs);
        System.out.println("This animal has a tail? " + hasTail);
        System.out.println("This animal is a carnivore? " + isCarnivore);
        System.out.println("This animal is an aquatic animal? " + isAquatic);
    }

    // Getter methods
    public String getName () {
        return name;
    }
    public String getColor () {
        return color;
    }
    public int getLegCnt () {
        return numLegs;
    }
    public boolean getTailStatus () {
        return hasTail;
    }
    public boolean getCarnivoreStatus () {
        return isCarnivore;
    }
    public boolean getAquaticStatus () {
        return isAquatic;
    }

    // Setter Methods
    public String setName (String newName) {
        return name = newName;
    }
    public String setColor (String newColor) {
        return color = newColor;
    }
    public int setLegCnt (int newLegCnt) {
        return numLegs = newLegCnt;
    }
    public boolean setTailStatus (boolean tailStatus) {
        return hasTail = tailStatus;
    }
    public boolean setCarnivoreStatus (boolean carnivoreStatus) {
        return isCarnivore = carnivoreStatus;
    }
    public boolean setAquaticStatus (boolean aquaticStatus) {
        return isAquatic = aquaticStatus;
    }
}
