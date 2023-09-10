package day05.AtmAPP;

public class User {
    private String password="123456";
    private String cardNum="1234567891234567";

    private double bakiye = 1000;

    public String getPassword() {
        return password;
    }

    public String getCardNum() {
        return cardNum;
    }

    public double getBakiye() {
        return bakiye;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setBakiye(double bakiye) {
        this.bakiye = bakiye;
    }
}
