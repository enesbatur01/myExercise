package day08replit;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AddInIndex {

    public static void main(String[] args) {

        List<String> colors =new ArrayList<>(Arrays.asList("siyah","mavi","kirmizi","beyaz"));

        colors.add(0,"pembe");
        colors.add(3,"yesil");

        System.out.println(colors);

    }
}
