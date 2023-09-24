package day08replit;

import java.util.Scanner;

public class Seducele {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen ay giriniz");
        int month = input.nextInt();
        System.out.println("Lütfen yıl giriniz");
        int year = input.nextInt();

        switch (month){

            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println(year+" yılı "+month+".ay 30 gündür"); break;
            case 2: if (year%4==0){
                System.out.println(year+" yılı "+month+".ay 29 gündür"); break;
            } else {System.out.println(year+" yılı "+month+".ay 28 gündür"); break;}

            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:System.out.println(year+" yılı "+month+".ay 31 gündür"); break;
            default:
                System.out.println("Lütfen geçerli bir ay giriniz..."); break;





        }

    }
}
