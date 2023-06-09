import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class ShopServiceTest {


    @Test
    void returnProductById(){
        //GIVEN
        String inputId = "3";
        Product tv = new Product("1", "TV");
        Product toast = new Product("2", "Toaster");
        Product ball = new Product("3", "Ball");

        List<Product> productList1 = new ArrayList<>();
        productList1.add(tv);
        productList1.add(toast);
        ProductRepo productRepo = new ProductRepo(productList1);

        List<Product> productList2 = new ArrayList<>();
        productList1.add(ball);

        Order order1 = new Order("OR20230001", productList1);
        Order order2 = new Order("OR20230002", productList2);

        List<Order> orderList = new ArrayList<>();
        orderList.add(order1);
        orderList.add(order2);
        OrderRepo orderRepo = new OrderRepo(orderList);

        ShopService shopService = new ShopService(productRepo, orderRepo);


        //WHEN
        Product actualProduct = shopService.getProduct(inputId);

        //THEN
        Assertions.assertEquals(ball, actualProduct);
    }

    @Test
    void returnListOfProducts(){
        //GIVEN

        Product tv = new Product("1", "TV");
        Product toast = new Product("2", "Toaster");
        Product ball = new Product("3", "Ball");

        List<Product> productList1 = new ArrayList<>();
        productList1.add(tv);
        productList1.add(toast);
        ProductRepo productRepo = new ProductRepo(productList1);

        List<Product> productList2 = new ArrayList<>();
        productList1.add(ball);

        Order order1 = new Order("OR20230001", productList1);
        Order order2 = new Order("OR20230002", productList2);

        List<Order> orderList = new ArrayList<>();
        orderList.add(order1);
        orderList.add(order2);
        OrderRepo orderRepo = new OrderRepo(orderList);

        ShopService shopService = new ShopService(productRepo, orderRepo);


        //WHEN
        List<Product> actualProductList = shopService.listProducts();

        //THEN
        Assertions.assertEquals(productList1,actualProductList );
    }


    @Test
    void returnOrderById(){
        //GIVEN
        String inputId = "OR20230002";
        Product tv = new Product("1", "TV");
        Product toast = new Product("2", "Toaster");
        Product ball = new Product("3", "Ball");

        List<Product> productList1 = new ArrayList<>();
        productList1.add(tv);
        productList1.add(toast);
        ProductRepo productRepo = new ProductRepo(productList1);

        List<Product> productList2 = new ArrayList<>();
        productList1.add(ball);

        Order order1 = new Order("OR20230001", productList1);
        Order order2 = new Order("OR20230002", productList2);

        List<Order> orderList = new ArrayList<>();
        orderList.add(order1);
        orderList.add(order2);
        OrderRepo orderRepo = new OrderRepo(orderList);

        ShopService shopService = new ShopService(productRepo, orderRepo);

        //WHEN
        Order actualOrder = shopService.getOrder(inputId);

        //THEN
        Assertions.assertEquals(order2, actualOrder);
    }


    @Test void returnListOfOrders(){
        //GIVEN

        Product tv = new Product("1", "TV");
        Product toast = new Product("2", "Toaster");
        Product ball = new Product("3", "Ball");

        List<Product> productList1 = new ArrayList<>();
        productList1.add(tv);
        productList1.add(toast);
        ProductRepo productRepo = new ProductRepo(productList1);

        List<Product> productList2 = new ArrayList<>();
        productList1.add(ball);

        Order order1 = new Order("OR20230001", productList1);
        Order order2 = new Order("OR20230002", productList2);

        List<Order> orderList = new ArrayList<>();
        orderList.add(order1);
        orderList.add(order2);
        OrderRepo orderRepo = new OrderRepo(orderList);

        ShopService shopService = new ShopService(productRepo, orderRepo);


        //WHEN
        List<Order> actualOrderList = shopService.listOrder();

        //THEN
        Assertions.assertEquals(orderList, actualOrderList);
    }


}
