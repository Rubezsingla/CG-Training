package Staticfinal;

public class ShoppingCartSystem {
    public static void main(String[] args) {
        Product p1 = new Product(50,20,"Kitkat",123456);
        if(p1.checkInstance(p1)){
            p1.calculatePrice();
        }
        else{
            System.out.println("not object of product class");
        }

        Product.updateDiscount(20);
        p1.calculatePrice();
    }
}

class Product{
    static int discount=10;
    String productName;
    int price;
    int quantity;
    final  double productId;
    static void  updateDiscount(int  newDiscount){
        discount=newDiscount;
    }

    Product(int price,int quantity,String productName,double productId){
        this.price=price;
        this.quantity=quantity;
        this.productId=productId;
        this.productName=productName;
    }
    void calculatePrice(){
        int totalPrice=price*quantity;
        int discountPrice=totalPrice -(discount*totalPrice)/100;
        System.out.println(discountPrice);
    }
    boolean checkInstance(Object A){
        return A instanceof Product;
    }


}
