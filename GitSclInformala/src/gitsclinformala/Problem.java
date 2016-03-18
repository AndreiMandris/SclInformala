/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gitsclinformala;

/**
 *
 * @author Andrei
 * @version 1.0
 */
public class Problem {

    static class Inner { // Static nested classes do not have access to other members of the enclosing class.

        String s; // in order to correct the program, i've moved the declaration of the s variable inside the Inner class

        /**
         * This method assigns a string of characters to the variable s.
         */
        void testMethod() {

            s = "Set from Inner";
        }

    }

}
