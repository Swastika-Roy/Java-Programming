package Java.ListInterface.OOPs.Problems;

class ChldThread extends Thread {
    public ChldThread(String name) {
        super(name); // Set the thread name
    }

    @Override
    public void run() {
        System.out.println("Starting " + this.getName());
        for (int i = 1; i <= 10; i++) {
            System.out.println(this.getName() + " prints: " + i);
            try {
                Thread.sleep(500); // Pause for a while to simulate work
            } catch (InterruptedException e) {
                System.out.println(this.getName() + " was interrupted.");
            }
        }
        System.out.println(this.getName() + " has finished execution.");
    }
}

public class ThreadExample {
    public static void main(String[] args) {
        ChldThread childThread = new ChldThread("ChildThread");
        childThread.start();

        // Main thread logic
        System.out.println("Starting MainThread");
        for (int i = 1; i <= 10; i++) {
            System.out.println("MainThread: " + i + " * 5 = " + (i * 5));
            try {
                Thread.sleep(500); // Pause for a while to match child thread's pace
            } catch (InterruptedException e) {
                System.out.println("MainThread was interrupted.");
            }
        }

        // Wait for the child thread to finish before exiting
        try {
            childThread.join();
        } catch (InterruptedException e) {
            System.out.println("MainThread was interrupted while waiting for ChildThread.");
        }

        System.out.println("MainThread and ChildThread have finished execution.");
    }
}

