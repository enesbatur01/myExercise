package day07;

import java.util.Scanner;

public class GetRepeatingChar {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Bir kelime giriniz...");
        String str= input.next();
        String str2="";


        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            if (str.indexOf(currentChar) != str.lastIndexOf(currentChar)) {
                // Eğer karakterin ilk ve son indeksi farklı ise tekrar eden bir karakterdir.
                if (str.indexOf(currentChar) == i) {
                    // Sadece bir kez yazdırılması için kontrol eklenir.
                    System.out.print(currentChar);
                }
            }
        }

    }
}
