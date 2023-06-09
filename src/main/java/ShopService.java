import java.util.List;

public class ShopService {

    private ProductRepo productRepo;
    private OrderRepo orderRepo;


    public ShopService(ProductRepo productRepo, OrderRepo orderRepo) {
        this.productRepo = productRepo;
        this.orderRepo = orderRepo;
    }

    public Product getProduct(String id){

        return productRepo.getById(id);
    }

    public List<Product> listProducts(){
        return productRepo.list();
    }

}
