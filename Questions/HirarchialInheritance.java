package Java.Questions;
class A {
    void print(){
        System.out.println("class A ");
    }
}

class B extends A {
    void  print(){
        System.out.println("class B");
    }
}

class C extends A{
    void print(){
        System.out.println("class c");
    }
}

public class HirarchialInheritance {
    public static void main(String[] args) {
        A obj = new A();
        obj.print();
        B obj2 = new B();
        obj2.print();
        C obj3 = new C();
        obj3.print();
    }
}
