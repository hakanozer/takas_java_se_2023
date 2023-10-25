package inheritance;

public class A extends Base{

    @Override
    public void call() {
        action(10, 40, "A Class");
    }

    public void minus(int num1, int num2) {
        int min = num1 - num2;
        if (min > 10) {
            call();
        }else {
            super.call();
        }
        System.out.println("Min :" + min);
    }

}
