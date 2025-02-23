
//Задание 30: Программа для демонстрации явной проверки условий ожидания в Java
//Для этой задачи мы используем synchronized блок и wait() / notify(), чтобы управлять ожиданием и пробуждением потока.
class SharedResource {
    private boolean ready = false;

    public synchronized void waitForCondition() {
        while (!ready) {
            try {
                System.out.println(Thread.currentThread().getName() + " ожидает...");
                wait(); // Поток ждет, пока ready не станет true
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(Thread.currentThread().getName() + " продолжил выполнение!");
    }

    public synchronized void setReady() {
        ready = true;
        System.out.println(Thread.currentThread().getName() + " изменил состояние и уведомляет ожидающие потоки.");
        notifyAll(); // Пробуждает все потоки, которые ждали
    }
}

public class Task30 {
    public static void main(String[] args) {
        SharedResource resource = new SharedResource();

        // Поток, который ожидает условие
        Thread waitingThread = new Thread(resource::waitForCondition, "Ожидающий поток");

        // Поток, который устанавливает условие через 3 секунды
        Thread notifyingThread = new Thread(() -> {
            try {
                Thread.sleep(3000); // Имитация задержки
                resource.setReady();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }, "Уведомляющий поток");

        waitingThread.start();
        notifyingThread.start();
    }
}

