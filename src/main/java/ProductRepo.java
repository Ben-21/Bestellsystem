import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ProductRepo {

    private List<Product> products = new ArrayList<>();


    public ProductRepo(List<Product> products) {
        this.products = products;
    }


    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }


    public String getByName(String name) {
        Product foundProduct = null;

        for (Product product : products) {
            if (product.getName().equals(name)) {
                foundProduct = product;
                break;
            }
        }
        if (foundProduct != null) {
            return foundProduct.toString();
        } else {
            return "Product not found";
        }


    }


    @Override
    public String toString() {
        return "ProductRepo{" +
                "products=" + products +
                '}';
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ProductRepo that = (ProductRepo) o;
        return Objects.equals(products, that.products);
    }

    @Override
    public int hashCode() {
        return Objects.hash(products);
    }
}
