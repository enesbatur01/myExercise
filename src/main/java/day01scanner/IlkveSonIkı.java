package day01scanner;

import java.util.Scanner;

public class IlkveSonIkı {
    public static void main(String[] args) {
        //Kullanicidan alacaginiz 5 basamakli bir sayinin ilk iki ve son iki basamagindaki
        //rakamlarin toplamini yazdiran kodu yaziniz

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter 5 digit number");
        int num = input.nextInt();

        int firstTwo = num/1000;
        System.out.println("firstTwo = " + firstTwo);

        int lastTwo = num%100;
        System.out.println("LastTwo = " + lastTwo);

        int total=firstTwo+lastTwo;
        System.out.println("total = " + total);


    }
}
