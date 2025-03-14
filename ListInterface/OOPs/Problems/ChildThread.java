package Java.ListInterface.OOPs.Problems;

public class ChildThread extends Thread{
    public ChildThread(String name){
        super(name);
    }
    public void run() {
        System.out.println("child thread name" + getName());

        for (int i = 1; i <= 5; i++) {
            System.out.println(getName() + "output" + (i * 5));

            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                System.out.println(getName() + "interrupted");
            }
            System.out.println(getName() + "completed");
        }
    }
}
