package session14;

import java.util.*;

public class ShoppingCart{
    private List<String> shoppingCart;
    private static LinkedHashMap<String, Integer> frequentlyBothList = new LinkedHashMap<>();

    ShoppingCart(){
        shoppingCart = new ArrayList<>();
    }
    public void addItem(String item){
        shoppingCart.add(item);
    }

    public List<String> seeItemsInCart(){
        return shoppingCart;
    }

    public void clearItemsInCart(){
        shoppingCart.clear();
    }

    public void buy(){
        if (shoppingCart.isEmpty()) return;
        for (String item: shoppingCart){
            if (frequentlyBothList.containsKey(item)){
                //After some research this merge does the if/else statement too, but I kept it like that.
                frequentlyBothList.merge(item, 1, Integer::sum);
            }else {
                frequentlyBothList.put(item, 1);
            }
        }
        clearItemsInCart();
    }

    public static LinkedHashMap<String, Integer> bought(){
        return frequentlyBothList;
    }

    public static void frequentyBoth() {
        //I asked gpt for help here, i couldn't figure out a way of sorting
        // linkedHashMap elements in reverse order based on value.
        List<Map.Entry<String, Integer>> entries = new ArrayList<>(frequentlyBothList.entrySet());
        entries.sort((e1, e2) -> e2.getValue().compareTo(e1.getValue()));

        int topFrequentyBouth = 3;
        for (int i = 0; i < topFrequentyBouth; i++) {
            Map.Entry<String, Integer> entry = entries.get(i);
            System.out.print(entry.getKey()+ ",");
        }
    }

    @Override
    public String toString(){
        return shoppingCart.toString();
    }
}

class Magazine{
    static void main(String[] args) {
        ShoppingCart userItemsCart = new ShoppingCart();
        ShoppingCart userItemsCart1 = new ShoppingCart();

        userItemsCart.addItem("19238");
        userItemsCart.addItem("38471");
        userItemsCart.addItem("38471");
        userItemsCart.addItem("38471");
        userItemsCart.addItem("19238");
        userItemsCart.addItem("19238");
        userItemsCart.addItem("19238");
        userItemsCart.addItem("19238");
        System.out.println("First user items in shopping cart before buy: " + userItemsCart.seeItemsInCart());
        userItemsCart1.addItem("44381");
        userItemsCart1.addItem("44381");
        userItemsCart1.addItem("85721");
        userItemsCart1.addItem("44381");
        userItemsCart1.addItem("85721");
        userItemsCart1.addItem("85721");
        userItemsCart1.addItem("38471");
        System.out.println("Second user items in shopping cart before buy: " + userItemsCart1.seeItemsInCart());

        userItemsCart.buy();
        userItemsCart1.buy();
        System.out.println("Bought " + ShoppingCart.bought());
        System.out.println("First user items in shopping cart after buy: " + userItemsCart.seeItemsInCart());
        System.out.println("Second user items in shopping cart after buy: " + userItemsCart1.seeItemsInCart());
        System.out.println("Bought " + ShoppingCart.bought());
        System.out.print("Frequent both: ");
        ShoppingCart.frequentyBoth();

    }
}