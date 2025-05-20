/*
 * Author: Rocky
 * Date: May 20, 2025
 * File Name: SuperAnimal.java
 * Description: Create a child class that inherits from Animal class
 * to learn inheritance for OOP
 */
public class SuperAnimal extends Animal {
    private boolean wings;
    private boolean canTeleport;
    
    // new attributes
    private boolean canBackFlip;
    private boolean canJuggle;

    public SuperAnimal (String defaultName, String defaultColor, int defaultNumLegs, boolean defaultTail, boolean defaultWings, boolean defaultTeleport, boolean defaultBackflip, boolean defaultJuggle) {
        super(defaultName, defaultColor, defaultNumLegs, defaultTail);
        wings = defaultWings;
        canTeleport = defaultTeleport;
        canBackFlip = defaultBackflip;
        canJuggle = defaultJuggle;
    }

    // Methods
    public void fly () {
        if (wings) {
            System.out.println("This " + getName() + " is flying!");
        } else {
            System.out.println("This " + getName() + " cannot fly.");
        }
    }
    public void teleport (String toPlace) {
        if (canTeleport) {
            System.out.println("This " + getName() + " is teleporting to " + toPlace);
        } else {
            System.out.println("This " + getName() + " cannot teleport.");
        }
    }
    // new methods
    public void backflip () {
        if (canBackFlip) {
            System.out.println("This " + getName() + " is doing a backflip!");
        } else {
            System.out.println("This " + getName() + " cannot backflip.");
        }
    }
    public void juggle () {
        if (canJuggle) {
            System.out.println("This " + getName() + " is juggling!");
        } else {
            System.out.println("This " + getName() + " cannot juggle.");
        }
    }
    public void eatPizza () {
        System.out.println("This " + getName() + " is eating pizza.");
    }

    // Getter methods
    public boolean getWingStatus () {
        return wings;
    }
    public boolean getTeleportStatus () { 
        return canTeleport;
    }

    // Setter methods
    public void setWingStatus (boolean hasWings) {
        wings = hasWings;
    }
    public void setTeleportStatus (boolean teleport) {
        canTeleport = teleport;
    }
}
