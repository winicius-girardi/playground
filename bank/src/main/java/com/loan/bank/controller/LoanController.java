package com.loan.bank.controller;


import com.loan.bank.model.ClientModel;
import com.loan.bank.model.ClientResponse;
import com.loan.bank.service.LoanService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoanController {


    private final LoanService loanService;


    public LoanController(LoanService loanService) {
        this.loanService = loanService;
    }

    @PutMapping("/customer-loans")
    public ResponseEntity<ClientResponse> getAvaliableLoans(@RequestBody ClientModel clientModel) {
        var aux = loanService.processClient(clientModel);
        return ResponseEntity.ok(aux);
    }




}
