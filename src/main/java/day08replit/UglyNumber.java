package day08replit;

import java.util.Scanner;

public class UglyNumber {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı girin: ");
        int num = input.nextInt();

        boolean isUgly = isUglyNumber(num);

        if (isUgly) {
            System.out.println(num + " bir ugly numberdır.");
        } else {
            System.out.println(num + " bir ugly number değildir.");
        }
    }

    public static boolean isUglyNumber(int num) {
        if (num <= 0) {
            return false; // Negatif sayılar ve sıfır ugly number değildir.
        }

        while (num % 2 == 0) {
            num /= 2;
        }
        while (num % 3 == 0) {
            num /= 3;
        }
        while (num % 5 == 0) {
            num /= 5;
        }

        return num == 1; // Sonuç 1 ise ugly number'dır.



    }
}
