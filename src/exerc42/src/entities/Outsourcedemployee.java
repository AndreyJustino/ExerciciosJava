package entities;

public class Outsourcedemployee extends Employee{
    private Double additionalCharge;

    public Outsourcedemployee() {
        super();
    }

    public Outsourcedemployee(String name, Integer hours, Double valuePerHour, Double additionalCharge) {
        super(name, hours, valuePerHour);
        this.additionalCharge = additionalCharge;
    }

    @Override
    public Double payment(){
        //Double result = (this.valuePerHour * this.hours) + (1.1 * additionalCharge);
        Double result = super.payment() + 1.1 * additionalCharge;

        return result;
    }

}
