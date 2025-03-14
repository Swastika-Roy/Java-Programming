package Java.Questions;
class Information{
    int id;
    String name;

     Information(int id,String name){
        this.id = id;
        this.name = name;
    }

    public void print(){
        System.out.println(id+" "+name);
    }
}
public class ThirdQ {
    public static void display(Information info ){
        info.print();
    }
    public static void main(String[] args) {
        Information obj = new Information(1,"Roy");
        display(obj);
    }
}

