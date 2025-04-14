package Java.Thread;

//class Mytask{
//    void executeTask(){
//
//        for (int doc = 1; doc <= 10; doc++){
//            System.out.println(" @@ Printing Document #"+doc+ " - Printer2");
//        }
//
//    }
//}

//class Mytask extends Thread{
//    public void run(){
//
//        for (int doc = 1; doc <= 10; doc++){
//            System.out.println(" @@ Printing Document #"+doc+ " - Printer2");
//        }
//
//    }
//}

class CA{

}

class Mytask extends CA implements Runnable{
    public void run(){

        for (int doc = 1; doc <= 10; doc++){
            System.out.println(" @@ Printing Document #"+doc+ " - Printer2");
        }

    }
}

class Yourtask implements Runnable{
    public void run(){
        for (int doc = 1; doc <= 10; doc++){
            System.out.println(" ** Printing Document #"+doc+ " - Printer3");
        }
    }
}

public class App {
    public static void main(String[] args) {
        System.out.println("==Application Started==");

//        Mytask task = new Mytask();

        Runnable r = new Mytask();
        Thread task = new Thread(r);
        task.setDaemon(true);
        task.start();

        Thread yourtask = new Thread(new Yourtask());
               yourtask.start();

        for (int doc = 1; doc <= 10; doc++){
            System.out.println("^^ Printing Document #"+doc+ " - Printer1");
        }

        System.out.println("==Application finsihed==");
    }
}
