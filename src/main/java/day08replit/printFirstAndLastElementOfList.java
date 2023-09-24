package day08replit;

import java.util.Arrays;

import java.util.LinkedList;
import java.util.ListIterator;

public class printFirstAndLastElementOfList {
    public static void main(String[] args) {

        LinkedList<String> colors = new LinkedList<>(Arrays.asList("sari","mavi","turuncu","siyah","yesil","beyaz"));

        ListIterator<String> myItr= colors.listIterator();

        if (myItr.hasNext()){
            System.out.println(myItr.next());
        }

        while(myItr.hasNext()){
        myItr.next();
        }
        if (myItr.hasPrevious()){
            System.out.println(myItr.previous());
        }


    }
}
