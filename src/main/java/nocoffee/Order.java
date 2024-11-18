package nocoffee;

public class Order {
    private IBeverage beverage;
    private IVoucher voucher;

    public Order() {}

    public Order(IBeverage beverage, IVoucher voucher) {
        this.beverage = beverage;
        this.voucher = voucher;
    }

    public void setBeverage(IBeverage beverage) {
        this.beverage = beverage;
    }

    public void setVoucher(IVoucher voucher) {
        this.voucher = voucher;
    }

    public Float calculatePrice(){
        Float price = beverage.calculatePrice();
        if (voucher != null){
            price = price * (1 - voucher.getDiscountPercent());
        }
        return price;
    }
}
