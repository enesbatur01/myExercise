package day02stringmanipulation;

public class MoneyToDollar {
    public static void main(String[] args) {
        //Ornek 1: "s" String'indeki "money" kelimesini "dollar" kelimesine ceviriniz. (Dinamik olmalı)
        String s = "Learn Java earn 12345678 money";
        s= s.replace("money","Dollar");
        System.out.println( s);

    }
}
