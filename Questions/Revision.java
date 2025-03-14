package Java.Questions;

public class Revision {
    public static void display(Innformation info){
        info.print();
    }

    public static void main(String[] args) {
        Innformation obj = new Innformation(19,"Roy");
        display(obj);
    }
}

class Innformation{
    int age;
    String name;
    public Innformation(int age,String name){
        this.age = age;
        this.name = name;
    }
    public void print(){
        System.out.println("age = "+age+" name = "+name);
    }
}
