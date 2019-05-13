public class Welcome {
    public static void main(String[] args) {
        String greeting = "Welcome to Core Java";
        System.out.println(greeting);
        for(int i = 0; i < greeting.length(); i++) {
            System.out.print("=");
        }
        System.out.println();
        String greetings = "hello";
        int index = greetings.offsetByCodePoints(0, 0);
        System.out.println(greetings.charAt(index));
        System.out.println(index);
        int cp = greetings.codePointAt(index);
        System.out.println(cp);
    }
}
