import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Product {

    private String productName;
    private String productPrice;
    private String productWeight;

    public Product(String productName, String productPrice, String productWeight) {
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

    public String getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(String productPrice) {
        if (productPrice == null || productPrice.isEmpty()) {
            throw new IllegalArgumentException("Заполните карточку товара полностью.");
        } else {
            this.productPrice = productPrice;
        }
    }

    public String getProductWeight() {
        return productWeight;
    }

    public void setProductWeight(String productWeight) {
        if (productWeight == null || productWeight.isEmpty()) {
            throw new IllegalArgumentException("Заполните карточку товара полностью.");
        } else {
            this.productWeight = productWeight;
        }}


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
        return "Product{" +
                "Наименование продукта " + productName + '\'' +
                ", цена " + productPrice + '\'' +
                ", вес " + productWeight + '\'' + "\n" +
                '}';
    }

    public static void info() {


        Product banana = new Product("Бфнан", "59 руб.", "1 кг");
        Product pineapple = new Product("Ананас", "138 руб.", "1 кг");
        Product apple = new Product("Яблоко", "72 руб.", "1 кг");
        Product egg = new Product("Яйцо куриное", "68 руб.", "1 кг");
        Product biff = new Product("Говядина, вырезка", "570 руб.", "1 кг");
        Product sausage = new Product("Сосиски свиные", "354 руб.", "1 кг");
        Product cheese = new Product("Сыр", "553 руб.", "1 кг");
        Product cookies = new Product("Печенье", "187 руб.", "1 кг");
        Product butter = new Product("Масло сливочное", "400 руб.", "1 кг");
        Product bread = new Product("Холеб", "118 руб.", "1 кг");
        Product carrot = new Product("Морковь", "43 руб.", "1 кг");
        Product potato = new Product("Картофель", "25 руб.", "1 кг");
        Product candy = new Product("Конфеты шоколадные", "465 руб.", "1 кг");
        Product chicken = new Product("Курица, бедро", "350 руб.", "1 кг");
        Product tomato = new Product("Томаты", "160 руб.", "1 кг");

        Set<Product> products = new HashSet<>();
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

        System.out.println(products);

        Set<Recipe> recipes = new HashSet<>();
        Recipe chicken1 = new Recipe("", "", cheese, cheese, potato, egg, pineapple);
        System.out.println(chicken1);
    }
    }


