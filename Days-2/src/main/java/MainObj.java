import java.util.Scanner;

public class MainObj {

    public static void main(String[] args) {

        // Object
        Action actionObj = new Action();
        System.out.println( actionObj.age );

        actionObj.fncVoid();

        actionObj.fncParams(55,66);
        actionObj.fncParams(44,88);
        actionObj.fncParams(77,99);

        int min1 = actionObj.fncMinus(99,11);
        int min2 = actionObj.fncMinus(88,22);
        int min3 = actionObj.fncMinus(77,33);
        if (min1 > 50 ) {
            System.out.println("Min: " +  min1);
        }
        System.out.println("Min: " +  min2);
        System.out.println("Min: " +  min3);

        if ( actionObj.fncMinus(6,3) > 2 ) {
            System.out.println("Minus Success");
        }

        String[] arr = {"Kemal", "Hasan", "Zehra"};
        int arrSize = actionObj.fncArr(arr);
        System.out.println(arrSize);

        String data = actionObj.addLines("Line-1", "Line -2", "Line -3", "Line -4" );
        System.out.println(data);

        Profile profile = new Profile();
        actionObj.fncObj(profile);
        //actionObj.fncObj(new Profile());

       Profile profile1 = actionObj.fncChangeName("Erkan Bilsin");
       System.out.println( profile1.username() );

        Object obj = null;
        //obj = actionObj;
        try {
             Action ac = (Action) obj;
             ac.fncVoid();
             int num =  actionObj.devide(0);
            System.out.println("Num: " + num);
        } catch (ArithmeticException | NullPointerException e) {
            System.err.println("Error : " + e);
        }
        System.out.println("Devide Line Call");

    }

}
