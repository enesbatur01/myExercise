package day04switch;

import java.util.Scanner;

public class KütüphaneRunner {
    public static void main(String[] args) {

        Kütüphane k1 = new Kütüphane();
        Scanner input = new Scanner(System.in);
        boolean isAgain = false;


      do {
            System.out.println("Lütfen yapmak istediğiniz işlemi seçiniz...\n1) Kitap ekle...\n2) Kitapları sırala...\n3) Kitap sil...\n4) Bütün kitapları sil...");
            byte menü= input.nextByte();
            switch (menü){
                case 1 :
                    System.out.println("Eklemek istediğiniz kitap adını giriniz...");
                    String book = input.next();
                    k1.bookAdd(book);
                case 2 : k1.sortBook(); break;
                case 3 :
                    System.out.println("Lütfen silmek istediğiniz kitabı seçiniz...");
                    for (int i = 0; i < k1.kütüphanem.size(); i++) {
                        System.out.println(i+") "+k1.kütüphanem.get(i));
                    }
                    int idx = input.nextInt();
                    k1.deleteBook(idx);
                    break;
                case 4: k1.clearLibary();
                    System.out.println("Kütüphane içindeki bütün kitaplar silindi..."); break;
            }
          System.out.println("1) Ana Menü\n2) Çıkış");
            byte num = input.nextByte();
            if (num==1){
                isAgain = true ;

            } else if (num==2) {
                isAgain= false;
                System.out.println("İyi günler dileriz...");
            }else System.out.println("Lütfen geçerli bir işlem seçiniz...");
      }while (isAgain==true);




    }
}
