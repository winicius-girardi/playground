package teste.login;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int quantityUsers = LoginController.usernames.length;
        ArrayList<Users> users = new ArrayList<>();
        for (int k = 0; k < quantityUsers; k++) {
            users.add(new Users(LoginController.usernames[k],LoginController.passwords[k]));
        }
        PrinterLogin.initialMsg();
        String a,b;
        a= scan.next();
        b=scan.next();
        Users test = new Users(a,b);
        if(LoginController.checkLogin(users,test))
            PrinterLogin.checkHour(LocalTime.now());
        else PrinterLogin.errorLogin();
        scan.close();
    }
}
