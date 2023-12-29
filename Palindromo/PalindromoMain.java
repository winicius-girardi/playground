package Entrega.Compass.Palindromo;

import java.util.Scanner;

public class PalindromoMain {

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite a palavra para checagem:");
        Palindromo palindromo= new Palindromo(scan.next());
        System.out.println(palindromo.checkPalindromo());

    }

}
