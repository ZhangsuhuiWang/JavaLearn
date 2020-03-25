package chap10;

public class Pacel19 {
    public Destination destination(final String dest) {
        return new Destination() {
            private String label = dest;
            public String readLabel() {
                return label;
            }
        };
    }

    public static void main(String[] args) {
        Pacel19 p = new Pacel19();
        Destination d = p.destination("Tasmania");
    }
}
