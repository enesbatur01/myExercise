package day06;

public class TicketCalculate extends TicketApp {


    public double calculate(byte sehirSecim) {


        double totalPrice;
        switch (sehirSecim) {

            case 1:
                totalPrice = cityB * kmUnitPrice;
                break;
            case 2:
                totalPrice = cityC * kmUnitPrice;
                break;
            case 3:
                totalPrice = cityD * kmUnitPrice;
                break;
            case 0:
                return isAgain = 1;

            default:
                System.out.println("Lütfen geçerli bir işlem seçiniz...");
                totalPrice = 0;
                break;


        }
        return totalPrice;

    }

    public double discount(double totalprice, byte age) {

        if (age < 12) {
            totalprice /= 2;
        } else if (age > 12 && age < 24) {
            totalprice = totalprice - (totalprice / 100 * 10);
        } else if (age > 65) {
            totalprice = totalprice - (totalprice / 100 * 30);
        } else ;

        return totalprice;

    }

    public double recipeDiscount (double ticketrecipe,double ticketprice){
        ticketprice*=2;
       return ticketprice=ticketprice-(ticketprice/100*20);
    }


}
