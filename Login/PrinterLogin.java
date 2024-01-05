package Entrega.Compass.Login;


import java.time.LocalTime;
public class PrinterLogin {


    public static void checkHour(LocalTime time){
        int hour =time.getHour();
        if(hour<=5)
            PrinterLogin.msgLoginDawn();
        else if (hour<=11)
            PrinterLogin.msgLoginMorning();
        else if(hour<=17)
            PrinterLogin.msgLoginAfternoon();
        else
            PrinterLogin.msgLoginNight();

    }
    public static void msgLoginMorning(){
        System.out.println("Bom dia, você se logou ao nosso sistema.");
    }
    public static void msgLoginAfternoon(){
            System.out.println("Boa tarde, você se logou ao nosso sistema.");
    }
    public static void msgLoginNight(){
        System.out.println("Boa noite, você se logou ao nosso sistema.");
    }
    public static void msgLoginDawn(){
        System.out.println("Boa madrugada, você se logou ao nosso sistema.");
    }
    public static void errorLogin(){
        System.out.println("Usuário e/ou senha incorretos.");
    }

}


