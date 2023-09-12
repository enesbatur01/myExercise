package day06;

import java.util.Scanner;

public class TicketApp {
    Scanner input;
    String name;
    byte sehirSecim;
    byte age;
    int cityB = 500;
    int cityC = 700;
    int cityD = 900;

    double kmUnitPrice = 0.10;

    byte isAgain=0;

    byte ticketRecipe;
    TicketCalculate ticketCalculate;

    /*
    A şehrinden uçmak isteyen bir yolcu B şehrine 500km C şehrine  700km  D şehrine  900 km mesafededir.
    Bilet tarifesi:
    km birim fiyati : 0.10$
    yolcu 12 yasindan kucukse toplam fiyat %50 indirim,
    12 ve 24 yas arasindaysa 10% indirim,
    65 yasindan buyukse 30% indirim,
    bilet gidis donus alinirrsa 20% indirim uygulayan bi app create ediniz
 */
    public void start() {
        ticketCalculate = new TicketCalculate();
        double totalPrice;

        do {

            input = new Scanner(System.in);
            System.out.println("=== BATUR TRUZİM ===\nLütfen Ad-Soyad giriniz...");

            name = input.nextLine();

            System.out.println("Lütfen yaşınızı giriniz...");
            age = input.nextByte();

            System.out.println("Lütfen gitmek istediğiniz şehri seçiniz...\n1) B şehri\n2) C şehri\n3) D şehri\n0) Ana Menü");
            sehirSecim = input.nextByte();

            totalPrice = ticketCalculate.calculate(sehirSecim);
            System.out.println(totalPrice);

        } while (totalPrice == 1);

        totalPrice = ticketCalculate.discount(totalPrice, age);
        System.out.println(totalPrice);
        do {


        System.out.println("Lütfen bilet tarifesini seçiniz...\n1) Tek yön\n2) Çift yön\n0) Ana menü");
        ticketRecipe= input.nextByte();
        if (ticketRecipe==2) {
            totalPrice = ticketCalculate.recipeDiscount(ticketRecipe,totalPrice);
            System.out.println(totalPrice);
        } else if (ticketRecipe==1) {
            totalPrice = totalPrice;
        }else System.out.println("Lütfen geçerli bir tarife seçiniz...");
    }while (ticketRecipe==0);
    TicketPrint printer=new TicketPrint();
    printer.ticketPrinter(name,age,ticketRecipe,totalPrice);
}

}
