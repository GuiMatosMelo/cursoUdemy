package application;

import entities.Order;
import entities.OrderStatus;

import java.util.Date;

public class Program {
    public static void main(String[] args) {
        System.out.println("hello world!!");
        System.out.println("");

        Order order = new Order(1080,new Date(), OrderStatus.PENDING_PAYMENT);
        System.out.println(order);

        OrderStatus os1 = OrderStatus.DELIVERED;
        OrderStatus os2 = OrderStatus.valueOf("DELIVERED");


        System.out.println(os2);

    }
}
