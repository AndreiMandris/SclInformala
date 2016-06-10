/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hwMultthreading;

import java.io.FileWriter;
import java.io.IOException;
import java.util.concurrent.CountDownLatch;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Andrei
 */
public class Adunare implements Runnable {

    private CountDownLatch latch;
    private Counter counter;
    private FileWriter fw;
    private int i;

    //constructor
    public Adunare(CountDownLatch latch, Counter counter, FileWriter fw, int i) {
        this.latch = latch;
        this.counter = counter;
        this.fw = fw;
        this.i = i;
    }
    
    //Run method increments the counter by 1.
    @Override
    public void run() {
        if (null != counter) {
            counter.increment(i, fw);
            
            try {
                
                Thread.sleep(10);
            } catch (InterruptedException ex) {
                Logger.getLogger(Scadere.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        latch.countDown();
        

    }
    //writing into the file the value of the counter at each step
    synchronized private void writeCounterInFile(long count, FileWriter fw) {

        
            if (null != counter) {
                try {
                    fw.append(" ADUNARE - La citirea " + count + " contorul are valoarea:" + counter.value() + "\n");
                } catch (IOException ex) {
                    Logger.getLogger(Adunare.class.getName()).log(Level.SEVERE, null, ex);
                }
                System.out.println("ADUNARE - La citirea " + count + " contorul are valoarea:" + counter.value() + "\n");
            }

        

    }
}
