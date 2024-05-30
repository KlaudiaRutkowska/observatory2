import java.util.ArrayList;
import java.util.HashMap;

public class Inventory implements Subject {
    private HashMap<Item, Integer> items;
    private ArrayList<Observer> observers;

    public Inventory() {
        items = new HashMap<>();
        observers = new ArrayList<>();
    }

    public void addItem(Item item) {
        items.put(item, items.getOrDefault(item, 0) + 1);

        System.out.println("Added item to inventory: " + item.getName() + ", the current count is: " + items.get(item));

        notifyObservers(item, items.get(item));
    }

    public void removeItem(Item item) {
        if(items.containsKey(item) && items.get(item) > 0) {
            items.put(item, items.get(item) - 1);

            System.out.println("Removed item from inventory: " + item.getName() + ", the current count is: " + items.get(item));

            notifyObservers(item, items.get(item));
        }
    }

    @Override
    public void notifyObservers(Item item, int count) {
        for (int i = 0; i < observers.size(); i++) {
            observers.get(i).update(item, count);
        }
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }
}
