/*
 * Author: Rocky Shi
 * Date: May 19, 2025
 * File Name: Test_Animal.java
 * Description: Main file for creating Animal objects to learn OOP
 */

public class Test_Animal {
    public static void main (String[] args) {

        // Create two Animal objecvts
        Animal panda = new Animal("Panda", "White and black", 4, true);
        Animal shark = new Animal("Greate White", "Grey", 0, true);

        // Change one attribute from the first Animal object
        panda.setCarnivoreStatus(false);
        // Use one method created
        panda.getCarnivoreStatus();

        shark.setAquaticStatus(true);

        panda.displayAnimal();
        System.out.println();
        shark.displayAnimal();
    }
}
