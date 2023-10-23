package mainapp;

import java.util.Scanner;

public class UseScanner {

    public static void main(String[] args) {

        // Output ekranında kullanıcıdan veri almak için kullanılır.
        Scanner read = new Scanner(System.in);

        System.out.println("Adınız!");
        String name = read.nextLine();

        System.out.println("Lütfen sayı-1 giriniz!");
        int num1 = read.nextInt();

        System.out.println("Lütfen say-2 giriniz!");
        int num2 = read.nextInt();

        int sum = num1 + num2;
        System.out.println(name + " - " + "Sum: " + sum);

    }

}
