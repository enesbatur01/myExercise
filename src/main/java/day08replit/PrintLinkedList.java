package day08replit;

import java.util.Arrays;
import java.util.LinkedList;

public class PrintLinkedList {
    public static void main(String[] args) {

        LinkedList<String> colors = new LinkedList<>(Arrays.asList("sari","mavi","mor","yesil","beyaz"));

        for (String w:colors){
            System.out.println(w);
        }

    }
}
