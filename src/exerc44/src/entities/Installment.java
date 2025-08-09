package entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

//boleto
public class Installment {
    private LocalDate date;
    private double value;

    public Installment() {
    }

    public Installment(LocalDate date, double value) {
        this.date = date;
        this.value = value;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        return String.format("%s - %.2f", formatter.format(date), value);
    }
}
