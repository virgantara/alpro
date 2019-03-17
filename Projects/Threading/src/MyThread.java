/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author oddy
 */
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author oddy
 */
public class MyThread implements Runnable {

    boolean isRunning = true;
    private Thread thread;
    int jumlah = 10;
    String threadName = "";

    public MyThread(String threadName) {
        thread = new Thread(this, threadName);
        this.threadName = threadName;
    }

    public void start() {
        thread.start();

    }

    @Override
    public void run() {
        while (isRunning) {
            try {
                jumlah--;

                System.out.println(threadName + " Jumlah : " + jumlah);
                if (jumlah == 0) {
                    isRunning = false;
                }
                Thread.sleep(500);
            } catch (InterruptedException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }

    public static void main(String[] args) {
        MyThread t1 = new MyThread("Thread 1");
        t1.start();

        MyThread t2 = new MyThread("Thread 2");
        t2.start();
    }

}
