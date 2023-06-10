import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class OrderRepo {


    //FIELDS
    private List<Order> orders;


//CONSTRUCTOR
    public OrderRepo(List<Order> orders) {
        this.orders = orders;
    }


//METHODS
    public Order getById(String id) {
       Order foundOrder = null;

        for (Order order : orders) {
            if (order.getId().equals(id)) {
                foundOrder = order;
                break;
            }
        }
        if (foundOrder == null) {
            System.out.println("Order not found");
        }
        return foundOrder;
    }


    public List<Order> list() {
        return orders;
    }


    public void add(Order order){
        orders.add(order);
    }


    //FIELD OPERATIONS
    @Override
    public String toString() {
        return "OrderRepo{" +
                "orders=" + orders +
                '}';
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrderRepo orderRepo = (OrderRepo) o;
        return Objects.equals(orders, orderRepo.orders);
    }


    @Override
    public int hashCode() {
        return Objects.hash(orders);
    }
}
