import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        //Test for shopService addOrderWithUserInput
        Product tv = new Product("1", "TV");
        Product toast = new Product("2", "Toaster");
        Product ball = new Product("3", "Ball");

        List<Product> productList1 = new ArrayList<>();
        productList1.add(tv);
        productList1.add(toast);
        ProductRepo productRepo = new ProductRepo(productList1);

        List<Product> productList2 = new ArrayList<>();
        productList1.add(ball);
        List<Product> productList3 = new ArrayList<>();
        productList3.add(toast);
        productList3.add(tv);

        Order order1 = new Order("OR2023-1", productList1);
        Order order2 = new Order("OR2023-2", productList2);

        List<Order> orderList = new ArrayList<>();
        orderList.add(order1);
        orderList.add(order2);
        OrderRepo orderRepo = new OrderRepo(orderList);

        ShopService shopService = new ShopService(productRepo, orderRepo);


        //WHEN
        shopService.addOrderWithUserInput();
    }



}
