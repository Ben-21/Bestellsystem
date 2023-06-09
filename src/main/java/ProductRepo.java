import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ProductRepo {

    private List<Product> products = new ArrayList<>();


    public ProductRepo(List<Product> products) {
        this.products = products;
    }







    public Product getByName(String name) {
        Product foundProduct = null;

        for (Product product : products) {
            if (product.getName().equals(name)) {
                foundProduct = product;
                break;
            }
        }
        if (foundProduct == null) {
            System.out.println("Product not found");
        }
        return foundProduct;
    }
    public Product getById(String id) {
        Product foundProduct = null;

        for (Product product : products) {
            if (product.getId().equals(id)) {
                foundProduct = product;
                break;
            }
        }
        if (foundProduct == null) {
            System.out.println("Product not found");
        }
        return foundProduct;
    }


    public List<Product> list(){
        return products;
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
