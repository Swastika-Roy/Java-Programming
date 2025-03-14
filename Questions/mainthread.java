package Java.Questions;

 class bachhathread extends Thread{
    bachhathread(String name){
        super(name);
    }
    public void run(){
        System.out.println("bachha thread name"+getName());
        for (int i = 1; i <= 5; i++){
            System.out.println(getName()+"output"+i*5);
            try {
                Thread.sleep(500);
            }catch (InterruptedException e){
                System.out.println(getName()+"interrupted");
            }
        }
        System.out.println(getName()+"finished");
    }
}
public class mainthread{
    public static void main(String[] args) {
       bachhathread b = new bachhathread("bachha thread");
       b.start();
       for (int i = 1; i <= 5; i++){
           System.out.println("main "+ i);
           try {

               Thread.sleep(500);
           }catch (InterruptedException e){
               System.out.println("interupted");
           }
       }
        System.out.println("finisheed");
    }
}
