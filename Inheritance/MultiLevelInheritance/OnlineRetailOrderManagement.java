package Inheritance.MultiLevelInheritance;

import java.util.Date;

public class OnlineRetailOrderManagement {
    public static void main(String[] args) {

        Order o1 = new Order(12, new Date());
        o1.getOrderStatus();

        ShippedOrder o2 = new ShippedOrder(13, new Date(), 56789);
        o2.getOrderStatus();

        DeliveredOrder o3 = new DeliveredOrder(14, new Date(), 98765, new Date());
        o3.getOrderStatus();
    }
}

class Order{
    int orderId;
    Date orderDate;

    Order(int orderId,Date orderDate){
        this.orderId=orderId;
        this.orderDate=orderDate;
    }

    void getOrderStatus(){
        System.out.println("order placed");
    }

}

class ShippedOrder extends Order{
    int trackingNumber;
    ShippedOrder(int orderId,Date orderDate,int trackingNumber){
        super(orderId,orderDate);
        this.trackingNumber=trackingNumber;
    }

    void getOrderStatus(){
        System.out.println("order shipped");
    }
}

class DeliveredOrder extends ShippedOrder{
    Date DeliveryDate;
    DeliveredOrder(int orderId,Date orderDate,int trackingNumber,Date DeliveryDate){
        super(orderId,orderDate,trackingNumber);
        this.DeliveryDate=DeliveryDate;
    }

    void getOrderStatus(){
        System.out.println("order delivered");
    }
}
