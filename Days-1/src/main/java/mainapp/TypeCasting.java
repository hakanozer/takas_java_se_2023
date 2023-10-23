package mainapp;

import java.util.Scanner;

public class TypeCasting {

    public static void main(String[] args) {

        Scanner read = new Scanner(System.in);

        System.out.println("Lütfen boyunuzu giriniz!");
        String stBoy = read.nextLine();

        System.out.println("Lütfen kilounuzu giriniz!");
        String stKilo = read.nextLine();

        double boy = Double.parseDouble(stBoy);
        double kilo = Double.parseDouble(stKilo);

        int intBoy = Integer.parseInt(stBoy);
        int intKilo = Integer.parseInt(stKilo);
        int end = intBoy / intKilo;
        System.out.println("Oran : " + end);

        double sonuc = boy / kilo;
        System.out.println("Oran : " + sonuc);

        // double to int
        int endSonuc = (int) sonuc;
        System.out.println("End Sonuc: " + endSonuc);

        // prices
        float p1 = 40.7f;
        float p2 = 30.9f;
        float fPriceSum = p1 + p2;

        int priceSum = (int) fPriceSum;
        System.out.println(priceSum);

        // Round
        double round = Math.round(fPriceSum);
        double ceil = Math.ceil(fPriceSum);
        double floor = Math.floor(fPriceSum);

        System.out.println("round : " + round);
        System.out.println("ceil : " + ceil);
        System.out.println("floor : " + floor);


        // char to int
        char c1 = '9';
        String cC1 = String.valueOf(c1);
        int cInt = Integer.parseInt(cC1);
        System.out.println(cInt);

    }

}
