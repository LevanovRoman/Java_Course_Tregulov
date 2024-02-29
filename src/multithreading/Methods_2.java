package multithreading;

public class Methods_2 extends Thread{
    public void run(){
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e){
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(new MyRunnable1());
        Methods_2 thread2  = new Methods_2();
        thread1.start();
        thread2.start();

        thread1.join();
        System.out.println("The end");
        thread2.join();
        System.out.println("The end");
    }
}

class MyRunnable1 implements Runnable{
    public void run(){
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e){
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + " " + i);
        }
    }
}
