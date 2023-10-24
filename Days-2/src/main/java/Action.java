public class Action {

    int age = 30;

    // Method
    // Void -> Geriye bir şey döndermeyen fonksyion
    // parameter -> fonksiyona gönderilen nesne, değişken, array vb.
    // return -> Geriye fonksyiondan nesne, değişken, array vb.dönderen

    public void fncVoid() {
        String name = "Erkan";
        System.out.println(name);
    }

    public void fncParams( int num1, int num2 ) {
        int sum = num1 + num2;
        System.out.println("Sum :" + sum);
    }

    public int fncMinus( int num1, int num2 ) {
        int min = num1 - num2;
        return min;
    }


    public int fncArr( String[] arr ) {
        return arr.length;
    }

    public String addLines( String... arr ) {
        String data = "";
        for (String item : arr) {
            data += item + " ";
        }
        return data;
    }

    public void fncObj( Profile profile ) {
        System.out.println( profile.username() );
    }

    /**
     * @Author <a href="mailto:ali@mail.com">Ali Bilmem</a>
     * <img src="https://media.geeksforgeeks.org/wp-content/uploads/Arrays1.png">
     * @apiNote Name Change Function
     * @param name
     * @return Profile Class
     * @see Profile
     * @since 1.8
     */
    public Profile fncChangeName( String name ) {
        Profile profile = new Profile();
        profile.name = name;
        return profile;
    }


    public int devide( int number ) throws ArithmeticException {
        int num1 = 100 / number;
        return num1;
    }


}
