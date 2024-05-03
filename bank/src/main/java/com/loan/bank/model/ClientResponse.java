package com.loan.bank.model;

import java.util.ArrayList;
import java.util.List;

public class ClientResponse {

    private String customer;
    private List<LoanModel> loans;

    public ClientResponse (String customer){
        loans = new ArrayList<>();
        this.customer = customer;
    }
    public void addLoan(LoanModel loan){
        loans.add(loan);
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public List<LoanModel> getLoans() {
        return loans;
    }

    public void setLoans(List<LoanModel> loans) {
        this.loans = loans;
    }
}
