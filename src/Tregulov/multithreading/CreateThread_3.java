package Tregulov.multithreading;

public class CreateThread_3 {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Privet");
            }
        }).start();

        new Thread(() -> System.out.println("privet")).start();
    }
}
