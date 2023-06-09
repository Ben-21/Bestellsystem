import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class ProductRepoTest {


    @Test
    void returnProduct(){
        String inputName = "Toaster";

        Product tv = new Product("1", "TV");
        Product toast = new Product("2", "Toaster");
        List<Product> productList = new ArrayList<>();
        productList.add(tv);
        productList.add(toast);

        ProductRepo repo = new ProductRepo(productList);


        String actual = repo.getByName(inputName);
        String expected = toast.toString();

        Assertions.assertEquals(expected, actual);
    }
}