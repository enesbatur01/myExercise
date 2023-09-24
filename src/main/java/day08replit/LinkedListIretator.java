package day08replit;

import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListIretator {
    public static void main(String[] args) {

        LinkedList<String> colors= new LinkedList<>(Arrays.asList("sari","beyaz","mavi","yesil","turuncu"));

        Iterator<String> myItr= colors.iterator();

        while (myItr.hasNext()){
            System.out.println(myItr.next());
        }

    }
}
