package day08replit;

import java.util.Arrays;
import java.util.TreeSet;

public class PrintElementsAndSizeOfTreeSet {
    public static void main(String[] args) {
        TreeSet<String> colors= new TreeSet<>(Arrays.asList("yesil","sari","mavi","kirmizi","pembe"));

        System.out.println("Orginal TreeSet: "+colors+"\nTreeSet Element Size: "+colors.size());

    }


}
