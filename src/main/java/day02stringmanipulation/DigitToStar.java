package day02stringmanipulation;

public class DigitToStar {
    public static void main(String[] args) {
        //Ornek 1: "s" String'indeki bütün rakamları * a çeviriniz
        String s = "Lea654rn Ja5va ea345rn 123678 mo34ney";
        s=s.replaceAll("[0-9]","*");
        System.out.println(s);

    }
}
