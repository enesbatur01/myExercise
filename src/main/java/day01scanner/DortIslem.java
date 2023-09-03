package day01scanner;

import java.util.Scanner;

public class DortIslem {
    public static void main(String[] args) {

        //Kullanicidan iki sayi alip 4 islem yapan ve islemlerin sonuclarini ekrana yazdiran kodu yaziniz

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter 2 number...\nFirst number...");
        double num1 = input.nextDouble();
        System.out.println("Second number...");
        double num2= input.nextDouble();

        double resultSum=num1+num2;
        double resultMinus=num1-num2;
        double resultMultiply=num1*num2;
        double resultDivided=num1/num2;

        System.out.println("resultSum = " + resultSum);
        System.out.println("resultMinus = " + resultMinus);
        System.out.println("resultMultiply = " + resultMultiply);
        System.out.println("resultDivided = " + resultDivided);


    }
}
