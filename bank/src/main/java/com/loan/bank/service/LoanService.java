package com.loan.bank.service;


import com.loan.bank.model.ClientModel;
import com.loan.bank.model.ClientResponse;
import com.loan.bank.model.EnumType;
import com.loan.bank.model.LoanModel;
import org.springframework.stereotype.Service;

@Service
public class LoanService {
    public ClientResponse processClient(ClientModel clientModel) {

        ClientResponse clientResponse = new ClientResponse(clientModel.getName());
        if(loanPersonal(clientModel))
            clientResponse.addLoan(new LoanModel(EnumType.Type.PERSONAL,4));
        if(loanGuaranteed(clientModel))
            clientResponse.addLoan(new LoanModel(EnumType.Type.GUARANTEED,3));
        if(loanConsignment(clientModel))
            clientResponse.addLoan(new LoanModel(EnumType.Type.CONSIGNMENT,2));

        return clientResponse;
    }

    private boolean loanGuaranteed(ClientModel clientModel) {
        return clientModel.getIncome()<=3000
                || clientModel.getIncome()>=3000
                && clientModel.getIncome()<=5000
                && clientModel.getLocation().equals("SP")
                && clientModel.getAge()<30;
    }

    private boolean loanPersonal(ClientModel clientModel) {
        return clientModel.getIncome() <= 3000
                || clientModel.getIncome() <= 5000
                && clientModel.getIncome() >= 3000
                && clientModel.getLocation().equals("SP")
                && clientModel.getAge()<30;
    }

    private boolean loanConsignment(ClientModel clientModel) {
        return clientModel.getIncome()>=5000;
    }
}
