package Entrega.Compass.Bonus;

import java.util.InputMismatchException;
import java.util.Scanner;

public class RegisterEmployee {
    public static void main(String[] args){
        createEmployee createEmployee= new createEmployee();
        Scanner scan=new Scanner(System.in);
        int quantityEmployee;
        System.out.println("Quantos funcionários você quer cadastrar?");
        try {
            quantityEmployee=scan.nextInt();
            if(quantityEmployee<=0)
                throw new InputMismatchException();}
        catch (InputMismatchException e) {
            System.out.println("Quantidade de funcionários não pode ser negativa, tente novamente.");
            quantityEmployee=scan.nextInt();
        }
        finally {
            scan.nextLine();
        }
        Employee[] employeeList = new Employee[quantityEmployee];
        for(int k=0;k<quantityEmployee;k++){
            createEmployee.scanEmployee(employeeList,k);
        }
        for(int k=0;k<quantityEmployee;k++){
            System.out.println(employeeList[k].toString());
        }

        scan.close();
    }

}
