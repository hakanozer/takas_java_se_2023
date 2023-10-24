public class UseTryCatch {

    public static void main(String[] args) {

        int sum = 0;
        try {
            String stAge = "30";
            int age = Integer.parseInt(stAge);
            sum = age + 10;
            System.out.println("Sum :" + sum);
        }catch (Exception ex) {
            System.err.println("Lütfen Tam Sayı Giriniz! :" + ex.getMessage());
        }finally {
            System.out.println("All Time Call Line");
        }

        System.out.println("This Line Call :" + sum);

    }


}
