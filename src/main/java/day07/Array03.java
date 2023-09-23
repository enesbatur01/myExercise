package day07;

import java.util.ArrayList;
import java.util.Arrays;

public class Array03 {
    public static void main(String[] args) {

        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(20, 30, 25, 35, -16, 60, -100));

        int sum = 0;
        for (int w:nums){

            sum+=w;

        }
        System.out.println("Array Sayılarının ortalaması: "+sum/nums.size());

    }
}
