package services;

import entities.Contracts;
import entities.Installment;


public class ContractService {
    private Payment payment;

    public ContractService(Payment payment){
        this.payment = payment;
    }

    public void processContract(Contracts contract, int months){
        double value = contract.getTotalValue() / months;

        for (int i = 1; i <= months; i++) {
            double valueInterest = value + payment.installment(value, i);
            double valueTax = valueInterest + payment.paymentFee(valueInterest);

            contract.addInstallment(new Installment( contract.getDate().plusMonths(i), valueTax) );
        }
    }
}
