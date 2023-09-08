package day04switch;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Kütüphane {


    /*
        - Bir kütüphane yönetimi uygulaması geliştiriyorsunuz.
        - Kullanıcılar, kütüphaneye yeni kitap ekleyebilmeli, kitapları sıralayabilmeli ve
        - kitapları kütüphaneden silebilmelidir.
        - Ayrıca, kullanıcılara kütüphaneyi tamamen sıfırlama seçeneği de sunmanız isteniyor.
        */

    ArrayList<String> kütüphanem=new ArrayList<String>();

    public void bookAdd(String book){

            kütüphanem.add(book);

    }
    public void sortBook(){
        if (!kütüphanem.isEmpty()){
        Collections.sort(kütüphanem);
        System.out.println(kütüphanem);
        }else System.out.println("Hata!!! Kütüphanede sıralanacak kitap bulunamadı...");
    }

    public void deleteBook (int idx) {
        kütüphanem.remove(idx);
    }
    public void clearLibary(){
        kütüphanem.clear();
    }




}
