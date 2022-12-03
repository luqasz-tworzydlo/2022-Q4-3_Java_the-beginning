import java.util.ArrayList;

public class CCart
{
    private ArrayList<DCartItem> order;

    CCart()
    {
        order = new ArrayList<>();
    }

    public ArrayList<DCartItem> getOrder() {
        return order;
    }

    public void addProduct(BProduct product, int amount)
    {

        if (product.getAmount() >= amount)
        {

            boolean found = false;

            for (var item : order)
            {
                if (product.getId() == item.getProduct().getId())
                {
                    item.setHowMany(item.getHowMany() + amount);
                    product.setAmount(product.getAmount() - amount);

                    found = true;
                }
            }
            if (!found)
            {
                DCartItem newItem = new DCartItem(product, amount);
                order.add(newItem);
                product.setAmount(product.getAmount() - amount);
            }
        }
    }

    public void removeProduct(BProduct product, int quantity)
    {
        // szukamy w koszyku produktu o id równym product.getId()
        // jeżeli 'quantity' < ilość tego produktu w koszyku,
        // to po prostu zmniejszamy liczbę 'howMany'
        // w przeciwnym wypadku należy usunąć z listy order cały obiekt
        // pamiętaj o zwiększeniu dostępności produktu w sklepie

        DCartItem toDelete = null;

        for(var item: order)
        {
            if (product.getId() == item.getProduct().getId())
            {
                if(item.getHowMany() > quantity)
                {
                    item.setHowMany(item.getHowMany() - quantity);
                    product.setAmount(product.getAmount() + quantity);
                }
                else
                {
                    toDelete = item;
                }
            }
        }
        if(toDelete != null)
        {
            order.remove(toDelete);
            product.setAmount(product.getAmount() + toDelete.getHowMany());
        }
    }

    public int getTotalQuantity()
    {
        int sum = 0;

        for (var item : order)
        {
            sum += item.getHowMany();
        }

        return sum;
    }

    public double getTotalPrice()
    {
        double totalPrice = 0;

        for(var item: order)
        {
            totalPrice += item.getProduct().getPrice() * item.getHowMany();
        }

        return totalPrice;
    }
}