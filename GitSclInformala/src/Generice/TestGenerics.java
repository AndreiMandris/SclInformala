/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Generice;

public class TestGenerics {

 /**
 * main
 * @param args
 */
 public static void main(String[] args){
 // create three keys as Integers
 Integer key1 = 10;
 Integer key2 = 20;
 Integer key3 = 30;
 Integer key4 = 40;
 // create three values as Strings
 String value1 = "Value 1";
 String value2 = "Value 1";
 String value3 = "Value 1";
 // Declare, instantiate and initialized three OrderedPair objects
 OrderedPair<Integer, String> orderedPair1, orderedPair2, orderedPair3;
 orderedPair1 = new OrderedPair<>(key1,value1);
 orderedPair2 = new OrderedPair<>(key2,value2);
 orderedPair3 = new OrderedPair<>(key3,value3);
 // print values of all three objects
 System.out.println("OrderedPair1("+orderedPair1.getKey()+","+orderedPair1.getValue()+")");
 System.out.println("OrderedPair2("+orderedPair2.getKey()+","+orderedPair2.getValue()+")");
 System.out.println("OrderedPair3("+orderedPair3.getKey()+","+orderedPair3.getValue()+")");
 // Create a new Box instance
 // create a Box for Integers
 Box<Integer> integerBox = new Box<>();
 // set value of Integer field t to 10
 integerBox.set(80);
 OrderedPair<Integer, Box<Integer>> interestingPair;
 interestingPair = new OrderedPair<>(key4, integerBox);
 System.out.println("InterestingPair("+interestingPair.getKey()+","+interestingPair.getValue()+")");
 System.out.println("InterestingPair("+interestingPair.getKey()+","+interestingPair.getValue().get()+")");
 // using raw type
 Box rawBox = integerBox;
 System.out.println("Raw Box ("+ rawBox.get()+")");
 }
}