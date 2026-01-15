package ClassObject.Level2;

class CartItem {
    String itemName;
    double price;
    int quantity;

    void addItem(int qty) {
        quantity += qty;
    }

    void removeItem(int qty) {
        if (qty <= quantity)
            quantity -= qty;
        else
            System.out.println("Not enough items");
    }

    void displayTotalCost() {
        System.out.println("Total Cost: " + (price * quantity));
    }

    public static void main(String[] args) {
        CartItem c = new CartItem();
        c.itemName = "Notebook";
        c.price = 50;
        c.quantity = 2;

        c.addItem(3);
        c.removeItem(1);
        c.displayTotalCost();
    }
}
