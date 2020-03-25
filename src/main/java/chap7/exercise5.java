package chap7;

class A {
    public A(String s) {
        System.out.println("A()" + s);
    }
}

class B {
    public B(String s) {
        System.out.println("B()" + s);
    }
}

class C extends A {
    B b;
    public C(String s) {
        super(s);
        b = new B(s);
    }
}

public class exercise5 {
    public static void main(String[] args) {
        new C("C init");
    }
}

