import java.util.Objects;

public abstract class Quest implements Observer {
    private Inventory inventory;
    protected Item requiredItem;
    private final Integer requiredCount;

    public Quest(Inventory inventory, Integer requiredCount)
    {
        this.inventory = inventory;
        this.requiredCount = requiredCount;
        this.inventory.registerObserver(this);
    }

    @Override
    public void update(Item item, int count) {
        if (Objects.equals(requiredItem.getName(), item.getName()) && count >= requiredCount) {
            System.out.println("Quest completed - collected " + requiredCount + " of " + item.getName());
            this.inventory.removeObserver(this);
        }
    }
}
