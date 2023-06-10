import java.util.ArrayList;
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


        int sizeOfOrderRepo = orderRepo.list().size();
        int calculateIndex = sizeOfOrderRepo + 1;
        String newOrderId = "OR" + "2023" + "-" + calculateIndex;

        Order newOrder = new Order(newOrderId, productList);
        orderRepo.add(newOrder);
    }


    public void addOrderWithUserInput() {

        Scanner scanner = new Scanner(System.in);
        int sizeOfOrderRepo = orderRepo.list().size();
        int calculateIndex = sizeOfOrderRepo + 1;
        List<Product> productList = new ArrayList<>();
        String newOrderId = "OR" + "2023" + "-" + calculateIndex;
        String goOn = "y";

        System.out.println("Available Products: ");
        System.out.println();
        System.out.println(productRepo.list());
        System.out.println();
        System.out.println("Please type the product ID you want to add.");
        String productIdToAdd = scanner.nextLine();
        productList.add(productRepo.getById(productIdToAdd));

        while (goOn.equals("y")){
            System.out.println();
            System.out.println("Do you want to add another Product? Type \"y\" for yes and \"n\" for no.");
            goOn = scanner.nextLine();
            if(goOn.equals("y")){
                System.out.println("Please type the product ID you want to add.");
                productIdToAdd = scanner.nextLine();
                productList.add(productRepo.getById(productIdToAdd));
            }
            if(goOn.equals("n")){
                break;
            }
        }



        Order newOrder = new Order(newOrderId, productList);
        orderRepo.add(newOrder);
    }






}
