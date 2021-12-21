package by.bsu.sweet.model;

public class Darkchocolate extends AbstractSweet{
    private String DarkchocolateType;


    public Darkchocolate(String name, double price, double weight, String DarkchocolateType) {
        super(name, price, weight);
        this.DarkchocolateType = DarkchocolateType;
    }

    public String getDarkchocolateType() {
        return DarkchocolateType;
    }
}
