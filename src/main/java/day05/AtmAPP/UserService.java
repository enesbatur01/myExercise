package day05.AtmAPP;

import java.util.Scanner;

public class UserService {

    Validation Validation = new Validation();
    boolean isValidLogin = false;
    static Scanner input ;
    public void login() {

            do { System.out.println("===BATUR BANK===\nHoş Geldiniz");
                 input = new Scanner(System.in);

            System.out.println("Lütfen 16 haneli kart numaranızı giriniz...");
            String cardLogin = input.nextLine().replaceAll(" ","");

            System.out.println("Lütfen şifrenizi giriniz...");
            String passwordLogin = input.next();

            boolean isValidCard = Validation.isValidCardNum(cardLogin);
            boolean isValidPass = Validation.isValidPassword(passwordLogin);

            if (isValidCard && isValidPass) {
                System.out.println("Giriş Başarılı");
                isValidLogin = true;
            } else if (!isValidCard) {
                System.out.println("Geçersiz kart numarası, Lütfen bilgileirnizi kontrol edin ve tekrar deneyin...");
                isValidLogin = false;
            } else if (!isValidPass) {
                System.out.println("Geçersiz şifre, Lütfen bilgileirnizi kontrol edin ve tekrar deneyin...");
                isValidLogin = false;
            }

        } while (!isValidLogin);

    }


}
