package day07;

import java.util.Scanner;

public class PrintReverseNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz...");
        Integer num = input.nextInt();
        String nums = num.toString();

        String nullNum="";



        for (int i = nums.length()-1; i >=0; i--) {

        nullNum+=nums.charAt(i);

        }
        System.out.println("Girilen Numananin Tersi: "+nullNum);
    }
}
