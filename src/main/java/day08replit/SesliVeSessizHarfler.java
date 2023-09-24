package day08replit;

import java.util.Scanner;

public class SesliVeSessizHarfler {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Bir harf giriniz..");
        String letter= input.next();
        char ch1=' ';
        if (letter.length()>1){
            System.out.println("Lütfen tek harf giriniz..");
        } else if (letter.matches("[\\p{Punct}]")) {
            System.out.println("Lütfen geçersiz karakter girmeyiniz..");
        } else if (letter.length()<=0) {
            System.out.println("Tek karakter giriniz..");
        } else {
            ch1=letter.charAt(0);
        }

        if (ch1=='a' ||ch1=='e' ||ch1=='ı' ||ch1=='i' ||ch1=='o' ||ch1=='ö' ||ch1=='u' ||ch1=='ü' ){
            System.out.println(ch1+" harfi sesli bir harftir.");
        } else{
            System.out.println(ch1+" harfi sessiz bir harftir");
        }

    }
}
