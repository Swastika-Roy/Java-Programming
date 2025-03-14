package Java.ListInterface.OOPs.Problems;

public class Multhithread {
    public static void main(String[] args) {
        classA obj1 = new classA();
        classB obj2 = new classB();
        classC obj3 = new classC();
        obj1.start();
        obj2.start();
        obj3.start();
        while (obj1.isAlive() || obj2.isAlive() || obj3.isAlive()) {
            System.out.println("thread are running");
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                System.out.println("interupted");
            }
        }
        System.out.println("finished");
    }
}
