/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RegEx;

import java.util.Scanner;
import java.util.regex.*;

/**
 *
 * @author Andrei
 * @version 1.0
 */
public class HwRegEx {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = null;
        System.out.print("Introduce your PID for validation please: ");
        str = in.nextLine();
        validatePID(str);

    }

    /**
     * This method checks if a string respects the PID format. d MM DD YY XXXXXX
     *
     * @param currentString - the string that is going to be checked
     */
    public static void validatePID(String currentString) {
        // the pattern for PID
        // I've grouped the digits of the pattern into:
        // -the first digit(1/2), the month, the day, the year, the 6 remaining digits

        Pattern checkRegex = Pattern.compile("(1|2)(0[1-9]|1[0-2])(\\d\\d)(\\d\\d)(\\d\\d\\d\\d\\d\\d)");
        Matcher regexMatcher = checkRegex.matcher(currentString);
        boolean found = false;
        int s1, s2, s3, s4;

        if (regexMatcher.find()) {

            s1 = Integer.parseInt(regexMatcher.group(1));
            s2 = Integer.parseInt(regexMatcher.group(2));
            s3 = Integer.parseInt(regexMatcher.group(3));
            s4 = Integer.parseInt(regexMatcher.group(4));

            //condition for the months with 31 days
            if (s2 == 1 || s2 == 3 || s2 == 5 || s2 == 7 || s2 == 8 || s2 == 10 || s2 == 12) {
                if (s3 > 31) {
                    System.out.println("INCORRECT PID!");
                    return;
                }
            }
            //condition for leap year(an bisect)
            if (s2 == 2) {
                if (s4 % 4 != 0 && s3 > 28) {
                    System.out.println("INCORRECT PID!");
                    return;
                } else if (s3 > 29) {
                    System.out.println("INCORRECT PID!");
                    return;
                }
            }
            //condition for the moths with 30 days
            if (s2 == 4 || s2 == 6 || s2 == 9 || s2 == 11) {
                if (s3 > 30) {
                    System.out.println("INCORRECT PID!");
                    return;
                }
            }
            // if the string with the mentioned pattern is found and it respects all the conditions for MM DD YY then the PID is correct.
            System.out.println("PID OK!");
            found = true;

        }

        if (!found) {
            System.out.println("INCORRECT PID!");

        }
    }
}
