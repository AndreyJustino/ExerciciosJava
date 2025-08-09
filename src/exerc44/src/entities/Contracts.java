package entities;

import services.Payment;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Contracts {
    private int numberContract;
    private LocalDate date;
    private double totalValue;

    private List<Installment> installmentList = new ArrayList<>();

    public Contracts() {
    }

    public Contracts(int numberContract, LocalDate date, double totalValue) {
        this.numberContract = numberContract;
        this.date = date;
        this.totalValue = totalValue;
    }

    public int getNumberContract() {
        return numberContract;
    }

    public void setNumberContract(int numberContract) {
        this.numberContract = numberContract;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public double getTotalValue() {
        return totalValue;
    }

    public void setTotalValue(double totalValue) {
        this.totalValue = totalValue;
    }

    public List<Installment> getInstallmentList() {
        return installmentList;
    }

    public void addInstallment(Installment installment) {
        installmentList.add(installment);
    }

    public void removeInstallment(Installment installment) {
        installmentList.remove(installment);
    }
}
