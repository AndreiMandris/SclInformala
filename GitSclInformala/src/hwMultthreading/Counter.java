/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hwMultthreading;

import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Andrei
 */
public class Counter {

    //var. comuna ce va fi accesata de mai multe threaduri
    private int c;

    /**
     * Increments the counter
     */
    synchronized public void increment(int i, FileWriter fw) {
        
        c++;
        this.writeAddition(i, fw);
    }

    /**
     * Decrements the counter
     */
    synchronized public void decrement(int i, FileWriter fw) {
        c--;
        this.writeSubstraction(i, fw);
    }

    public int value() {
        return c;
    }
    
    synchronized private void writeAddition(int i, FileWriter fw) {

        try {
            
                fw.append(" ADUNARE - La citirea " + i + " contorul are valoarea:" + this.value() + "\n");
                System.out.println("ADUNARE - La citirea " + i + " contorul are valoarea:" + this.value() + "\n");
            

        } catch (IOException ex) {
            Logger.getLogger(Adunare.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
    synchronized private void writeSubstraction(int i, FileWriter fw) {
        try {
            
                fw.append(" SCADERE - La citirea " + i + " contorul are valoarea:" + this.value() + "\n");
                System.out.println("SCADERE - La citirea " + i + " contorul are valoarea:" + this.value() + "\n");
            

        } catch (IOException ex) {
            Logger.getLogger(Adunare.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
