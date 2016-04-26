/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Generice;

/**
 *
 * @author Andrei
 */
public final class HwGenerics<T>{

    public static <T> T max(T x, T y) {

        return x;
    }
    
    public static void main(String[] args){
        HwGenerics<Byte> a = new HwGenerics();
    }
    
 
}
