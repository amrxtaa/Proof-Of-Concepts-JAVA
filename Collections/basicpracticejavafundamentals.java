import java.io.*;
class funda {
    public synchronized void wish(String name) {
        for (int i = 0; i < 10; i++) {
            System.out.println("good morning");
            try {
                Thread.sleep(6000);
            } catch (InterruptedException e) {

            }
            System.out.println(name);
        }
    }
}
    class myThread extends Thread{
        funda d;
        String name;
        myThread(funda d, String name)
        {
            this.d=d;
            this.name=name;
        }
        public void run()
        {
            d.wish(name);
        }
    }
    class Synchronizeddemo {
        public static void main(String[] args) {
            funda d = new funda();
            myThread t1 = new myThread(d, "dhoni");
            myThread t2 = new myThread(d, "kohli");
            t1.start();
            t2.start();
        }
    }

