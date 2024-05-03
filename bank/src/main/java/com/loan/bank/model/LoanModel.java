package com.loan.bank.model;

public class LoanModel {

    private EnumType.Type type;
    private Integer interestRate;


    public LoanModel(EnumType.Type type, Integer interestRate) {
        this.type = type;
        this.interestRate = interestRate;
    }

    public EnumType.Type getType() {
        return type;
    }

    public void setType(EnumType.Type type) {
        this.type = type;
    }

    public Integer getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(Integer interestRate) {
        this.interestRate = interestRate;
    }
}
