package Tregulov.multithreading;

public class Methods_1 {
    public static void main(String[] args) {
        MyThread5 myThread5 = new MyThread5();
        myThread5.setName("moy_potok");
        myThread5.setPriority(9);  // 1-10

        myThread5.setPriority(Thread.MIN_PRIORITY);
        myThread5.setPriority(Thread.NORM_PRIORITY);
        myThread5.setPriority(Thread.MAX_PRIORITY);

        System.out.println("Name of thread: " + myThread5.getName());
        System.out.println("Priority of thread: " + myThread5.getPriority());

    }
}

class MyThread5 extends Thread{
    public void run(){
        System.out.println("privet");
    }
}