import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Product {

    private String productName;
    private int productWeight;
    private int productPrice;

    public Product(String productName, int productPrice, int productWeight) {
        this.productName = productName;
        this.productPrice = productPrice;
        this.productWeight = productWeight;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        if (productName == null || productName.isEmpty()) {
            throw new IllegalArgumentException("Заполните карточку товара полностью.");
        } else {
            this.productName = productName;
        }
    }

    public int getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(int productPrice) {
        if (productPrice <= 0) {
            throw new IllegalArgumentException("Заполните карточку товара полностью.");
        } else {
            this.productPrice = productPrice;
        }
    }

    public int getProductWeight() {
        return productWeight;
    }

    public void setProductWeight(int productWeight) {
        if (productWeight <= 0) {
            this.productWeight = 1;
        } else {
            this.productWeight = productWeight;
        }
    }

    public static Integer recipeCost (Product... products ) {
        Integer cost = 0;
        for (Product product: products) {
            cost += product.getProductPrice();
        }
        return cost;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        if (productName.equals(product.productName)) {
            throw new IllegalArgumentException("Добавлен одинаковый товар");
        }
        return Objects.equals(productName, product.productName) && Objects.equals(productPrice,
                product.productPrice) && Objects.equals(productWeight, product.productWeight);
    }

    @Override
    public int hashCode() {
        return Objects.hash(productName, productPrice, productWeight);
    }

    @Override
    public String toString() {
        return "Наименование продукта " + productName + '\'' +
                ", цена " + productPrice + "руб. " + '\'' +
                ", вес " + productWeight + "кг" + '\'' + "\n";
    }

     /*HashSet<Product> products = new HashSet<>();
        products.add(apple);
        products.add(banana);
        products.add(biff);
        products.add(bread);
        products.add(butter);
        products.add(candy);
        products.add(carrot);
        products.add(cheese);
        products.add(chicken);
        products.add(cookies);
        products.add(egg);
        products.add(pineapple);
        products.add(potato);
        products.add(sausage);
        products.add(tomato);

        System.out.println(products);*/

}


