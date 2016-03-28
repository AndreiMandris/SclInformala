/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HomeworkStrings;

/**
 *
 * @author Andrei
 */
public class ex4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String hi = "Hi, ";
        String mom = "mom.";
        String hiMom = hi + mom; //first method
        System.out.println(hiMom);

        System.out.println(hi.concat(mom)); //second method

    }

}
