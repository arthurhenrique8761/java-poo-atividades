import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

import java.util.Scanner;
import java.util.Locale;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Program {

    public static void main(String[] args) {

        // TERMINAR

        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("- Enter Client Data -");
        System.out.print("Name: ");
        String name = sc.next();
        System.out.print("Email: ");
        String email = sc.next();
        System.out.print("Birth date (DD/MM/YYYY): ");
        String d01 = sc.next();
        LocalDate birthDate = LocalDate.parse(d01, fmt1);

        Client client = new Client(name, email, birthDate);

        System.out.println("\n- Enter order data -");
        System.out.print("Status: ");
        OrderStatus status = OrderStatus.valueOf(sc.next().toUpperCase());

        Order order = new Order(LocalDate.now(), status, client);

        System.out.print("How many items to this order?: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter " + (i+1) + "# item data");

            System.out.print("Product name: ");
            String productName = sc.next();
            System.out.print("Product price: ");
            double productPrice = sc.nextDouble();
            System.out.print("Quantity: ");
            int productQuantity = sc.nextInt();

            // essa porra fica no escopo do for
            Product product = new Product(productName, productPrice);

            // essa porra tambem fica no escopo do for
            OrderItem item = new OrderItem(productQuantity, productPrice, product);

            order.addItem(item);
        }

        System.out.println("\n- ORDER SUMARY -");
        System.out.println("Order moment: " + order.getMoment().format(fmt1));
        System.out.println("Order status: " + order.getOrderStatus());
        System.out.println("Client: " + order.getClient().getName() + " (" + order.getClient().getBirthDate().format(fmt1) + ") - " + order.getClient().getEmail());
        System.out.println("Order items: ");
        System.out.println(order.orderSumary()); // volta o endereço de memoria ao invez no produto


        sc.close();
    }
}
