package Entrega.Compass.Bonus;


public class RegisterEmployee {
    public static void main(String[] args){


        EmployeeHandler EmployeeHandler = new EmployeeHandler();
        Employee[] employeeList = new Employee[EmployeeHandler.getQuantity()];
        EmployeeHandler.createVector(employeeList);
        EmployeeHandler.printVector(employeeList);
    }

}
