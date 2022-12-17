import java.util.Objects;

public class Product {

    private String productName;
    private String productPrice;
    private String productWeight;

    public Product(String productName, String productPrice, String productWeight) {
        this.productName = productName;
        this.productPrice = productPrice;
        this.productWeight = productWeight;
    }

    public String theSame() {
        if (productName == productName) {
            throw new IllegalArgumentException("Этот товар уже есть в списке");
        }
        return
                this.productName;
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

    }


