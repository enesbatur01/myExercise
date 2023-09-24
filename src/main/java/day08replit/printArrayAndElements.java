package day08replit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class printArrayAndElements {
    public static void main(String[] args) {
        List<String> colors = new ArrayList<>(Arrays.asList("siyah","mavi","kirmizi","yesil","mor","turuncu"));

        System.out.println(colors);

        for (String w :colors){

            System.out.println(w);

        }
    }

}
