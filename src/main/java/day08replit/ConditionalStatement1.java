package day08replit;

import java.util.Scanner;

public class ConditionalStatement1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Bir sayı giriniz..");
        int num = input.nextInt();

        if (num>0){
            System.out.println("Sayı pozitif");
        } else if (num<0) {
            System.out.println("Sayı negatif");
        }else System.out.println("Sayı sıfır");


    }
}
