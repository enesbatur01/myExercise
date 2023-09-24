package day08replit;

import java.util.Arrays;
import java.util.TreeSet;

public class PrintFirstAndLastElementOfTreeSet {
    public static void main(String[] args) {

        TreeSet<String> colors = new TreeSet<>(Arrays.asList("sari","mavi","yesil","kirmizi","turuncu","pembe"));
        System.out.println("Orjinal Tree: "+colors);

        System.out.println("First Eelement: "+colors.first()+"\nLast Element: "+colors.last());

    }
}
