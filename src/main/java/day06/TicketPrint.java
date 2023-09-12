package day06;

public class TicketPrint extends TicketApp{

    public void ticketPrinter(String name,byte age,byte recipe,double fiyat ){
        TicketApp ticketApp = new TicketApp();

        System.out.println
                ("*".repeat(42)+"\nAd-Soyad: "+name+"\nYaş: "+age+"\nTarife tipi: "+recipe
                        +"\nFiyat: "+fiyat+"$"+"\n=== İYİ YOLCULUKLAR DİLERİZ ===");

        System.out.println("*".repeat(42));
        System.out.println();
    }


}
