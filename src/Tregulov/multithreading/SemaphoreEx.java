package Tregulov.multithreading;

import java.util.concurrent.Semaphore;

public class SemaphoreEx {
    public static void main(String[] args) {
        Semaphore callBox = new Semaphore(2);

        new Person("Nikita", callBox);
        new Person("Oleg", callBox);
        new Person("Elena", callBox);
        new Person("Victor", callBox);
        new Person("Marina", callBox);
    }
}

class Person extends Thread{
    String name;
    private Semaphore callBox;

    public Person(String name, Semaphore callBox){
        this.name = name;
        this.callBox =callBox;
        this.start();
    }

    public void run(){
        try {
            System.out.println(name + " ждет...");
            callBox.acquire(); //метод для попытки получения разрешения у семафора.
                                // заблокирует поток пока ресурс не станет доступным.
            System.out.println(name + "пользуется телефоном");
            sleep(2000);
            System.out.println(name + "завершил звонок");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        finally {
            callBox.release(); // освобождаем разрешения семафора. всегда используется в блоке finally.
        }
    }
}

