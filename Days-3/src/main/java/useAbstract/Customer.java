package useAbstract;

public abstract class Customer {

    public abstract int accountNumber();

    public int total() {
        int total = 0;
        int number = accountNumber();
        if (number == 100)
            total = 1000000;
        if (number == 200)
            total = 2000000;
        return total;
    }

    public String name() {
        String name = "";
        int number = accountNumber();
        if (number == 100)
            name = "Erkan Bilirim";
        if (number == 200)
            name = "Serkan Bilsin";
        return name;
    }

}
