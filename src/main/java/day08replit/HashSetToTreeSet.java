package day08replit;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashSetToTreeSet {
    public static void main(String[] args) {

        HashSet<String> colors =new HashSet<>(Arrays.asList("sari","mavi","yesil","turuncu","kirmizi"));

        Set<String> newColors= new TreeSet<>(colors);

        for (String w:newColors) {
            System.out.println(w);
        }

    }
}
