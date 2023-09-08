package day04switch;

import java.util.ArrayList;
import java.util.Scanner;

public class List {
    /* TASK :
   Bir integer list oluşturunuz ve bu list’deki tum sayıların karesinin
   toplamını bulan code create ediniz.
    */

    ArrayList <Integer> nums = new ArrayList<Integer>();
    private int sum=0;

    public void add(){
        Scanner input = new Scanner(System.in);
       boolean isAdd =false ;
       int i = 0;

       do {
           System.out.println("Lütfen sayı giriniz...");
           int num= input.nextInt();
           nums.add(num);
           System.out.println("1) Sayı ekle\n2) Karesini bul");
           byte addOrExit= input.nextByte();
           if (addOrExit==1){
               isAdd=true;
           } else if (addOrExit==2) {
               isAdd=false;

           }else System.out.println("Lütfen geçerli bir işlem seçiniz...");

       }while(isAdd==true);

        }
        public void karesi(){

        for (int w:nums){
            sum+=w*w;

        }
            System.out.println("Sayılarınızın karesinin toplamı = " + sum);

    }


}
