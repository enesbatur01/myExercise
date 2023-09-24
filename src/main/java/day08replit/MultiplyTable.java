package day08replit;

import java.util.Scanner;

public class MultiplyTable {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();

        for (int i = 1; i < 11; i++) {

            System.out.println(num1*i);
        }
    }
}
