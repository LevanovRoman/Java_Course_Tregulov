package Tregulov.multithreading;

public class SynchronizedBlock3 {

//    static final Car car = new Car();
    static final Object lock = new Object();

    void mobileCall() {
        synchronized(lock) {
            System.out.println("Mobile call starts");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Mobile call ends");
        }
    }

    void skypeCall() {
        synchronized(lock) {
            System.out.println("skype call starts");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("skype call ends");
        }
    }

    void whatsAppCall() {
        synchronized(lock) {
            System.out.println("whatsApp call starts");
            try {
                Thread.sleep(7000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("whatsApp call ends");
        }
    }

    public static void main(String[] args) {
        Thread thread1 = new Thread(new RunnableImplMobile());
        Thread thread2 = new Thread(new RunnableImplSkype());
        Thread thread3 = new Thread(new RunnableImplWhatsApp());

        thread1.start();
        thread2.start();
        thread3.start();
    }
}

class RunnableImplMobile implements Runnable{
    public void run(){
        new SynchronizedBlock3().mobileCall();
    }
}

class RunnableImplSkype implements Runnable{
    public void run(){
        new SynchronizedBlock3().skypeCall();
    }
}

class RunnableImplWhatsApp implements Runnable{
    public void run(){
        new SynchronizedBlock3().whatsAppCall();
    }
}

//class Car{}