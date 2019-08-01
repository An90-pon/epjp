package b10;

public class S111 {
    public static void main(String[] args) {                                       // ad esempio faccio un thread che legge i dati ed uno che fa l'interfaccia grafica. Come ad esmpio quando si implementa un videogioco
        Runnable runnable = new Runner();

        Thread[] threads = { new Thread(runnable), new MyThread() };              //  istanza di una interfaccia
        for (Thread t : threads) {
            t.start();
        }

        System.out.println("Main thread done");
    }
}

class Runner implements Runnable {
    @Override
    public void run() {
        System.out.println("The Runner runs");
    }
}

class MyThread extends Thread {
    @Override
    public void run() {
        System.out.println("MyThread runs");
    }
}