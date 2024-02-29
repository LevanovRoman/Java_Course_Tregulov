package GenuineCoder;

public class Test2 {
    public static void main(String[] args) throws InterruptedException {
        Thr2 thread1 = new Thr2("xcvb");
        Thr2 thread2 = new Thr2("tyutit");
        thread1.start();

        thread2.start();
        thread2.join();
    }
}

class Thr2 extends Thread{
    private String name;
    public Thr2(String name){
        this.name = name;
    }

    public void run(){
        for (int i = 0; i < 10; i++) {
            System.out.println("Name: " + name + "  " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

}