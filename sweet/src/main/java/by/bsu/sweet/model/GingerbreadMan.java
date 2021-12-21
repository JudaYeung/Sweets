package by.bsu.sweet.model;

public class GingerbreadMan extends AbstractSweet{

    private String quality;


    public GingerbreadMan(String name, double price, double weight, String quality) {
        super(name, price, weight);
        this.quality = quality;
    }

    public String getQuality() {
        return quality;
    }
}
