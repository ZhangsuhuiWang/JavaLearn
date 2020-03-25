package chap10;

class WithNonDefault {
    class Inner {
        int i;
        Inner() {
            i = 47;
        }
        Inner(int i) {
            this.i = i;
        }
        public void f() {
            System.out.println("Inner.f()");
        }
    }
}

public class InnerClassInheritance {
    class Inner2 extends WithNonDefault.Inner {
        public Inner2(WithNonDefault wnd, int i) {
            wnd.super(i);
        }
        @Override
        public void f() {
            super.f();
            System.out.println("Inner2.f()");
        }
    }

    public static void main(String[] args) {
        InnerClassInheritance ich = new InnerClassInheritance();
        WithNonDefault wnd = new WithNonDefault();
        Inner2 i2 = ich.new Inner2(wnd, 47);
        i2.f();
    }
}
