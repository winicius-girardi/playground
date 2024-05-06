package Entrega.Compass.Login;

import java.util.ArrayList;
import java.util.Scanner;

public  class LoginController {
    private Scanner scan= new Scanner(System.in);

    public static boolean checkLogin(ArrayList<Users> users,Users loginAttempt){
        for (Users i: users){
            if (i.checkUser(loginAttempt))
                return true;
        }
        return false;


    }
    public Users getLogin(){

        String a,b;
        try {
            System.out.println("TELA DE LOGIN\n" +
                    "USUÁRIO:");
            a = scan.nextLine();
            if(a==null||a.trim().isEmpty())
                throw new NullPointerException();
        }
        catch (NullPointerException e){
            System.out.println("Usuário não pode ser nulo.\nDigite um usuário válido.\n");
            a=scan.nextLine();
        }
        try {
            System.out.println("SENHA:");
            b = scan.nextLine();
            if(b==null||b.trim().isEmpty())
                throw new NullPointerException();}
        catch (NullPointerException e){
            System.out.println("Senha não pode ser nula.\nDigite uma senha válida.\n");
            b=scan.nextLine();
        }
        return new Users(a,b);

    }



}
