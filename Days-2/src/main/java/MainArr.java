public class MainArr {

    public static void main(String[] args) {

        // Array
        String[] cities = {"İstanbul", "İzmir", "Adana", "Bursa", "Samsun"};

        // get item
        // index -> 0 dan başlar.
        System.out.println( cities[1] );

        // arr size
        int size = cities.length;
        System.out.println(size);

        cities[1] = "Antalya";
        int index = 4;
        if ( size > index ) {
            System.out.println( cities[index] );
        }
        System.out.println(cities[1]);
        System.out.println(cities);

        // loop
        for(int i = 0; i < 10; i++) {
            System.out.println("for loop");
        }
        System.out.println("This Line Call");

        for (int i = 0; i < size; i++) {
            if (i == 2) {
                continue;
            }
            String item = cities[i];
            System.out.println(item);
        }

        System.out.println("=============foreach================");
        // foreach
        for (String item: cities) {
            System.out.println(item);
        }

        System.out.println("=============for break================");
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                break; // döngüyü kırmak, sonlandırma.
            }
            System.out.println("fori :" + i);
        }

    }

}
