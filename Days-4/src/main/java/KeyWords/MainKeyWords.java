package KeyWords;

public class MainKeyWords {
    public static void main(String[] args) {

        Action obj = new Action();
        System.out.println( obj.rowCount );

        System.out.println( Action.theme );
        Action.theme = "light";
        System.out.println( Action.theme );


    }
}
