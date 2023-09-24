package day08replit;

import java.util.*;

public class PrintTreeSetToDescendingIteratorReverse {
    public static void main(String[] args) {

        TreeSet<String> colors = new TreeSet<>(Arrays.asList("yesil","sari","mavi","turuncu","kirmizi"));

        System.out.println("Orginal TreeSet Elements: "+colors);

        Iterator<String> myItr = colors.descendingIterator();

        while(myItr.hasNext()){
            System.out.println(myItr.next());
        }

    }
}
