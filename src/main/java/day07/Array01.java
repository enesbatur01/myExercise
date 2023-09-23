package day07;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Array01 {
    public static void main(String[] args) {

        List<Integer> nums= new ArrayList<>(Arrays.asList(1232, 1134,2345,1022));
        ArrayList<String> str= new ArrayList<>(Arrays.asList("Java", "Python", "PHP", "C#", "C Programming", "C++"));

        nums.sort(Integer::compareTo);
        str.sort(String::compareTo);

        System.out.println(nums+"\n"+str);

    }
}
