/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hwMultthreading;

import java.io.FileWriter;
import java.io.IOException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Andrei
 * @version 1.0
 */
public class Test1 {

    public static Counter counter = new Counter();
    public static FileWriter fw;
    private static Object obj1 = new Object();

    public static void main(String[] args) {
        //creating two latches to know how much time to wait after the threads(10 countdowns for each in this case)
        CountDownLatch latch1 = new CountDownLatch(500);
        CountDownLatch latch2 = new CountDownLatch(500);
        //creating two executors that each of them will use 250 threads(can have as many as I want) for running the classes Adunare and Scadere in parallel 2 times each
        ExecutorService executor1 = Executors.newFixedThreadPool(250);
        ExecutorService executor2 = Executors.newFixedThreadPool(250);
        try {
            fw = new FileWriter("C:\\Users\\Andrei\\Documents\\NetBeansProjects\\SclInformala\\GitSclInformala\\MultithreadingFile.txt");
        } catch (IOException ex) {
            Logger.getLogger(Test1.class.getName()).log(Level.SEVERE, null, ex);
        }
        long t1 = System.currentTimeMillis();
        //using the thread from executor1 to start 500 classes that implements Runnable(in our case 500 Adunare classes)
        for (int i = 0; i < 500; i++) {
            executor1.submit(new Adunare(latch1, counter, fw, i));
        }
        //closing the executor after we are done with it
        executor1.shutdown();
        
        //using the thread from executor2 to start 500 classes that implements Runnable(in our case 500 Scadere classes)
        for (int i = 0; i < 500; i++) {
            executor2.submit(new Scadere(latch2, counter, fw, i));
        }
        //closing the executor after we are done with it
        executor2.shutdown();
        
        //waiting for every latch to be count down to 0. After that main thread gains the control.
        try {
            latch1.await();
            latch2.await();
        } catch (InterruptedException ex) {
            Logger.getLogger(Test1.class.getName()).log(Level.SEVERE, null, ex);
        }
        long t2 = System.currentTimeMillis();
        System.out.println(t2-t1);
        
        for (int i = 0; i < 500; i++) {
            System.out.println("La citirea " + i + " Contorul are valoarea:" + counter.value());
            writeCounterInFile(i);
        }
        
    }

    private static void writeCounterInFile(int count) {
        synchronized(obj1) {
            try {
                fw.append("TEST1 THREAD - La citirea " + count + " Contorul"
                        + " are valoarea:" + counter.value() + "\n");
            } catch (IOException ex) {
                Logger.getLogger(Test1.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
