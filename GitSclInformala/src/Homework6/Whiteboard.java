package Homework6;

/**
 *
 * @author Andrei
 * @version 1.0
 */
public class Whiteboard extends Product implements Usable, Eraseable {

    /**
     * Whiteboard class constructor. Displays a string of characters.
     */
    public Whiteboard() {
        System.out.println("THIS");
    }

    /**
     * Methode that shows the use of a whiteboard
     */
    @Override
    public void useIt() {
        System.out.println("Things were drawn on the whiteboard.");
    }

    /**
     * Methode that shows how a whiteboard can be erased
     */
    @Override
    public void eraseIt() {
        System.out.println("The whiteboard has been wiped.");
    }

}
