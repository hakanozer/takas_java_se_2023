package useCollections;

import java.util.ArrayList;
import java.util.Scanner;

public class MainArrayList {
    public static void main(String[] args) {

        // immutable Array
        String[] cities = {"İstanbul", "Ankara", "İzmir"};
        cities[0] = "Konya";

        // mutable Array
        ArrayList<String> arr = new ArrayList<>();

        // add item
        arr.add("İstanbul");
        arr.add("Ankara");
        arr.add("İzmir");
        arr.add("Zonguldak");
        arr.add("Samsun");

        /*
        Scanner scanner = new Scanner(System.in);
        for (;;) {
            System.out.println("Add Item, for exit (e)");
            String item = scanner.nextLine();
            if (item.equals("e")) {
                break;
            }else {
                arr.add(item);
            }
        }
         */

        int size = arr.size();
        System.out.println(size);

        System.out.println( arr.get(1) );

        for (int i = 0; i < arr.size(); i++) {
            System.out.println(arr.get(i));
        }

        System.out.println("====================");
        for (String item : arr) {
            System.out.println(item);
        }

        arr.add(1, "Antalya");

        if ( arr.size() > 10 )
        arr.remove(10);
        //arr.remove("Ankara");
        //arr.clear();

        arr.set(5, "Sivas");

        boolean status = arr.contains("İzmir");
        System.out.println(status);

        int index = arr.indexOf("İzmirx");
        System.out.println(index);

        System.out.println("====================");
        arr.forEach( item -> {
            System.out.println(item);
        });

        System.out.println(cities);
        System.out.println(arr);

    }
}
