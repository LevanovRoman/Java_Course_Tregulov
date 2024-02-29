package GenuineCoder;

public class Test1 {
    public static void main(String[] args) {
        Thread thread1 = new Thread(new Thr("qwerty"));
        Thread thread2 = new Thread(new Thr("asdfg"));
        thread1.start();
        thread2.start();
    }
}

class Thr implements Runnable{
    private String name;

    public Thr(String name) {
        this.name = name;
    }

    @Override
    public void run() {
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
