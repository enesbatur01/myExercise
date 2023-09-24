package day08replit;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        String sentence = input.nextLine();

        String reversed="";

        for (int i = sentence.length()-1; i >= 0; i--) {

            reversed+=sentence.charAt(i);

        }


        System.out.println(reversed);

    }
}
