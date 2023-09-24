package day08replit;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;

public class CollectionsSwap {
    public static void main(String[] args) {

        LinkedList<String> colors = new LinkedList<>(Arrays.asList("mavi","kirmizi","beyaz","siyah","yesil","turuncu"));

        System.out.println(colors);
        Collections.swap(colors,0,3);
        System.out.println(colors);

    }
}
