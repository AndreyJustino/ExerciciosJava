package entities;

public class Funcionario {
    private Integer id;
    private String name;
    private Float balance;

    public Funcionario(Integer id, String name, Float balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Float getBalance() {
        return balance;
    }

    public void setBalance(Float balance) {
        this.balance = balance;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void increase(Float percentage){
        setBalance(((getBalance() * percentage) / 100) + getBalance());
    }

    @Override
    public String toString() {
        return "Funcionario {" +
                "id = " + id +
                ", name = '" + name + '\'' +
                ", balance = " + balance +
                '}';
    }
}
