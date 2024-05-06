package Entrega.Compass.Bonus;

import java.util.Locale;

public class Employee {
    private String name;
    private double salary;
    private double bonus;

    public Employee(String name,double salary){
        this.name=name;
        this.salary=salary;
        this.setBonus();
    }

    public double getSalary() {
        return salary;
    }
    public void setBonus() {
        Locale.setDefault(Locale.US);
        if(getSalary()<=1000)
            this.bonus=getSalary()*0.20;
        else if(getSalary()<=2000)
            this.bonus=getSalary()*0.10;
        else
            this.bonus=-getSalary()*0.10;
    }
    public double realSalary(){
        return this.salary+this.bonus;
    }

    @Override
    public String toString() {
        if(this.bonus<0)
            return "\n\nFuncionario:" +this.name +"\nSalário: "+ this.salary+"\nDesconto: "+this.bonus+"\n\nSalário Liquido: "+this.realSalary()+"\n\n";
        return "\n\nFuncionario:" +this.name +"\nSalário: "+ this.salary+"\nBonus: "+this.bonus+"\n\nSalário Liquido: "+this.realSalary()+"\n\n";
    }
}
