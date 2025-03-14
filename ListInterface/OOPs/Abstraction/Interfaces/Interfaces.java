package Java.ListInterface.OOPs.Abstraction.Interfaces;
// interfaces are public static final and abstract by default
// a class that implements interfaces must declare all fuctions of that interface
// supports the functionality of multiple inheritance

public class Interfaces {
    interface Animal{
        int eyes = 2;
       void walks();
    }
    interface  Herbivores{
        void eats();
    }
    static class Horse implements Animal,Herbivores{
        public void walks(){
            System.out.println("walks on four legs");
        }
        public void eats(){
            System.out.println("eats plants");
        }
    }

    public static void main(String[] args) {
        Horse horse = new Horse();
        horse.walks();
        horse.eats();

    }
}

