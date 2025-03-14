package Java.Questions;

 class Account {
    private int age;
    private String name;

    public int getAge(){
        return age;
    }
    public String getName(){
        return name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public void setName(String name){
        this.name = name;
    }
}

public class FirstQ {
    public static void main(String[] args) {
        Account obj = new Account();
        obj.setAge(20);
        obj.setName("Roy");
        System.out.println("age = " + obj.getAge());
        System.out.println("name = " + obj.getName());
    }
}


