package day05.AtmAPP;

public class AtmRunner{
    public static void main(String[] args) {
        UserService uService = new UserService();
        Menu uMenu= new Menu();

        uService.login();
        if (uService.isValidLogin){
            uMenu.userMenu();
        }


    }
}
