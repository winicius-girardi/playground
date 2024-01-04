package Entrega.Compass.Palindromo;

import java.util.Scanner;

public class Palindromo {

    private String setence;
    public Palindromo(String setence){
        this.setence=setence.toLowerCase();
    }
    public boolean checkPalindromo(){
        String[] aux=this.setence.split("");

        for(int k=0,i= aux.length-1;i>=0;i--,k++){
            if(aux[i].compareTo(aux[k])!=0)
                return false;
        }
        return true;
    }



}
