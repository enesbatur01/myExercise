package day08replit;

public class PascalPiramid {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            int deger = 1;
            for (int j = 0; j < 5 - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print(deger + " ");
                deger = deger * (i - k) / (k + 1);
            }
            System.out.println();
        }

    }
}
