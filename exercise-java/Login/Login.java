package Entrega.Compass.Login;

import java.time.LocalTime;
import java.util.ArrayList;

public class Login {

    public static void main(String[] args) {

        int quantityUsers = ValidUsers.usernames.length;
        ArrayList<Users> registeredUsers = new ArrayList<>();
        LoginController loginController = new LoginController();
        for (int k = 0; k < quantityUsers; k++) {
            registeredUsers.add(new Users(ValidUsers.usernames[k],ValidUsers.passwords[k]));
        }
        if(LoginController.checkLogin(registeredUsers,loginController.getLogin()))
            PrinterLogin.checkHour(LocalTime.now());
        else
            PrinterLogin.errorLogin();
    }
}
