package Flower;

import com.sun.tools.javac.comp.Flow;

public class Flower {
    int petalCount = 0;
    String s = "initial value";

    Flower(int petals) {
        petalCount = petals;
        System.out.printf("Constructor w/ int arg only. petalCount = " + petalCount);
    }

    Flower(String ss)
    {
        System.out.printf("Constructor w/ String arg only. s = " + ss);
        s = ss;
    }

    Flower(String ss, int petals) {
        this(petals);
        this.s = ss;
        System.out.printf("String & int args");
    }

    Flower() {
        this("hi", 47);
        System.out.printf("default constructor (no args)");
    }
}
