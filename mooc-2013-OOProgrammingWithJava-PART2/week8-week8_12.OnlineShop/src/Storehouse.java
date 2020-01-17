
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*
 * Author: Justin Webster, https://github.com/JustinWebster
 */
public class Storehouse{

    private Map<String, Integer> prodPrice;
    private Map<String, Integer> prodStock;

    public Storehouse() {
        prodPrice = new HashMap<String, Integer>();
        prodStock = new HashMap<String, Integer>();
    }

    public void addProduct(String itemName, int price, int stock) {

        prodPrice.put(itemName, price);
        prodStock.put(itemName, stock);

    }

    public int price(String product) {
        if (prodPrice.containsKey(product)) {

            return prodPrice.get(product);

        } else {
            return -99;
        }
    }

    public int stock(String product) {
        if (prodStock.containsKey(product)) {
            return prodStock.get(product);
        } else {
            return 0;
        }

    }

    public boolean take(String product) {
        if (prodStock.containsKey(product) && prodStock.get(product) > 0) {
            prodStock.replace(product, prodStock.get(product) - 1);
            return true;
        } else {
            return false;
        }
    }

    public Set<String> products() {
        return prodPrice.keySet();
    }

}
