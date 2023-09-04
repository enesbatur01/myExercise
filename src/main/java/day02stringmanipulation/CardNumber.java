package day02stringmanipulation;

public class CardNumber {
    public static void main(String[] args) {
        //verilen kredi kartı numarasında son 4 dışındaki bütün rakamları  "*" a çeviriniz "
        String cardNum = "1234 5678 9123 4567";
        cardNum=cardNum.substring(0,14).replaceAll("[0-9]","*")+cardNum.substring(14);
        System.out.println("cardNum = " + cardNum);
    }
}
