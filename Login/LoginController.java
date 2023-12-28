package teste.login;

import java.util.ArrayList;
public  class LoginController {
    final static String[] usernames={"jao","kleber","penaldo","luisito","neymar"};
    final static String[] passwords={"123","321","messi","gremi0","cs"};

    public static boolean checkLogin(ArrayList<Users> users,Users loginAttempt){
        for (Users i: users){
            if (i.equals(loginAttempt))
                return true;
        }
        return false;


    }
}
