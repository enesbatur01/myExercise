package day01scanner;

import java.util.Scanner;

public class DikDortgenKenar {
    public static void main(String[] args) {
        //Kullanicidan bir dikdortgenin iki kenar uzunlugunu aliniz
        //i)Alanini hesaplayiniz ==> Kisa kenar * Uzun kenar
        //ii)Cevresini hesaplayiniz ==> 2Kisa Kenar + 2Uzun Kenar

        Scanner input = new Scanner(System.in);
        System.out.println("Please give the side leenghts of the rectangle...\nPlease enter short side... ");
        int shortSide= input.nextInt();
        System.out.println("Please enter long side");
        int longSide= input.nextInt();

        int fieldOfLenght = shortSide*longSide;
        int circumferenceLength= 2*shortSide+2*longSide;
        System.out.println("fieldOfLenght = " + fieldOfLenght);
        System.out.println("circumferenceLength = " + circumferenceLength);

    }
}
