package day08replit;

import com.sun.source.tree.Tree;

import java.util.Arrays;
import java.util.TreeSet;

public class PirintElementsOfTreeSet {
    public static void main(String[] args) {

        TreeSet<String> colors = new TreeSet<>(Arrays.asList("yesil","mavi","kirmizi","sari","beyaz","siyah"));

        for (String w :colors){
            System.out.println(w);
        }

    }
}
