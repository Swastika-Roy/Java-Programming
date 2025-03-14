package Java.arrays.StreamApi;

public class Main {
    public static void main(String[] args) {
        Walkable obj = (steps, isEnabled) -> {
            System.out.println("walking "+steps+" steps.");
            return 2*steps;
        };
        Walkable obj2 = (steps, isEnabled) -> 2*steps;
        obj.walk(2,true);
    }

    interface Walkable{
        int walk(int steps,boolean isEnabled);
    }
}
