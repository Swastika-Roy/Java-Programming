package Java.ListInterface.OOPs.Abstraction;

public class Abstraction {
    abstract static class Animals{
        abstract void walks();
        public void eats(){
            System.out.println("animal eats");
        }
        Animals(){
            System.out.println("you are creating a new animal");
        }
    }
    static class Horse extends Animals {
        void walks(){
            System.out.println("walks in four legs");
        }
    }
    static class Chicken extends Animals{
        Chicken(){
            System.out.println("Created a chicken");
        }
        void walks(){
            System.out.println("walks in two legs");
        }
    }

    public static void main(String[] args) {
        Horse horse = new Horse();
//        horse.walks();
//        horse.eats();
        Chicken chicken = new Chicken();

    }
}
