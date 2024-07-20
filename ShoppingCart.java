import java.util.ArrayList;
import java.util.Arrays;

class ShoppingCarts{
    int cardID;
    String customerName;
    double totalPrice;
    ArrayList<String> productList = new ArrayList<>(Arrays.asList());
    ArrayList<Double> priceList= new ArrayList<>(Arrays.asList());

    public void addItem(String item, double price){
        productList.add(item);
        priceList.add(price);
    }

    public  void removeItem(int item_index){
        productList.remove(item_index);
        priceList.remove(item_index);
    }

    public void totalPrice(){
        for (int i = 0; i <=priceList.size()-1; i++) {
            totalPrice += priceList.get(i);
        }
        System.out.println("Total Price: $" + totalPrice);
    }

    public void printDetails(){
        System.out.println("Product List" + this.productList);
        System.out.println("Price List: " + this.priceList);
        System.out.println("Cart ID: " + this.cardID);
        System.out.println("Customer Name: " + this.customerName);
    }
}

public class ShoppingCart {
    public static void main(String[] args) {
        ShoppingCarts sc = new ShoppingCarts();
        sc.cardID = 230185;
        sc.customerName = "Diwas Bk";
        sc.addItem("Keyboard", 90);
        sc.addItem("Mouse", 30);
        sc.addItem("Monitor", 500);
        sc.addItem("Pendrive", 50);
        sc.removeItem(3);
        sc.printDetails();
        sc.totalPrice();
        
    }
}