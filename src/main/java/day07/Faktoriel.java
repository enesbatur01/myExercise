package day07;

import java.util.Scanner;

public class Faktoriel {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Bir tam sayı giriniz...");
        int num = input.nextInt();
        int sum =1;
        System.out.print(num+"!="+num);
        for (int i = num-1; i > 0; i--) {
            sum+=sum*i;
            System.out.print("*"+i);

        }
        System.out.println("="+sum);
    }
}
