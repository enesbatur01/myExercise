package day05.Oyun;

import java.util.Scanner;

public class Oyun extends Contuined {
                /* Iki kisinin oynayacagi bir kelime oyunu uretelim

            Kurallar
            1- Baslangicta 1.oyuncudan bir kelime girmesini isteyin ve kelimeyi yazdirin*
            2- 1.oyuncu kelimeyi girince 2.oyuncuya kelimeyi kabul edip etmedigini sorun.
            Eger kelimeyi kabul ederse onceki oyuncuya kelimedeki harf sayisi kadar puan ekleyin
            ve 3.adima gecin
            girilen kelimeyi kabul etmezse "gecersiz kelime" yazdirin ve onceki oyuncunun
            kazandigini yazip oyunu bitirin
            *
            3- yeni oyuncuya oyuna devam etmek isteyip istemedigini sorun
            devam etmek isterse kelimeye eklemek istedigi string'i ve
            basa mi sona mi ekleyecegini sorun
            aldiginiz string'i kelimeye ekleyip 2.adima gidin
            *
            Devam etmek istemezse
            "Oyun bitti" yazin
            kullanicilarin puanlarini ve kazanan oyuncuyu yazdirin
            */
    public int player1;
    public int player2;
    public void start(){
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen kelimeyi giriniz...");
        String str1 = input.next();
        System.out.println(str1+"\nKelimeyi kabul ediyor musunuz?\n1) Evet\n2) Hayır");
        byte devamKontrol= input.nextByte();
        devam(devamKontrol);



    }


        }