package Entrega.Compass.Emoticons;

public class ProcessString {


    public static int countToken(String setence,String token){
        String[] a= setence.split(":-");

        int count=0;
        for(String i:a){
           if(i.indexOf(token)==0)
               count++;
        }
        return count;

//        for(String i:a)
//            System.out.println("\t"+i+"\tToken"+token);
//        if (a.length==1){
//            if(a[0].equals(token))
//                return 1;
//            return 0;
//        }
//        else if (a.length==0)
//                return 0;
//
//        return a.length-1;
    }
    public static void printFelling(int count){
        if(count>0)
            System.out.println("Saida: divertido");
        else if (count<0)
            System.out.println("Saida: chateado");
        else
            System.out.println("Saida: neutro");

    }



}
