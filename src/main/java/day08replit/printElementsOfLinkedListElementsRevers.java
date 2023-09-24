package day08replit;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.ListIterator;

public class printElementsOfLinkedListElementsRevers {
    public static void main(String[] args) {

        LinkedList<String> colors = new LinkedList<>(Arrays.asList("sari","mavi","yesil","kirmizi","beyaz","mor"));
        ListIterator<String> myItr= colors.listIterator();

        while(myItr.hasNext()){
            myItr.next();
        }

        while (myItr.hasPrevious()){
            System.out.println(myItr.previous());
        }

    }
}
