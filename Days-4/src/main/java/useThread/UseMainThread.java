package useThread;

public class UseMainThread {

    public static void main(String[] args) {

        String[] paths = {"1.jpg", "2.jpg", "3.jpg", "4.jpg"};
        for(String path : paths) {
            Action ac1 = new Action(path);
            ac1.start();
        }
        System.out.println("This Line Run");

    }

}
