package day08replit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindSecondGreaterNum {
    public static void main(String[] args) {

        List<Integer> arr= new ArrayList<>(Arrays.asList(1232,2345,5467,678,3454,2312,3451));

        arr.sort(Integer::compareTo);

        System.out.println(arr.get(arr.size()-2));



    }
}
