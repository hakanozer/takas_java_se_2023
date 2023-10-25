package inheritance;

public class Base {

    public void call() {
        action(0,0,"");
    }

    public void action(int num1, int num2, String name) {
        String st1 = ""+ sum(num1, num2);
        String st2 = name(name);
        System.out.println(st2 + " - " + st1 );
    }

    private int sum ( int num1, int num2 ) {
        return num1 + num2;
    }

    private String name( String name ) {
        return name;
    }

}
