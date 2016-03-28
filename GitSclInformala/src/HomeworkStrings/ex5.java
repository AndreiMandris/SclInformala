/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HomeworkStrings;

import static java.lang.Character.isUpperCase;

/**
 *
 * @author Andrei
 */
public class ex5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String name = "Andrei Traian Mandris";
        for (int i = 0; i < 21; i++) {

            if (isUpperCase(name.charAt(i))) {
                System.out.println(name.charAt(i));
            }
        }
    }

}
