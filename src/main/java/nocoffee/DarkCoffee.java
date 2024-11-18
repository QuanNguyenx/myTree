package nocoffee;

public class DarkCoffee implements IBeverage {
    private String desc = "DarkCoffee";
    private Float price = 20F;

    public DarkCoffee(){}
    public DarkCoffee(String desc, Float price){
        this.desc = desc;
        this.price = price;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    @Override
    public String getDescription() {
        return this.desc;
    }

    @Override
    public Float calculatePrice() {
        return this.price;
    }
}
