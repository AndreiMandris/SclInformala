/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io_nio_hmw;

import java.io.*;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

/**
 *
 * @author Andrei
 * @version 1.0
 */
public class Homework {

    public static void main(String[] args) throws IOException {

        //Using PrintWriter to write in a file
        PrintWriter pw = null;
        try {
            pw = new PrintWriter("file.txt");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Homework.class.getName()).log(Level.SEVERE, null, ex);
        }
        pw.println("Have a good day!");
        pw.close();

        //Using FileWriter to write in a file
        FileWriter fw = null;
        try {
            fw = new FileWriter("file2.txt");
            fw.write("heeeello");
        } catch (IOException ex) {
            Logger.getLogger(Homework.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                fw.close();
            } catch (IOException ex) {
                Logger.getLogger(Homework.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        //BufferedWriter
        BufferedWriter bw1 = null;
        try {
            bw1 = new BufferedWriter(new PrintWriter("file3.txt"));
            bw1.write("another thing\n");
            bw1.write("two things\n");
            bw1.write("evening\n");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Homework.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            bw1.close();
        }

        //reading from a file using bufferedreader and filereader
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader("file.txt"));
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Homework.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {

            System.out.println(br.readLine());
        } catch (IOException ex) {
            Logger.getLogger(Homework.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                br.close();
            } catch (IOException ex) {
                Logger.getLogger(Homework.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        //reading from a file using BufferedReader based on InputStreamReader and FileInputStream
        BufferedReader br2 = null;
        try {
            br2 = new BufferedReader(new InputStreamReader(new FileInputStream("file2.txt")));
            System.out.println(br2.readLine());
        } catch (Exception ex) {
            Logger.getLogger(Homework.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                br2.close();
            } catch (IOException ex) {
                Logger.getLogger(Homework.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        //using Scanner in order to read from the file
        Scanner input = null;
        try {
            input = new Scanner(Paths.get("C:\\Users\\Andrei\\Documents\\NetBeansProjects\\SclInformala\\GitSclInformala\\file3.txt"));
        } catch (IOException ex) {
            Logger.getLogger(Homework.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println(input.nextLine());

        //using Files static method from nio package to create a BufferedReader in order to read from a file
        BufferedReader br3 = null;
        try {
            br3 = Files.newBufferedReader(Paths.get("file.txt"));
            System.out.println(br3.readLine());
        } catch (IOException ex) {
            Logger.getLogger(Homework.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                br3.close();
            } catch (IOException ex) {
                Logger.getLogger(Homework.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

        //Reading from a file using readAllLines method from nio package
        ArrayList<String> list = (ArrayList) Files.readAllLines(Paths.get("C:\\Users\\Andrei\\Documents\\NetBeansProjects\\SclInformala\\GitSclInformala\\file3.txt"));
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

    }
}
