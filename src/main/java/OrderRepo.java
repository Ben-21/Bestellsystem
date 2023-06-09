import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class OrderRepo {

    private List<Order> orders = new ArrayList<>();


    public OrderRepo(List<Order> orders) {
        this.orders = orders;
    }


//    public List<Order> getOrders() {
//        return orders;
//    }
//
//    public void setOrders(List<Order> orders) {
//        this.orders = orders;
//    }


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
