package useThread;

public class Action extends Thread {

    String imagePath = "";
    public Action(String imagePath) {
        this.imagePath = imagePath;
    }

    @Override
    public void run() {
        long start = System.currentTimeMillis();
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(1000);
            }catch (Exception ex) {}
            System.out.println(imagePath + " Upload...");
        }
        long end = System.currentTimeMillis();
        long between = end - start;
        System.out.println(between + " - " + imagePath + " - Success");
    }


}
