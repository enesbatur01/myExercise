package day01scanner;

import java.util.Scanner;

public class TekCiftBuldurma {
    public static void main(String[] args) {

        //Example 2: Kullanicidan alinan bir sayinin tek mi cift mi oldugunu yazdiran kodu olusturunuz

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter any number...");
        int num= input.nextInt();

        System.out.println(num % 2 == 0 ? "Double number" : "Single number");

    }
}
