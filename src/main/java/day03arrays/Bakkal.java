package day03arrays;

import java.util.Scanner;

public class Bakkal {
    String gunler [] = {"Pazartesi","Salı","Çarşamba","Perşembe","Cuma","Cumartesi","Pazar"};
    double gunlukKazanc []= new double[7];
    double ortKazanc =0;
    public void getOrtalamaKazanc(){

        double ortKazancTopla =0;
        Scanner input = new Scanner(System.in);
        int i=0;
        while (i < gunlukKazanc.length) {
            System.out.println("Please enter your daily earnings");
            gunlukKazanc[i]= input.nextDouble();
            i++;
        }
        for (double w:gunlukKazanc){

            ortKazancTopla+=w ;
           ortKazanc= ortKazancTopla/gunlukKazanc.length;
        }
        System.out.println("Ortalama günlük kazanç : "+ortKazanc);

    }

    public void getOrtalamanınUstuKazanc(){
        double getOrtalamaUstu=0;
        int counter =0;
        for (double w:this.gunlukKazanc){

            if (w>this.ortKazanc){
                System.out.println("Ortalamanın üstü gün "+w +" "+gunler[counter]);

            }
            counter++;
        }



    }
    public void getOrtalamanınAltı () {
        double getOrtalamaAltı=0;
        int counter =0;
        for (double w:this.gunlukKazanc){

            if (w<this.ortKazanc){
                System.out.println("Ortalamanın Altı gün "+w +" "+gunler[counter]);

            }
            counter++;

    }
}}
