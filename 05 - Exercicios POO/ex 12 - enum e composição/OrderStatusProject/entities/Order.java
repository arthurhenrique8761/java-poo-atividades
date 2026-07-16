package entities;

import entities.enums.OrderStatus;
import java.time.LocalDate;
import java.util.ArrayList;

public class Order {

    private LocalDate moment;
    private OrderStatus status;

    // composições
    private Client client; // você instancia um objeto da classe client e põe ele como parâmetro no construtor
    private ArrayList<OrderItem> orderItemlist = new ArrayList<>();

    // construtores
    public Order() {
    }

    public Order(LocalDate moment, OrderStatus status, Client client) {
        this.moment = moment;
        this.status = status;
        this.client = client;
    }

    // metodos
    public void addItem(OrderItem item) {
        orderItemlist.add(item);
    }

    public void removeItem(OrderItem item) {
        orderItemlist.remove(item);
    }

    public Double total() {
        double total = 0;
        for (OrderItem item : orderItemlist) {
            total += item.getPrice() * item.subTotal();
        }
        return total;
    }

    // getters e setters
    public LocalDate getMoment() {
        return moment;
    }

    public void setMoment(LocalDate moment) {
        this.moment = moment;
    }

    public OrderStatus getOrderStatus() {
        return status;
    }

    public void setOrderStatus(OrderStatus status) {
        this.status = status;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public String orderSumary() {
        StringBuilder sb = new StringBuilder();
        for (OrderItem item : orderItemlist) {
            sb.append(item + ("\n"));
        }
        sb.append("Total price: $" + total());
        return sb.toString();
    }

}
