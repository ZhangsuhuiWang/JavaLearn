package chap7;

class Shape {
    Shape(int i) {
        System.out.println("Shape constructor");
    }
    void dispose() {
        System.out.println("Shape dispose");
    }
}

class Circle extends Shape {
    Circle(int i) {
        super(i);
        System.out.println("Circle constructor");
    }

    void dispose() {
        System.out.println("Erasing Circle");
        super.dispose();
    }
}

class Triangle extends Shape {
    Triangle(int i) {
        super(i);
        System.out.println("Triangle constructor");
    }

    void dispose() {
        System.out.println("Erasing Triangle");
        super.dispose();
    }
}

class Line extends Shape {
    private int start, end;
    Line(int start, int end) {
        super(start);
        this.start = start;
        this.end = end;
        System.out.println("Drawing Line:" + start + ", " + end);
    }

    void dispose() {
        System.out.println("Erasing Line: " + start + ", " + end);
        super.dispose();
    }
}

public class CADSystem extends Shape{
    private Circle c ;
    private Triangle t;
    private Line[] l = new Line[3];
    CADSystem(int i) {
        super(i);
        for(int j = 0; j < l.length; j++) {
            l[j] = new Line(j, j*j);
        }
        c = new Circle(1);
        t = new Triangle(1);
        System.out.println("CADSystem constructor");
    }

    public void dispose() {
        System.out.println("CADSystem dispose");
        t.dispose();
        c.dispose();
        for(int j = l.length - 1; j >= 0; j--) {
            l[j].dispose();
        }
    }

    public static void main(String[] args) {
        CADSystem cad = new CADSystem(47);
        try {

        }finally {
            cad.dispose();
        }
    }
}
