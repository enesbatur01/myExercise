package day05.AtmAPP;

import java.util.Scanner;

public class Validation {

    User user = new User();
    public Boolean isValidCardNum(String cardNum){
       return user.getCardNum().equals(cardNum);
    }
    public boolean isValidPassword(String pwd){
        return user.getPassword().equals(pwd);
    }

}
