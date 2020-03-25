package chap12;

class MyDefineException extends Exception {}

class MyAnotherException extends Exception {}

public class test10 {
    public void f() throws MyAnotherException{
        try {
            g();
        } catch (MyDefineException e) {
            System.out.println("Caught MyDefineException");
            throw new MyAnotherException();
        }
    }

    public void g() throws MyDefineException{
        throw new MyDefineException();
    }

    public static void main(String[] args) {
        test10 ex = new test10();
        try {
            ex.f();
        } catch (MyAnotherException e) {
            System.out.println("Caught: " + e);
        }
    }
}
