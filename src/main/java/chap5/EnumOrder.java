package chap5;

public class EnumOrder {
    public static void main(String[] args) {
        for(Spiciness spiciness: Spiciness.values()) {
            System.out.println(spiciness + " ");
        }
    }
}
