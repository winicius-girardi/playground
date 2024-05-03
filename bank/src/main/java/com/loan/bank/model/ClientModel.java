package com.loan.bank.model;

public class ClientModel {

    private Integer age;
    private String cpf;
    private String name;
    private Float income;
    private String location;


    public ClientModel(Integer age, String cpf, String name, Float income, String location) {
        this.age = age;
        this.cpf = cpf;
        this.name = name;
        this.income = income;
        this.location = location;
    }
    public  ClientModel() {

    }
    public String getName(){
        return name;
    }
    public Float getIncome() {
        return income;
    }
    public String getLocation() {
        return location;
    }
    public Integer getAge(){
        return age;
    }

}
