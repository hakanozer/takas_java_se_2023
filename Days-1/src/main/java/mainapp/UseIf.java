package mainapp;

public class UseIf {

    public static void main(String[] args) {

        int num1 = 40;
        int num2 = 45;

        // Karar kontrol yapısıdır.
        boolean status = num1 > num2;
        System.out.println("num1 > num2 : " + status);

        status = num1 < num2;
        System.out.println("num1 < num2 : " + status);

        status = num1 != num2;
        System.out.println("num1 != num2 : " + status);

        status = num1 == num2;
        System.out.println("num1 == num2 : " + status);

        // if
        if ( num2 > num1 ) {
            System.out.println("if true");
        }

        if (num2 < num1)
            System.out.println("1 Line Call");
        System.out.println("This Line Call");

        String username = "ali01";
        String password = "12345";

        // && -> sol taraftaki ve sağ taraftaki koşulları kesinlikle geçerli olacak.
        if (username.equals("ali01") && password.equals("12345")) {
            System.out.println("Login Success");
        }else {
            System.out.println("Username or Password Fail");
        }

        // || -> veya -> sol taraf veya sağ taraftaki koşullardan biri sağlandı ise.
        if ( num1 > 40 || num2 > 40 ) {
            System.out.println("|| Success");
        }else {
            System.out.println("|| Fail");
        }


        status = num1 > 40 || num2 > 45 && num1 > 10;
        System.out.println(status);


        // else if
        String name = "a";
        String email = "a";
        String pass = "a";

        if ( name.equals("") || email.equals("") || pass.equals("") ) {
            System.out.println("All input Empty!");
        }else {
            System.out.println("Send Form!");
        }

        if (name.equals("")) {
            System.out.println("Name Empty!");
        }else if (email.equals("")) {
            System.out.println("Email Empty!");
        }else if (pass.equals("")) {
            System.out.println("Password Empty!");
        }else {
            System.out.println("Send Form!");
        }

        boolean formSendStatus = false;
        if (name.equals("")) {
            System.out.println("Name Empty!");
            formSendStatus = false;
        }else {
            formSendStatus = true;
        }

        if (email.equals("")) {
            System.out.println("Email Empty!");
            formSendStatus = false;
        }else {
            formSendStatus = true;
        }

        if (pass.equals("")) {
            System.out.println("Password Empty!");
            formSendStatus = false;
        }else {
            formSendStatus = true;
        }

        System.out.println(formSendStatus);

    }

}
