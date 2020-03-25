package chap7;

class Art {
    Art() {
        System.out.println("Art Constructor");
    }
}

class Drawing extends Art {
    Drawing() {
        System.out.println(("Drawing Constructor"));
    }
}

public class Cartoon extends Drawing{
    Cartoon() {
        System.out.println("Cartoon Constructor");
    }

    public static void main(String[] args) {
        Cartoon ct = new Cartoon();
    }
}
