package nocoffee;

public class Matcha implements ITopping{
    private Float price = 5F;
    private String name = "Matcha";

    public Matcha() {
    }

    @Override
    public Float getPrice() {
        return 0f;
    }

    @Override
    public String getName() {
        return "";
    }
}
