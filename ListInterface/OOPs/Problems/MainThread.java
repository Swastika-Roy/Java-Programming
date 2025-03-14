package Java.ListInterface.OOPs.Problems;

public class MainThread {
    public static void main(String[] args) {
        ChildThread childThread = new ChildThread("child thread");
        childThread.start();
        for(int i = 1; i <= 5; i++){
            System.out.println("Main thread"+i);
            try {
                Thread.sleep(50);
            }
            catch (InterruptedException e){
                System.out.println("intrupted");
            }
        }
        System.out.println("completed");
    }
}
