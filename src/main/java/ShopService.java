import java.util.List;
import java.util.Scanner;

public class ShopService {

    private ProductRepo productRepo;
    private OrderRepo orderRepo;


    public ShopService(ProductRepo productRepo, OrderRepo orderRepo) {
        this.productRepo = productRepo;
        this.orderRepo = orderRepo;
    }

    public Product getProduct(String id) {

        return productRepo.getById(id);
    }

    public List<Product> listProducts() {
        return productRepo.list();
    }

    public Order getOrder(String id) {
        return orderRepo.getById(id);
    }

    public List<Order> listOrder() {
        return orderRepo.list();
    }


    public void addOrder(List<Product> productList) {

        int sizeOfOrderRepo =  orderRepo.list().size();
        int calculateIndex = sizeOfOrderRepo + 1;
        String newOrderId = "OR"+"2023"+"-"+calculateIndex;

        Order newOrder = new Order(newOrderId, productList);
        orderRepo.add(newOrder);


//        System.out.println("Available Products: ");
//        System.out.println();
//        System.out.println("Please type the product ID you want to add.");
//
//        Scanner scanner = new Scanner(System.in);
//        String firstProductId = scanner.nextLine();




    }


}
