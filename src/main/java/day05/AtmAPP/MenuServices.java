package day05.AtmAPP;

import java.util.Scanner;

public class MenuServices {
    Scanner input = new Scanner(System.in);
    User user = new User();
    double bakiye ;
    String iban;
    boolean isValidIban= false;
    boolean isStartIban=false;
    boolean isAgainMenu=false;

    String password ;

    public void bakiyeSorgu(){
        System.out.println("Güncel bakiyeniz : "+user.getBakiye());
    }

    public void paraYatırma(){
        System.out.println("Lütfen yatırmak istediğiniz tutarı girin...");
        bakiye = input.nextDouble()+user.getBakiye();
        user.setBakiye(bakiye);
        System.out.println("Güncel bakiyeniz : "+user.getBakiye());
        System.out.println("1) Ana menü           2)Çıkış yap");
        byte menu= input.nextByte();
        switch (menu){
            case 1: isAgainMenu=true;
            case 2:
                System.out.println("İyi günler dileriz..."); break;
            default:
                System.out.println("Geçersiz işlem..."); break;
        }
    }

    public void paraCekme(){
        System.out.println("Lütfen çekmek istediğiniz tutarı girin...");
        bakiye= user.getBakiye()-input.nextDouble();
        if (user.getBakiye()>-1){
            user.setBakiye(bakiye);
            System.out.println("Güncel bakiyeniz : "+ user.getBakiye());
        } else System.out.println("Yetersiz bakiye...");

        System.out.println("1) Ana menü           2)Çıkış yap");
        byte menu= input.nextByte();
        switch (menu){
            case 1: isAgainMenu=true;
            case 2:
                System.out.println("İyi günler dileriz..."); break;
            default:
                System.out.println("Geçersiz işlem..."); break;
        }
    }
    public void paraGönderme(){
       do {
           System.out.println("Lütfen gönderim yapılacak iban adresini giriniz : ");

        iban= input.nextLine().replaceAll(" ","");
        if (iban.length()==26){
            isValidIban =!iban.substring(2,26).matches("[^0-9]");
            isStartIban= iban.startsWith("TR");
        }else System.out.println("Geçersiz Iban...");
    }while (!isStartIban&&!isStartIban);
        System.out.println("Lütfen göndermek istediğiniz tutarı giriniz...");
        bakiye = user.getBakiye()- input.nextDouble();
        if (isValidIban&&isStartIban){
            if (bakiye>-1){
                user.setBakiye(bakiye);
                System.out.println("Para başarıyla gönderildi...");
                System.out.println("Güncel bakiye : "+user.getBakiye());
            }else System.out.println("Yetersiz bakiye...");

        }
        System.out.println("1) Ana menü           2)Çıkış yap");
        byte menu= input.nextByte();
        switch (menu){
            case 1: isAgainMenu=true;
            case 2:
                System.out.println("İyi günler dileriz..."); break;
            default:
                System.out.println("Geçersiz işlem..."); break;
        }

    }
    public void sifreDegistir(){
        System.out.println("Lütfen mevcut şifrenizi giriniz...");
        password= input.next();
        boolean isValidpass = user.getPassword().equals(password);
        if (isValidpass){
            System.out.println("Lütfen yeni şifrenizi giriniz...");
            password= input.next();
            user.setPassword(password);
            System.out.println("Parola başarıyla değiştirildi...");
            System.out.println("1) Ana menü           2)Çıkış yap");
            byte menu= input.nextByte();
            switch (menu){
                case 1: isAgainMenu=true;
                case 2:
                    System.out.println("İyi günler dileriz..."); break;
                default:
                    System.out.println("Geçersiz işlem..."); break;
            }
        }else System.out.println("Parola eşleşmedi. Lütfen tekrar deneyiniz...");
        System.out.println("1) Ana menü           2)Çıkış yap");
        byte menu= input.nextByte();
        switch (menu){
            case 1: isAgainMenu=true;
            case 2:
                System.out.println("İyi günler dileriz..."); break;
            default:
                System.out.println("Geçersiz işlem..."); break;
        }

    }


}
