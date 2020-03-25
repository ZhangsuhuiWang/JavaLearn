package chap5;

// {CompileTimeError} (won't compile)

public class OverloadingVarargs {
    static void f(Character... characters) {
        System.out.println("first");
        for(Character ch: characters) {
            System.out.print(ch + " ");
        }
        System.out.println();
    }

    static void f(Integer... integers) {
        System.out.println("second");
        for(Integer in: integers) {
            System.out.print(in + " ");
        }
        System.out.println();
    }

    static void f(Long... args) {
        System.out.println("third");
        for(Long l: args) {
            System.out.print(l + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        f('a', 'b', 'c');
        f(1,2,3,4);
        f(1L, 2L, 3L);
        f(2, 1);
    }


}
