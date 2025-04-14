package Java.Thread.Multithreading;

class Printer{
  synchronized  void printDocument(int numOfCopies,String docName){
        for (int i = 0; i <= numOfCopies; i++){
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println(">> Printing "+docName+" "+i);
        }
    }
}
class Mythread extends Thread{
    Printer pr;
    Mythread(Printer p){
        pr = p;
    }
    public void run(){
        synchronized (pr) {
            pr.printDocument(10, "HarrysProfile.pdf");
        }
    }
}

class Yourthread extends Thread{
    Printer pr;
    Yourthread(Printer p){
        pr = p;
    }
    public void run(){
        pr.printDocument(10,"HarrysProfile.pdf");
    }
}
public class SyncApp {
    public static void main(String[] args) {
        System.out.println("==Application Started==");

        Printer printer = new Printer();
//        print.printDocument(10,"TitusProfile.pdf");
        Mythread mr = new Mythread(printer);
        Yourthread yr = new Yourthread(printer);
        mr.start();
//        try {
//            mr.join();
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
        yr.start();
        System.out.println("==Application Finished==");
    }
}
