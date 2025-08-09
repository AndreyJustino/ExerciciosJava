package services;

public interface Payment {

    double getInterestRate();
    double getFeePercentage();

    //calcular parcelas
    default double installment(double valueTotal, int numberMonths){
        return valueTotal * getInterestRate() / 100.0 * numberMonths;
    };

    default double paymentFee(double amount) {
        return amount * getFeePercentage() / 100.0;
    }
}
