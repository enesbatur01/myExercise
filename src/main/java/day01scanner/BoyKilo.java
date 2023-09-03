package day01scanner;

import java.util.Scanner;

public class BoyKilo {
    public static void main(String[] args) {

        /*
       Ornek:  Kullanıcıdan i)Adini ve Soyadini ii)Yaşını iii)Boyunu iv)kilosunu v) medeni durumunu girmesini isteyin
               Ardından bunları bir etiketle konsolda farklı satırlarda yazdırın
        */

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your name and surname...");
        String name= input.nextLine();
        System.out.println("Please enter your age...");
        byte age = input.nextByte();
        System.out.println("Please enter your height...");
        double height = input.nextDouble();
        System.out.println("Please enter your weight...");
        int weight = input.nextInt();
        System.out.println("Please enter your marital status...");
        String maritalStatus = input.next();
        System.out.println("name = " + name);
        System.out.println("age = " + age);
        System.out.println("height = " + height);
        System.out.println("weight = " + weight);
        System.out.println("maritalStatus = " + maritalStatus);


    }
}
