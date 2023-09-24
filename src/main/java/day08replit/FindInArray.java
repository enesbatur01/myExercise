package day08replit;

import java.util.Scanner;

public class FindInArray {

    public static void main(String[] args) {
        int arr[]={1551,1223,1443,1267,1789,1023,2020};
        Scanner input = new Scanner(System.in);
        System.out.println("Aranan değeri giriniz...");
        int num =input.nextInt();
        boolean resuşlt=false;
        for (int w:arr){

            resuşlt=num==w;

        }
        System.out.println(resuşlt);
    }
}
