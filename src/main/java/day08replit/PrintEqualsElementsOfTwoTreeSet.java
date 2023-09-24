package day08replit;

import java.util.Arrays;
import java.util.TreeSet;

public class PrintEqualsElementsOfTwoTreeSet {
    public static void main(String[] args) {

        TreeSet<String> colors1= new TreeSet<>(Arrays.asList("mavi","yesil","kirmizi","sari"));
        TreeSet<String> colors2= new TreeSet<>(Arrays.asList("yesil","mavi","pembe","turuncu"));

        for (String w :colors1){
            if (colors2.contains(w)){
                System.out.println("yes");
            }else System.out.println("no");
        }

    }
}
