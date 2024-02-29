package multithreading;

public class CreateThread_1_1 extends Thread{
    public void run(){
        for (int  i = 0;  i < 1000;  i++) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        CreateThread_1_1 thread11 = new CreateThread_1_1();
        thread11.start();

        for (int  i = 1000;  i > 0;  i--) {
            System.out.println(i);
        }
    }
}
