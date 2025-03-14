package Java.Questions;

abstract class Vehicle{
    abstract void startengine();
}

interface fuelEffeciency{
  public int calculateeffeciency();
}

class car extends Vehicle implements fuelEffeciency{
    void startengine(){
        System.out.println("start car's engine");
    }
    public int calculateeffeciency(){
        return 100;
    }
}

class  motorcycle extends Vehicle implements fuelEffeciency{
    @Override
    void startengine() {
        System.out.println("start motor's engine");
    }
    public int calculateeffeciency(){
        return 50;
    }
}

public class SixteenthQ {
    public static void main(String[] args) {
        car obj1 = new car();
        obj1.startengine();
        System.out.println("effeciency = "+obj1.calculateeffeciency());

        motorcycle obj2 = new motorcycle();
        obj2.startengine();
        System.out.println("effeciency = "+obj2.calculateeffeciency());
    }
}
