package day02stringmanipulation;

public class DeleteE {
    public static void main(String[] args) {
        String s = "Learn EJava earn 12345678 money";
        s=s.replaceAll("[e,E]","");
        System.out.println(s);

    }
}
