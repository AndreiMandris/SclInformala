/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Generice;

import java.io.*;

/**
 *
 * @author Andrei
 */
public class Singleton {

    public static void main(String[] args) {
       try{
           verifica(11);
       } catch(NumberFormatException e){
           System.out.println("Numar mai mare de 10.");
       }
    }
    public static void verifica(int a) throws NumberFormatException{
           if (a>10){
               throw new NumberFormatException();
           }
           System.err.println(a);
           
       }
}
