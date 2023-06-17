package org.example.random.idea1;

import java.util.*;

class Grocery {
    String fruit;
    double price;
    double total;

    Grocery(String fruit, double price, double total) {
        this.fruit = fruit;
        this.price = price;
        this.total = total;
    }
}

class Node {
    String fruit;
    int count;

    Node(String fruit, int count) {
        this.fruit = fruit;
        this.count = count;
    }
}

abstract class GroceryReceiptBase {
    private Map<String, Double> prices;
    private Map<String, Integer> discounts;

    public GroceryReceiptBase(Map<String, Double> prices, Map<String, Integer> discounts) {
        this.prices = prices;
        this.discounts = discounts;
    }

    public abstract List<Grocery> calculate(List<Node> shoppingList);

    public Map<String, Double> getPrices() {
        return prices;
    }

    public Map<String, Integer> getDiscounts() {
        return discounts;
    }
}

class GroceryReceipt extends GroceryReceiptBase {
    public GroceryReceipt(Map<String, Double> prices, Map<String, Integer> discounts) {
        super(prices, discounts);
    }

    public List<Grocery> calculate(List<Node> shoppingList) {
//        List<Grocery> items = new ArrayList<>();
//
//        for(int i = 0; i < shoppinglist.size(); i++){
//            Iterator<Node> item= shoppinglist.listIterator();
//            System.out.println("--> "+item.next().count+"-- "+item.next().fruit);
//        }
//
//        shoppinglist.forEach(e -> System.out.println("->>> "+e.fruit+" <> "+e.count));
//
//        for(Node item: shoppinglist){
//            System.out.println("[ "+item.fruit+" , "+item.count+" ]");
//        }
        List<Grocery> invoice = new ArrayList<>();

        Map<String, Integer> itemCounts = new HashMap<>();

        for (Node item : shoppingList) {
            String fruit = item.fruit;
            int count = item.count;

            if (itemCounts.containsKey(fruit)) {
                itemCounts.put(fruit, itemCounts.get(fruit) + count);
            } else {
                itemCounts.put(fruit, count);
            }
        }

        for (Map.Entry<String, Integer> entry : itemCounts.entrySet()) {
            String fruit = entry.getKey();
            int count = entry.getValue();

            double price = getPrices().getOrDefault(fruit, 0.0);
            int discount = getDiscounts().getOrDefault(fruit, 0);

            double total = (count * price) - ((count * price * discount) / 100.0);

            invoice.add(new Grocery(fruit, price, total));
        }

        Collections.sort(invoice, Comparator.comparing(g -> g.fruit));
        return invoice;
    }
}

public class testMain {
    public static void main(String[] args) {
        Map<String, Double> prices = new HashMap<>();
        prices.put("Apple", 1.0);
        prices.put("Banana", 0.5);
        prices.put("Orange", 1.2);

        Map<String, Integer> discounts = new HashMap<>();
        discounts.put("Apple", 10);
        discounts.put("Banana", 5);

        List<Node> shoppingList = new ArrayList<>();
        shoppingList.add(new Node("Apple", 3));
        shoppingList.add(new Node("Banana", 5));
        shoppingList.add(new Node("Orange", 2));
        shoppingList.add(new Node("Apple", 2)); // Adding 2 more Apples

        GroceryReceipt groceryReceipt = new GroceryReceipt(prices, discounts);
        List<Grocery> invoice = groceryReceipt.calculate(shoppingList);

        for (Grocery item : invoice) {
            System.out.println(item.fruit + ", Price: " + item.price + ", Total: " + item.total);
        }
    }
}
