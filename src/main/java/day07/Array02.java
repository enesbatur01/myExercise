package day07;

import java.util.ArrayList;
import java.util.Arrays;

public class Array02 {
    public static void main(String[] args) {

        ArrayList<Integer> nums=new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        int sum=0;
        for(int w :nums){
            sum+=w;

        }

        System.out.println("Array toplamı: "+sum);

    }
}
