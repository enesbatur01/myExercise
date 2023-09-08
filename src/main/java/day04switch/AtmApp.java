package day04switch;

import java.util.Scanner;



public class AtmApp {
    private int bakiye = 1000;

    public void AppIslem() {
        Scanner input = new Scanner(System.in);
        boolean menu1=false;


        do {
            System.out.println("Lütfen işleminizi seçiniz...\n1)Bakiye gör...\n2)Para yatır...\n3)Para çekme");
            byte num = input.nextByte();

        switch (num) {
            case 1:
                System.out.println(bakiye); break;
            case 2:
                System.out.println("Lütfen yatırmak istediğiniz tutarı giriniz...");
                int yatırma = input.nextInt();
                bakiye += yatırma;
                System.out.println("Toplam bakiyeniz : "+bakiye);
                break;
            case 3:
                System.out.println("Lütfen çekmek istediğiniz tutarı giriniz...");
                int çekme = input.nextInt();
                if (çekme > bakiye)
                {
                    System.out.println("Yetersiz bakiye..."); break;
                }else bakiye -=çekme;

                System.out.println("Kalan bakiyeniz : "+bakiye); break ;
            default:
                System.out.println("Lütfen geçerli bir işlem seçiniz..."); break;

        }
        System.out.println("1) Ana menüye dönmek\n2) Çıkış");
        byte menuSecim= input.nextByte();

        if (menuSecim==1){
            menu1=true;
        } else if (menuSecim==2) {
            menu1=false;
            System.out.println("İyi günler dileriz...");

        } else {
            System.out.println("Lütfen geçerli bir işlem seçiniz...");
        }
    }while (menu1==true);




    }


}
