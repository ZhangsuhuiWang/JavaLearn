package chap12;

public class Cleanup {
    public static void main(String[] args) {
        try {
            InputFile input = new InputFile("Cleanup.java");
            try {
                String s;
                int i = 1;
                while((s = input.getLine()) != null);
            } catch (Exception e) {
                System.out.println("Caught Exception in main");
                e.printStackTrace(System.out);
            }
            finally {
                input.dispose();
            }
        } catch (Exception e) {
            System.out.println("InputFile constructions failed");
        }
    }
}
