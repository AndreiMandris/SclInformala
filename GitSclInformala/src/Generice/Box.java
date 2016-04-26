/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Generice;

import java.util.List;

/**
 *
 * @author Andrei
 */
public class Box<T> {
    private T t;
    
    public void set(T t){
        this.t = t;
    }
    public T get(){
        return t;
    }
    



    //U extends Number limits U type to 
    public <U extends Number> void inspect(U u){  // here we specify the type of U
        System.out.println("T: " + t.getClass().getName()); // t.getClass().getName() returns the type of t
        System.out.println("U: " + u.getClass().getName()); // return type of u
    }
    
    public static void main(String[] args){
        Box<Integer> integerBox = new Box();
        integerBox.set(new Integer(10));
        //integerBox.inspect("some text"); //error: this is still String!
        //call inspect method with an Integer parameter
        Integer intObject;
        intObject = 20;
        integerBox.inspect(intObject);
        //call inspect method with a Double object
        Double doubleObject;
        doubleObject = 30.30;
        integerBox.inspect(doubleObject);
        
        
    }
}
