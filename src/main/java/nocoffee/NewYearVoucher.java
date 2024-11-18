package nocoffee;

public class NewYearVoucher implements IVoucher {
    private Float discountPercent;
    private String name;

    public NewYearVoucher() {
    }

    public NewYearVoucher(Float discountPercent, String name) {
        this.discountPercent = discountPercent;
        this.name = name;
    }

    @Override
    public Float getDiscountPercent() {
        return this.discountPercent;
    }

    @Override
    public String getName() {
        return this.name;
    }
}
