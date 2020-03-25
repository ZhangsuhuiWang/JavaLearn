package chap12;

public class OnOffSwitch {
    private static Switch sw = new Switch();
    public static void f() throws Switch.OnOffException, Switch.OnOffException2 {}

    public static void main(String[] args) {
        try {
            sw.on();
            f();
            sw.off();
        } catch (Switch.OnOffException e) {
            System.out.println("OnOffException");
            sw.off();
        } catch (Switch.OnOffException2 e) {
            System.out.println("OnOffException2");
            sw.off();
        }
    }
}
