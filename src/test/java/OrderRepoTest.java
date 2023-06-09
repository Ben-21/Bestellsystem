import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class OrderRepoTest {

    @Test
    void returnOrderById() {
        //GIVEN
        String input = "OR20230002";

        Product tv = new Product("1", "TV");
        Product toast = new Product("2", "Toaster");
        Product ball = new Product("3", "Ball");
        List<Product> productList1 = new ArrayList<>();
        productList1.add(tv);
        productList1.add(toast);
        List<Product> productList2 = new ArrayList<>();
        productList1.add(ball);

        Order order1 = new Order("OR20230001", productList1);
        Order order2 = new Order("OR20230002", productList2);

        List<Order> orderList = new ArrayList<>();
        orderList.add(order1);
        orderList.add(order2);

        OrderRepo orderRepo = new OrderRepo(orderList);


        //WHEN
        Order actual = orderRepo.getById(input);


        //THEN
        Assertions.assertEquals(order2, actual);
    }


    @Test
    void returnListOfAllOrders(){
        //GIVEN
        Product tv = new Product("1", "TV");
        Product toast = new Product("2", "Toaster");
        Product ball = new Product("3", "Ball");
        List<Product> productList1 = new ArrayList<>();
        productList1.add(tv);
        productList1.add(toast);
        List<Product> productList2 = new ArrayList<>();
        productList1.add(ball);

        Order order1 = new Order("OR20230001", productList1);
        Order order2 = new Order("OR20230002", productList2);

        List<Order> orderList = new ArrayList<>();
        orderList.add(order1);
        orderList.add(order2);

        OrderRepo orderRepo = new OrderRepo(orderList);


        //WHEN
        List<Order> actualOrderList = orderRepo.list();


        //THEN
        Assertions.assertEquals(orderList, actualOrderList);


    }


}
