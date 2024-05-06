package Entrega.Compass.Bonus;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EmployeeHandler {

    private Scanner scan=new Scanner(System.in);
    private int quantity;


    public int getQuantity() {
        return quantity;
    }

    public EmployeeHandler(){
        System.out.println("Bem vindo ao cadastro de funcionários!");
        quantity=getQuantityEmployee();
    }

    public void createVector(Employee[] employees){
        for(int k=0;k<quantity;k++){
            scanEmployee(employees,k);
        }
    }
    public int getQuantityEmployee(){
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
        return quantityEmployee;
    }

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



    public void printVector(Employee[] employees){
        for(Employee employee:employees){
            System.out.println(employee.toString());
        }
    }

}
