public class AMain {
    public static void main(String[] args) {

        BProduct productA = new BProduct(1, "masło", 12, 14);
        BProduct productB = new BProduct(2, "piwo", 10, 7);
        BProduct productC = new BProduct(3, "ser", 5, 3);
        BProduct productD = new BProduct(4, "szynka", 15, 4);

        CCart cart = new CCart();

        cart.addProduct(productB, 2);
        cart.addProduct(productC, 1);

        cart.addProduct(productC, 2);
        cart.removeProduct(productC,3);

        int result = cart.getTotalQuantity();
        System.out.println("=> Liczba produktów w koszyku wynosi: " + result);

        double price = cart.getTotalPrice();
        System.out.println("=> Cena produktów w koszyku wynosi: " + price);

        System.out.printf("=> Liczba różnych towarów w koszyku: " + cart.getOrder().size());
    }
}