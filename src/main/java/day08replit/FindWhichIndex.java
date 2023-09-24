package day08replit;

import java.util.Scanner;

public class FindWhichIndex {
    public static void main(String[] args) {

        int []arr = {12,15,43,23,56,76,78,90,77,43};
        Scanner input = new Scanner(System.in);
        System.out.println("Aranan elemani giriniz...");
        int num = input.nextInt();

        for (int i = 0; i < arr.length-1; i++) {

            if (arr[i]==num){
                System.out.println(num+" sayisi arrayin "+i+". elemani");
            }

        }

    }
}
