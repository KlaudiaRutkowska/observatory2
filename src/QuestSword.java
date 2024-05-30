public class QuestSword extends Quest {
    public QuestSword(Inventory inventory, Integer requiredCount) {
        super(inventory, requiredCount);

        this.requiredItem = new ItemSword();
    }
}
