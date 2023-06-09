import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class OrderRepoTest {

    @Test
    void returnOrderById(){
        String input = "OR20230001";

        Product tv = new Product("1", "TV");
        Product toast = new Product("2", "Toaster");
        Product ball = new Product("3", "Ball");
        List<Product> productList1 = new ArrayList<>();
        productList1.add(tv);
        productList1.add(toast);

        Order order1 = new Order("OR20230001", productList1);


//        OrderRepo orderRepo = new OrderRepo();


//        String actual = orderRepo.getById(input);
//        String expected = orderRepo.toString();



    }


}
