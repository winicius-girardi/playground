package Entrega.Compass.Bonus;

import java.util.InputMismatchException;
import java.util.Scanner;

public class createEmployee {

    private Scanner scan=new Scanner(System.in);
    public void scanEmployee (Employee[] employees,int index){
        String aux;
        double auxDouble;
        try {
            System.out.println("Nome do Funcionário:");
            aux = scan.nextLine();
            if(aux==null||aux.trim().isEmpty())
                throw new NullPointerException();
        }catch (NullPointerException e){
            System.out.println("Nome digitado eh invalido, tente novamente.");
            aux =scan.nextLine();
        }
        try {
            System.out.println("Salário: ");
            auxDouble = scan.nextDouble();
            if(auxDouble<=0)
                throw new InputMismatchException();
        }catch (InputMismatchException e){
            System.out.println("Salario não pode ser negativo, tente novamente.\n");
            auxDouble =scan.nextDouble();
        }
        finally {
            scan.nextLine();
        }
        employees[index]= new Employee(aux,auxDouble);




    }




}
