package day02stringmanipulation;

public class ReverString {
    public static void main(String[] args) {
        //Ornek 1: "s" String'ini tersine reverse methodu kullanmadan çeviriniz.
        String s = "Learn Java earn 12345678 money";
        String newS = "";
        for (int i =s.length()-1;i>0;i--) {

            newS=newS+s.charAt(i);

        }
        System.out.println(newS);
    }
}
