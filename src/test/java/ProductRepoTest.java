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
        Product tv = new Product("1", "TV");
        Product toast = new Product("2", "Toaster");
        List<Product> productList = new ArrayList<>();
        productList.add(tv);
        productList.add(toast);

        ProductRepo repo = new ProductRepo(productList);

        List<Product> actual = repo.list();
        List<Product> expected = productList;

        Assertions.assertEquals(expected, actual);

    }
}
