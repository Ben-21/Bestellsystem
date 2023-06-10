import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class ProductRepoTest {


    @Test
    void returnProductByName() {
        //GIVEN
        String inputName = "Toaster";

        Product tv = new Product("1", "TV");
        Product toast = new Product("2", "Toaster");
        List<Product> productList = new ArrayList<>();
        productList.add(tv);
        productList.add(toast);

        ProductRepo repo = new ProductRepo(productList);

        //WHEN
        Product actual = repo.getByName(inputName);

        //THEN
        Product expected = toast;

        Assertions.assertEquals(expected, actual);
    }


    @Test
    void returnProductById() {
        //GIVEN
        String inputId = "1";

        Product tv = new Product("1", "TV");
        Product toast = new Product("2", "Toaster");
        List<Product> productList = new ArrayList<>();
        productList.add(tv);
        productList.add(toast);

        ProductRepo repo = new ProductRepo(productList);

        //WHEN
        Product actual = repo.getById(inputId);

        //THEN
        Product expected = tv;

        Assertions.assertEquals(expected, actual);
    }


    @Test
    void returnListOfAllProducts() {
        //GIVEN
        Product tv = new Product("1", "TV");
        Product toast = new Product("2", "Toaster");
        List<Product> productList = new ArrayList<>();
        productList.add(tv);
        productList.add(toast);

        ProductRepo repo = new ProductRepo(productList);

        //WHEN
        List<Product> actual = repo.list();

        //THEN
        Assertions.assertEquals(productList, actual);
    }
}
