package day05.AtmAPP;

import java.util.Scanner;

public class Menu extends MenuServices{

    public void userMenu() {
        do {


        Scanner input = new Scanner(System.in);
        System.out.println("*************** Lütfen istediğiniz işlemi seçiniz ***************" +
                "\n1) Bakiye Sorgu\n2) Para yatırma\n3) Para Çekme\n4) Para Gönderme\n5) Şifre değiştirme\n0) Çıkış");
        byte menuNum = input.nextByte();
        switch (menuNum) {
            case 1: bakiyeSorgu(); break;
            case 2: paraYatırma(); break;
            case 3: paraCekme(); break;
            case 4: paraGönderme(); break;
            case 5: sifreDegistir(); break;
            case 0:
                System.out.println("*************** İyi günler diler ***************");
                isAgainMenu=false; break;
            default:
                System.out.println("Lütfen geçerli bir işlem seçiniz..."); break;
        }
    }while(isAgainMenu);

    }
}
