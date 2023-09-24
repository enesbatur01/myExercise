package day08replit;

public class FindInArrayEvenAndSingle {
    public static void main(String[] args) {

        int arr [] = {1,2,3,4,5,6,7,8,9};
        int even=0;
        int single = 0;


        for (int w:arr){

            if (w%2==0){
                even++;
            }else {single++;}

        }

        System.out.println("Tek Sayilar: "+single+"\nCift Sayilar: "+even);

    }
}
