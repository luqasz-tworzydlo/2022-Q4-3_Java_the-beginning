public class DCartItem {
    private BProduct product;
    private int howMany;

    public DCartItem(BProduct product, int howMany)
    {
        this.product = product;
        this.howMany = howMany;
    }

    public BProduct getProduct()
    {
        return product;
    }
    public void setProduct(BProduct product)
    {
        this.product = product;
    }

    public int getHowMany()
    {
        return howMany;
    }
    public void setHowMany(int howMany)
    {
        this.howMany = howMany;
    }
}