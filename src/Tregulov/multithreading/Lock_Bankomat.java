package Tregulov.multithreading;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Lock_Bankomat {
    public static void main(String[] args) throws InterruptedException {
        Lock lock = new ReentrantLock();

        new Employee("Zaur", lock);
        new Employee("Oleg", lock);
        new Employee("Elena", lock);
        Thread.sleep(5000);
        new Employee("Viktor", lock);
        new Employee("Marina", lock);
    }
}

class Employee extends Thread{
    String name;
    private Lock lock;
    public Employee(String name, Lock lock){
        this.name = name;
        this.lock = lock;
        this.start();
    }
    public void run(){
        if (lock.tryLock()){
            try {
    //            System.out.println(name + " ждет...");
    //            lock.lock();
                System.out.println(name + " пользуется банкоматом");
                Thread.sleep(2000);
                System.out.println(name + " завершил");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            finally {
                lock.unlock();
            }
        }
        else {
            System.out.println(name + " не хочет ждать в очереди");
        }
    }
}