package Entrega.Compass.Bonus;

import java.util.Scanner;

public class RegisterEmployee {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("Quantos funcionários você quer cadastrar?");
        int quantityEmployee=scan.nextInt();
        String aux;
        Double auxDouble;
        Employee[] employeeList = new Employee[quantityEmployee];
        for(int k=0;k<quantityEmployee;k++){
            System.out.println("Nome do Funcionário:");
            aux=scan.next();
            System.out.println("Salário: ");
            auxDouble= scan.nextDouble();
            employeeList[k]= new Employee(aux,auxDouble);

        }
        for(int k=0;k<quantityEmployee;k++){
            System.out.println(employeeList[k].toString());
        }

        scan.close();
    }

}
