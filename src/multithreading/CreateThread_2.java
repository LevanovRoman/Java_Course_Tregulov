package multithreading;

public class CreateThread_2 {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new MyThread3());
        Thread thread2 = new Thread(new MyThread4());

        thread1.start();
        thread2.start();
    }
}

class MyThread3 implements Runnable{
    public void run(){
        for (int  i = 0;  i < 1000;  i++) {
            System.out.println(i);
        }
    }
}

class MyThread4 implements Runnable{
    public void run(){
        for (int  i = 1000;  i > 0;  i--) {
            System.out.println(i);
        }
    }
}