package Entrega.Compass.Emoticons;

import java.util.Scanner;

public class Emoticons {

    public static void main(String[] args){

        int count=0;
        Scanner scan=new Scanner(System.in);
        System.out.println("Digite a frase para analise");
        String setence=scan.next();
        count+=ProcessString.countToken(setence,")");
        count-=ProcessString.countToken(setence,"(");
        ProcessString.printFelling(count);

        scan.close();
}
}
