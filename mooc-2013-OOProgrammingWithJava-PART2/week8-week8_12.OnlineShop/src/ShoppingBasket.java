
import java.util.HashMap;
import java.util.Map;

/*
 * Author: Justin Webster, https://github.com/JustinWebster
 */
/**
 *
 * @author spike
 */
public class ShoppingBasket {

    private Map<String, Purchase> basket;

    public ShoppingBasket() {
        basket = new HashMap<String,Purchase>();
    }

    public void add(String product, int price) {
        
        Purchase buying = new Purchase(product, 1, price);
                if(basket.containsKey(product)){
                    buying = basket.get(product);
                    buying.increaseAmount();
                    basket.replace(product, buying);
                }else{
                basket.put(product, buying);
                }


    }

    public int price() {
        int totalPrice = 0;
        for (String p : basket.keySet()) {
            Purchase purchase = basket.get(p);
            totalPrice += purchase.price();
            
        }
        return totalPrice;
    }

    public void print() {

        for (String p : basket.keySet()) {
            System.out.println(basket.get(p));
        }

    }
}
