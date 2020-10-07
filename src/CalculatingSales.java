import java.util.ArrayList;

public class CalculatingSales {

    public enum Product {
        Product1(2.98f),
        Product2(4.50f),
        Product3(9.98f),
        Product4(4.49f),
        Product5(6.87f);

        private float value;


        Product(float newValue) {
            value = newValue;
        }

        public float getValue() {
            return value;
        }
    }

    @Override
    public String toString() {
        return "Product: " + product + " Price: " + product.value + " Quantity: " + count + " Summ: " + (count * product.value);
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    private int count;
    private Product product;

    public CalculatingSales(Product Product, int count) {
        product = Product;
        this.count = count;
    }


    public static void main(String[] args) {
        ArrayList<CalculatingSales> sales = new ArrayList<CalculatingSales>();
        sales.add((new CalculatingSales(Product.Product1, 3)));
        sales.add((new CalculatingSales(Product.Product2, 6)));
        sales.add((new CalculatingSales(Product.Product3, 2)));
        sales.add((new CalculatingSales(Product.Product4, 7)));

        for (CalculatingSales user : sales
        ) {
            System.out.println(user);
        }
        float total = 0;
        for (CalculatingSales user : sales
        ) {
            total += user.count * user.getProduct().getValue();

        }
        System.out.println("TOTAL: " + total);
    }
}

