package Java.ListInterface.OOPs.Problems;

 class classA extends Thread{
    int sum;
    public void run(){
        int sum = 0;
        for (int i = 0; i < 10; i++){
            sum = sum + i;
        }
        System.out.println("sum of natural no"+sum);
    }

}
class classB extends Thread{
     int sum ;
     public void run(){
         int sum = 0;
         for (int i = 0; i < 10; i++){
             sum += i*i;
         }
         System.out.println("square of natural no"+sum);
     }
}
class classC extends Thread{
     int sum;
     public void run(){
         int sum = 0;
         for (int i = 0; i < 10; i++){
             sum += i*i*i;
         }
         System.out.println("cube of natural number"+sum);
     }
}
