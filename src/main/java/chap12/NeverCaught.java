package chap12;

public class NeverCaught {
    public static void f() {
        throw new RuntimeException();
    }

    public static void g() {
        f();
    }

    public static void main(String[] args) {
        g();
    }
}
