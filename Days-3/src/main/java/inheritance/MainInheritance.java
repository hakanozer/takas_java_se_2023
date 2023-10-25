package inheritance;

public class MainInheritance {

    public static void main(String[] args) {

        //Object obj = new A();
        //Object objBase = new Base();

        A a = new A();
        B b = new B();
        C c = new C();

        fncCall(a);
        fncCall(b);
        fncCall(c);

    }

    public static void fncCall(Base base) {
        base.call();
    }


}
